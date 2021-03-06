package com.securemetric;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import com.sun.jersey.client.urlconnection.HttpURLConnectionFactory;
import com.sun.jersey.client.urlconnection.URLConnectionClientHandler;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.ws.rs.core.MediaType;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

public class CentagateIntegrationService {

    /* The integration key. This is the key you get from the update app page inside the CENTAGATE */
     private final String INTEGRATION_KEY =
     "e37743a026a882a3c9556f1a663ec42b62776df93f6baa664ec19555a338c9cc";
//    private final static String INTEGRATION_KEY = "c1af19a8723a683f0c3c2604c325e8e3025bc743ad81606a452684384dcfc74f";
    /* The secret key. This is the key you get from the update app page inside the CENTAGATE */
     private final String SECRET_KEY = "AsLwzUHtq8eA";
//    private final static String SECRET_KEY = "V6tm8tzzQX1z";
    private String unixTimestamp;

    public Map<String, String> login(
        String username, String password, String authToken, String userAgent, String browserFp) {
        /* POST API REQUEST */

        String authString = null;
        Map<String, String> responseMap = new HashMap<String, String>();
        try {

            /* The current time in second (GMT+00:00) */
            unixTimestamp = String.valueOf(new Date().getTime() / 1000L);
            /* Put all the required parameters for basic authentication */
            Map<String, String> map = new HashMap<String, String>();
            map.put("username", username);
            map.put("password", password);
            map.put("integrationKey", INTEGRATION_KEY);
            map.put("unixTimestamp", unixTimestamp);
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            map.put("ipAddress", ipAddress);
            map.put("userAgent", userAgent);
            map.put("browserFp", browserFp);
            map.put(
                "hmac", CentagateIntegrationService.calculateHmac256(
                    SECRET_KEY, username
                        + password + INTEGRATION_KEY + unixTimestamp + ipAddress + userAgent + browserFp));

            /* Read the output returned from the authentication */
            Gson gson = new Gson(); /* GSON library */
            Client client = buildClient();
            WebResource service = client.resource(
                "https://demo.centagate.com/CentagateWS/webresources/auth/authBasic");
            String[] types = new String[] {MediaType.APPLICATION_JSON};
            ClientResponse response = (ClientResponse) service.accept(types).post(
                ClientResponse.class, gson.toJson(map));
            if (response.getStatus() == 200) {
                authString = (String) response.getEntity(String.class);
                responseMap = gson.fromJson(authString, HashMap.class);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMap;
    }

    public Map<String, String> register(
        String username, String centagateUserId, String authToken, String secretCode,
        String firstFingerPrint, String secondFingerPrint) {
        /* POST API REQUEST */
        String authString = null;
        Map<String, String> responseMap = new HashMap<String, String>();
        try {
            /*
             * String authTokens=secureRestClientTrustManager.calculateHmac256_post(
             * secretKey, username+integrationKey+unixTimestamp+authToken+ipAddress+"");
             */
            String cenToken = CentagateIntegrationService.generateCenToken(secretCode, username, authToken);
            /* Put all the required parameters for fingerprint registration */
            Map<String, String> map = new HashMap<String, String>();
            map.put("username", username);
            map.put("authToken", cenToken);
            map.put("userId", centagateUserId);
            map.put("tokenType", String.valueOf(6));
            map.put("byteEncode1", firstFingerPrint);
            map.put("byteEncode2", secondFingerPrint);

            /* Read the output returned from the authentication */
            Gson gson = new Gson(); /* GSON library */

            Client client = buildClient();
            WebResource service = client.resource("https://demo.centagate.com/CentagateWS/webresources");
            // service.path("token").path("registerFprint").path(username).path(authToken);

            String[] types = new String[] {MediaType.APPLICATION_JSON};
            ClientResponse response = (ClientResponse) service
                .path("token").path("registerFprint").path(username).path(cenToken).accept(types).put(
                    ClientResponse.class, gson.toJson(map));
            if (response.getStatus() == 200) {
                authString = (String) response.getEntity(String.class);
                responseMap = gson.fromJson(authString, HashMap.class);
            } else {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMap;
    }

    public Map<String, String> authen(String username, String fingerprint) {
        /* POST API REQUEST */

        String authString = null;
        Map<String, String> responseMap = new HashMap<String, String>();
        try {

            /* The current time in second (GMT+00:00) */
            String unixTimestamp = String.valueOf(System.currentTimeMillis() / 1000L);

            /* Put all the required parameters for basic authentication */
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("username", username);
            map.put("fprint", fingerprint);
            map.put("integrationKey", INTEGRATION_KEY);
            map.put("unixTimestamp", unixTimestamp);
            
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            map.put("ipAddress", ipAddress);

            String userAgent = "";
            map.put("userAgent", userAgent);

            String browserFp = "";
            map.put("browserFp", browserFp);
            map.put(
                "hmac", calculateHmac256(
                    SECRET_KEY, username
                        + INTEGRATION_KEY + unixTimestamp + fingerprint + ipAddress + userAgent + browserFp));

            /* Read the output returned from the authentication */
            Gson gson = new Gson(); /* GSON library */

            System.setProperty("jsse.enableSNIExtension", "false");
            Client client = buildClient();
            WebResource service = client.resource(
                "https://demo.centagate.com/CentagateWS/webresources/auth/authFprint");
            String[] types = new String[] {MediaType.APPLICATION_JSON};
            ClientResponse response = (ClientResponse) service.accept(types).post(
                ClientResponse.class, gson.toJson(map));
            if (response.getStatus() == 200) {
                authString = (String) response.getEntity(String.class);
                responseMap = gson.fromJson(authString, HashMap.class);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMap;
    }

    public static Client buildClient() {
        try {
            System.setProperty("jsse.enableSNIExtension", "false");
            DefaultClientConfig config = new DefaultClientConfig();

            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[] {new X509TrustManager() {

                public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

                public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}

                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

            }}, new java.security.SecureRandom());

            Map<String, Object> properties = config.getProperties();
            HTTPSProperties httpsProperties = new HTTPSProperties(new HostnameVerifier() {

                @Override
                public boolean verify(String s, SSLSession sslSession) {
                    return true;
                }
            }, sslcontext);
            properties.put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, httpsProperties);
            config.getClasses().add(JacksonJsonProvider.class);
            return new Client(new URLConnectionClientHandler(new HttpURLConnectionFactory() {

                public HttpURLConnection getHttpURLConnection(URL url) throws IOException {
                    return (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
                }
            }), config);
            // return ClientBuilder.newBuilder().sslContext(sslcontext).hostnameVerifier().build();
        } catch (KeyManagementException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String calculateHmac256(String secret, String message) {
        
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

    private static String generateCenToken(String secretCode, String userName, String hashed) {

        return CentagateIntegrationService.calculateHmac256(secretCode, userName.concat(hashed));

    }
}
