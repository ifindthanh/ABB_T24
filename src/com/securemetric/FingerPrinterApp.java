package com.securemetric;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;


public class FingerPrinterApp implements ActionListener {
    private final JFrame mainFrame = new JFrame();// creating instance of JFrame
    private final JLabel jLabelImage = new JLabel();
    private final JLabel statusBar = new JLabel("Vui lòng quẹt vân tay");
    private int actionType;
    private String userId;
    private JButton btnAction, btnReset;
    private HU20IntegrationManagement hu20IntegrationManagement;
    
    private void init() {
        this.drawComponents();
        this.initHU20();
    }

    private void initHU20() {
        try {
            this.hu20IntegrationManagement = new HU20IntegrationManagement();
            statusBar.setText("Khởi tạo thành công, vui lòng quẹt vân tay");
            this.hu20IntegrationManagement.init();
            this.btnAction.setEnabled(true);
            jLabelImage.setIcon(new ImageIcon(hu20IntegrationManagement.getImg1gray()));
        } catch (SMVNException ex) {
            this.statusBar.setText(ex.printError());
            this.jLabelImage.setIcon(new ImageIcon("resources/default.png"));
        }
    }
    
    private void drawComponents() {
        JPanel imageContainer = new JPanel();
        
        this.jLabelImage.setVisible(true);
        this.jLabelImage.setSize(300, 400);
        this.jLabelImage.setBackground(Color.ORANGE);
        
        this.jLabelImage.setIcon(new ImageIcon("resources/default.png"));
        imageContainer.add(this.jLabelImage);// adding button in JFrame
        this.jLabelImage.setBorder(BorderFactory.createLineBorder(Color.black));
        
        
        if (this.actionType == 1) {
            this.btnAction = new JButton("Đăng ký");
        } else if (this.actionType == 2) {
            this.btnAction = new JButton("Xác thực");
        } else if (this.actionType == 3) {
            this.btnAction = new JButton("Lấy thông tin");
        } else {
            throw new RuntimeException("Action type không đúng");
        }
        this.btnAction.addActionListener(this);
        this.btnAction.setEnabled(false);
        
        this.btnReset = new JButton("Làm lại");
        this.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAction.setEnabled(false);
                try {
                    if (hu20IntegrationManagement == null || !hu20IntegrationManagement.isInitialized()) {
                        hu20IntegrationManagement = new HU20IntegrationManagement();
                    }
                    hu20IntegrationManagement.init();
                    btnAction.setEnabled(true);
                    jLabelImage.setIcon(new ImageIcon(hu20IntegrationManagement.getImg1gray()));
                } catch (SMVNException ex) {
                    statusBar.setText(ex.printError());
                    jLabelImage.setIcon(new ImageIcon("resources/default.png"));
                }
            }
        });
        JPanel buttonContainer = new JPanel();
        buttonContainer.add(btnAction);
        buttonContainer.add(btnReset);
        
        this.statusBar.setHorizontalAlignment(SwingConstants.CENTER);
        this.statusBar.setVerticalAlignment(SwingConstants.CENTER);
        this.mainFrame.add(this.statusBar, BorderLayout.NORTH);
        this.mainFrame.add(buttonContainer, BorderLayout.SOUTH);
        this.mainFrame.add(imageContainer, BorderLayout.CENTER);
        this.mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.mainFrame.setSize(600, 600);
        this.mainFrame.setVisible(true);// making the frame visible
    }
    
    public static void main(String[] args) throws IOException {
        FingerPrinterApp fingerPrinterApp = new FingerPrinterApp();
        
        if (args.length == 0) {
            throw new RuntimeException("Tham số truyền vào không hợp lệ");
        }
        int actionType = Integer.parseInt(args[0]);
        fingerPrinterApp.setActionType(actionType);
        if (actionType == 1 ) {
            if (args.length < 2) {
                throw new RuntimeException("Tham số truyền vào không hợp lệ");
            }
            fingerPrinterApp.setUserId(args[1]);
        } else if (actionType == 2 ){
            if (args.length < 1) {
                System.out.print("Tham số truyền vào không hợp lệ");
                return;
            }
        } else {
            throw new RuntimeException("Không hỗ trợ action type = 3");
        }
        
        
        fingerPrinterApp.init();
      
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        this.btnAction.setEnabled(false);
        if (this.hu20IntegrationManagement == null) {
            JOptionPane.showMessageDialog(this.mainFrame, "Đã có lỗi xảy ra");
            System.exit(0);
            return;
        }
        CentagateIntegrationService service = new CentagateIntegrationService();
        String firstFingerPrint = Base64.encodeBase64String(hu20IntegrationManagement.getImageBuffer());
        switch (this.actionType) {
            case 1:
                JOptionPane.showMessageDialog(this.mainFrame, "Vui long quet van tay lan 2");
                try {
                    hu20IntegrationManagement.init();
                    jLabelImage.setIcon(new ImageIcon(hu20IntegrationManagement.getImg1gray()));
                } catch (SMVNException e1) {
                    JOptionPane.showMessageDialog(this.mainFrame, e1.getErrorMessage());
                    System.exit(0);
                    break;
                }
                
                String secondFingerPrint = Base64.encodeBase64String(hu20IntegrationManagement.getImageBuffer());
                
                JPanel panel = new JPanel();
                JLabel label = new JLabel("Vui lòng nhập mã truy cập cho user "+this.userId+":");
                JPasswordField pass = new JPasswordField(10);
                panel.add(label);
                panel.add(pass);
                String[] options = new String[]{"OK", "Cancel"};
                int option = JOptionPane.showOptionDialog(this.mainFrame, panel, "The title",
                    JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                         null, options, options[0]);
                if(option != 0) // pressing OK button
                {
                    this.btnAction.setEnabled(true);
                    break;
                }
                System.out.println("SENDING REQUEST PLEASE WAIT");
                Map<String, String> result = service.login(this.userId, String.valueOf(pass.getPassword()), "", "", "");
                if (!"0".equals(result.get("code"))) {
                    JOptionPane.showMessageDialog(this.mainFrame, "Đã có lỗi xảy ra");
                    System.exit(0);
                    return;
                }
                System.out.println(result);
                Gson gson = new Gson(); /* GSON library */
                Map<String, String> returnValue = gson.fromJson(result.get("object"), HashMap.class);
                result = service.register(this.userId, returnValue.get("userId"), returnValue.get("authToken"), firstFingerPrint, secondFingerPrint);
                System.out.println("result = " + result);
                if ("0".equals(result.get("code"))) {
                    JOptionPane.showMessageDialog(this.mainFrame, "Đăng ký vân tay với user thành công");
                } else {
                    JOptionPane.showMessageDialog(this.mainFrame, "Có lỗi xảy ra");
                }
                
                this.mainFrame.setVisible(false);
                this.mainFrame.dispose();
                System.exit(100);
                break;
            case 2:
                result = service.authen(this.userId, firstFingerPrint);
                if ("0".equals(result.get("code"))) {
                    JOptionPane.showMessageDialog(this.mainFrame, "Xác nhận vân tay với user thành công");
                } else {
                    JOptionPane.showMessageDialog(this.mainFrame, result.get("message"));
                }
                
                /*this.mainFrame.setVisible(false);
                this.mainFrame.dispose();
                System.exit(0);*/
                break;
            default:
                break;
        }
    }

    
    public int getActionType() {
        return actionType;
    }

    
    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    
    public String getUserId() {
        return userId;
    }

    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
    
}
