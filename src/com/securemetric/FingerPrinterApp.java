package com.securemetric;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.google.gson.Gson;


public class FingerPrinterApp implements ActionListener {
    private final JFrame mainFrame = new JFrame();// creating instance of JFrame
    private final JLabel jLabelImage = new JLabel();
    private final JLabel statusBar = new JLabel("");
    private int actionType;
    private String userName;
    private HU20IntegrationManagement hu20IntegrationManagement;
    
    private void init() {
        this.drawComponents();
        this.initHU20();
    }

    private void initHU20() {
        try {
            this.hu20IntegrationManagement = new HU20IntegrationManagement();
            statusBar.setText("Please place your fingerprint in the device");
            this.hu20IntegrationManagement.init();
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
        
        System.out.println();
        
        this.jLabelImage.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("default.png")));
        imageContainer.add(this.jLabelImage);// adding button in JFrame
        this.jLabelImage.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JButton btnAction, btnReset;
        if (this.actionType == 1) {
            btnAction = new JButton("Register");
        } else if (this.actionType == 2) {
            btnAction = new JButton("Authenticate");
        } else if (this.actionType == 3) {
            btnAction = new JButton("Get information");
        } else {
            throw new RuntimeException("Action type incorrect");
        }
        btnAction.addActionListener(this);
        btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (hu20IntegrationManagement == null || !hu20IntegrationManagement.isInitialized()) {
                        hu20IntegrationManagement = new HU20IntegrationManagement();
                    }
                    statusBar.setText("Please place your fingerprint in the device");
                    hu20IntegrationManagement.init();
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
        
        
        JPanel statusContainer = new JPanel();
        JTextField userNameTxt = new JTextField();
        userNameTxt.setEnabled(false);
        userNameTxt.setText(this.userName);
        userNameTxt.setHorizontalAlignment(JTextField
            .CENTER);
        
        userNameTxt.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        userNameTxt.setDisabledTextColor(Color.BLUE);
        statusContainer.setLayout(new BoxLayout(statusContainer, BoxLayout.Y_AXIS));
        statusContainer.add(userNameTxt);
        statusContainer.add(this.statusBar);
        statusBar.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        this.mainFrame.add(statusContainer, BorderLayout.NORTH);
        this.mainFrame.add(buttonContainer, BorderLayout.SOUTH);
        this.mainFrame.add(imageContainer, BorderLayout.CENTER);
        this.mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.mainFrame.setSize(600, 600);
        this.mainFrame.setVisible(true);// making the frame visible
    }
    
    public static void main(String[] args) throws IOException {
        FingerPrinterApp fingerPrinterApp = new FingerPrinterApp();
        
        if (args.length == 0) {
            throw new RuntimeException("Input parameter is invalid");
        }
        int actionType = Integer.parseInt(args[0]);
        fingerPrinterApp.setActionType(actionType);
        if (actionType == 1 || actionType == 2 ) {
            if (args.length < 2) {
                throw new RuntimeException("Input parameter is invalid");
            }
            fingerPrinterApp.setUserId(args[1]);
        } else if (actionType != 3 ){
            throw new RuntimeException("Does not support action type = 3");
        }
        
        fingerPrinterApp.init();
      
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (this.hu20IntegrationManagement == null) {
            return;
        }
        CentagateIntegrationService service = new CentagateIntegrationService();
        String firstFingerPrint = hu20IntegrationManagement.getImageMinueu();
        switch (this.actionType) {
            case 1:
                JOptionPane.showMessageDialog(this.mainFrame, "Please scan your fingerprint once again");
                try {
                    hu20IntegrationManagement.init();
                    jLabelImage.setIcon(new ImageIcon(hu20IntegrationManagement.getImg1gray()));
                } catch (SMVNException e1) {
                    break;
                }
                
                String secondFingerPrint =hu20IntegrationManagement.getImageMinueu();
                
                JPanel panel = new JPanel();
                JLabel label = new JLabel("Please enter the userID "+this.userName+":");
                JPasswordField pass = new JPasswordField(10);
                panel.add(label);
                panel.add(pass);
                String[] options = new String[]{"OK", "Cancel"};
                int option = JOptionPane.showOptionDialog(this.mainFrame, panel, "The title",
                    JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                         null, options, options[0]);
                if(option != 0) // pressing OK button
                {
                    break;
                }
                Map<String, String> result = service.login(this.userName, String.valueOf(pass.getPassword()), "", "", "");
                if (!"0".equals(result.get("code"))) {
                    JOptionPane.showMessageDialog(this.mainFrame, result.get("message"));
                    return;
                }
                Gson gson = new Gson(); /* GSON library */
                Map<String, String> returnValue = gson.fromJson(result.get("object"), HashMap.class);
                result = service.register(this.userName, returnValue.get("userId"), returnValue.get("authToken"), returnValue.get("secretCode"), firstFingerPrint, secondFingerPrint);
                if ("0".equals(result.get("code"))) {
                    JOptionPane.showMessageDialog(this.mainFrame, "User fingerprint registration is success");
                    System.out.println("result=true;code=1;message=\"User fingerprint registration is success\"");
                } else {
                    JOptionPane.showMessageDialog(this.mainFrame, result.get("message"));
                    System.out.println("result=false;code=0;message=\""+result.get("message")+"\"");
                }
                
                this.mainFrame.setVisible(false);
                this.mainFrame.dispose();
                System.exit(100);
            case 2:
                result = service.authen(this.userName, firstFingerPrint);
                if ("0".equals(result.get("code"))) {
                    JOptionPane.showMessageDialog(this.mainFrame, "User fingerprint verification is success");
                    System.out.println("result=true;code=1;message=\"User fingerprint verification is success\"");
                } else {
                    JOptionPane.showMessageDialog(this.mainFrame, result.get("message"));
                    System.out.println("result=false;code=0;message=\""+result.get("message")+"\"");
                }
                
                this.mainFrame.setVisible(false);
                this.mainFrame.dispose();
                System.exit(0);
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
        return userName;
    }

    
    public void setUserId(String userId) {
        this.userName = userId;
    }

    
    
}
