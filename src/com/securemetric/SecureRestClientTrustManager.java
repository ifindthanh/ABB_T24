package com.securemetric;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author auyong
 */
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;

import javax.net.ssl.X509TrustManager;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

public class SecureRestClientTrustManager implements X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

    @Override
    public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    public boolean isClientTrusted(X509Certificate[] arg0) {
        return true;
    }

    public boolean isServerTrusted(X509Certificate[] arg0) {
        return true;
    }

    public Client hostIgnoringClient() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {

                public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

                public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

            }};
            System.setProperty("jsse.enableSNIExtension", "false");
            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, trustAllCerts, new java.security.SecureRandom());
            DefaultClientConfig config = new DefaultClientConfig();
            Map<String, Object> properties = config.getProperties();
            HTTPSProperties httpsProperties = new HTTPSProperties(new HostnameVerifier() {

                @Override
                public boolean verify(String s, SSLSession sslSession) {
                    return true;
                }
            }, sslcontext);
            properties.put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, httpsProperties);
            config.getClasses().add(JacksonJsonProvider.class);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (KeyManagementException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    
    
    public String calculateHmac256_post(String secret, String message) {
        String hash = null;
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(StringUtils.getBytesUtf8(secret), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            byte [] bytes = sha256_HMAC.doFinal(StringUtils.getBytesUtf8(message));
            hash = Hex.encodeHexString(bytes);

        } catch (Exception e) {
            e.printStackTrace();
        } 
        return hash;
        
    }
}
