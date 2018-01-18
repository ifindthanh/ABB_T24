package com.securemetric;

import java.awt.image.BufferedImage;

import SecuGen.FDxSDKPro.jni.JSGFPLib;
import SecuGen.FDxSDKPro.jni.SGDeviceInfoParam;
import SecuGen.FDxSDKPro.jni.SGFDxDeviceName;
import SecuGen.FDxSDKPro.jni.SGFDxErrorCode;
import SecuGen.FDxSDKPro.jni.SGPPPortAddr;

public class HU20IntegrationManagement {
    
    private final JSGFPLib sgfplib = new JSGFPLib();
    private final SGDeviceInfoParam deviceInfo = new SGDeviceInfoParam();
    private final long timeout = 10000;
    private final long quality = 80;
    private BufferedImage img1gray;
    private byte[] imageBuffer;
    private final boolean isInitialized;
    
    public HU20IntegrationManagement () throws SMVNException {
        long errorCode = sgfplib.Init(SGFDxDeviceName.SG_DEV_AUTO);
        if (errorCode != SGFDxErrorCode.SGFDX_ERROR_NONE) {
            throw new SMVNException("Khởi tạo kết nối đến thiết bị thất bại, vui lòng kiểm tra kết nối", errorCode);
        }
        
        errorCode = sgfplib.OpenDevice(SGPPPortAddr.USB_AUTO_DETECT);
        if (errorCode != SGFDxErrorCode.SGFDX_ERROR_NONE) {
            throw new SMVNException("Tạo kết nối đến thiết bị thất bại, vui lòng kiểm tra kết nối", errorCode);
        }
        
        errorCode = sgfplib.GetDeviceInfo(this.deviceInfo);
        if (errorCode != SGFDxErrorCode.SGFDX_ERROR_NONE) {
            throw new SMVNException("Lấy thông tin thiết bị thất bại, vui lòng kiểm tra kết nối", errorCode);
        }
        this.isInitialized = true;
    }

    public void init() throws SMVNException {
        this.img1gray = new BufferedImage(deviceInfo.imageWidth, deviceInfo.imageHeight, BufferedImage.TYPE_BYTE_GRAY);
        this.imageBuffer = ((java.awt.image.DataBufferByte) img1gray.getRaster().getDataBuffer()).getData();
        long errorCode = sgfplib.GetImageEx(imageBuffer, timeout, 100, quality);
        if (errorCode != SGFDxErrorCode.SGFDX_ERROR_NONE) {
            throw new SMVNException("Nhận thông tin vân tay thất bại", errorCode);
        }
    }

    public BufferedImage getImg1gray() {
        return img1gray;
    }
    
    public void setImg1gray(BufferedImage img1gray) {
        this.img1gray = img1gray;
    }

    public byte[] getImageBuffer() {
        return imageBuffer;
    }

    public void setImageBuffer(byte[] imageBuffer) {
        this.imageBuffer = imageBuffer;
    }

    
    public boolean isInitialized() {
        return isInitialized;
    }
    
}
