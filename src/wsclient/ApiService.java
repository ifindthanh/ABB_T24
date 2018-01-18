
package wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ApiService", targetNamespace = "http://ws.basic.tms.securemetric.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApiService {


    /**
     * 
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "activateToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ActivateToken")
    @ResponseWrapper(localName = "activateTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ActivateTokenResponse")
    public ReturnCodeAndMessage activateToken(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid);

    /**
     * 
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "activateUser", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ActivateUser")
    @ResponseWrapper(localName = "activateUserResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ActivateUserResponse")
    public ReturnCodeAndMessage activateUser(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param firstName
     * @param lastName
     * @param password
     * @param address
     * @param middleName
     * @param mobileNo
     * @param email
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.AddUserResponse")
    public ReturnCodeAndMessage addUser(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName,
        @WebParam(name = "middleName", targetNamespace = "")
        String middleName,
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "mobileNo", targetNamespace = "")
        String mobileNo,
        @WebParam(name = "address", targetNamespace = "")
        String address);

    /**
     * 
     * @param tokenHid
     * @param temporaryBinding
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bindToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.BindToken")
    @ResponseWrapper(localName = "bindTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.BindTokenResponse")
    public ReturnCodeAndMessage bindToken(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "temporaryBinding", targetNamespace = "")
        boolean temporaryBinding);

    /**
     * 
     * @param newPassword
     * @param currentPassword
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod(action = "changePassword")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "changePassword", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ChangePassword")
    @ResponseWrapper(localName = "changePasswordResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ChangePasswordResponse")
    public ReturnCodeAndMessage changePassword(
        @WebParam(name = "currentPassword", targetNamespace = "")
        String currentPassword,
        @WebParam(name = "newPassword", targetNamespace = "")
        String newPassword);

    /**
     * 
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deactivateToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.DeactivateToken")
    @ResponseWrapper(localName = "deactivateTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.DeactivateTokenResponse")
    public ReturnCodeAndMessage deactivateToken(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid);

    /**
     * 
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deactivateUser", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.DeactivateUser")
    @ResponseWrapper(localName = "deactivateUserResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.DeactivateUserResponse")
    public ReturnCodeAndMessage deactivateUser(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.DeleteUserResponse")
    public ReturnCodeAndMessage deleteUser(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param middleName
     * @param mobileNo
     * @param email
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editUser", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.EditUser")
    @ResponseWrapper(localName = "editUserResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.EditUserResponse")
    public ReturnCodeAndMessage editUser(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName,
        @WebParam(name = "middleName", targetNamespace = "")
        String middleName,
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "mobileNo", targetNamespace = "")
        String mobileNo,
        @WebParam(name = "address", targetNamespace = "")
        String address);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServerTime", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetServerTime")
    @ResponseWrapper(localName = "getServerTimeResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetServerTimeResponse")
    public String getServerTime();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServerUnixTime", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetServerUnixTime")
    @ResponseWrapper(localName = "getServerUnixTimeResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetServerUnixTimeResponse")
    public String getServerUnixTime();

    /**
     * 
     * @param tokenHid
     * @return
     *     returns int
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTokenBlockStatus", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenBlockStatus")
    @ResponseWrapper(localName = "getTokenBlockStatusResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenBlockStatusResponse")
    public int getTokenBlockStatus(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid)
        throws APIException_Exception
    ;

    /**
     * 
     * @param signature
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTokenBlockStatusAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenBlockStatusAce")
    @ResponseWrapper(localName = "getTokenBlockStatusAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenBlockStatusAceResponse")
    public String getTokenBlockStatusAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param tokenHid
     * @return
     *     returns java.lang.String
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTokenCertificateFingerprint", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenCertificateFingerprint")
    @ResponseWrapper(localName = "getTokenCertificateFingerprintResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenCertificateFingerprintResponse")
    public String getTokenCertificateFingerprint(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid)
        throws APIException_Exception
    ;

    /**
     * 
     * @param signature
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTokenCertificateFingerprintAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenCertificateFingerprintAce")
    @ResponseWrapper(localName = "getTokenCertificateFingerprintAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenCertificateFingerprintAceResponse")
    public String getTokenCertificateFingerprintAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param tokenHid
     * @return
     *     returns wsclient.Token
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTokenInfo", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenInfo")
    @ResponseWrapper(localName = "getTokenInfoResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenInfoResponse")
    public Token getTokenInfo(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid)
        throws APIException_Exception
    ;

    /**
     * 
     * @param signature
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTokenInitStatusAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenInitStatusAce")
    @ResponseWrapper(localName = "getTokenInitStatusAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenInitStatusAceResponse")
    public String getTokenInitStatusAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param tokenHID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTokenNotification", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenNotification")
    @ResponseWrapper(localName = "getTokenNotificationResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetTokenNotificationResponse")
    public String getTokenNotification(
        @WebParam(name = "tokenHID", targetNamespace = "")
        String tokenHID);

    /**
     * 
     * @param username
     * @return
     *     returns wsclient.User
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetUserInfo")
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.GetUserInfoResponse")
    public User getUserInfo(
        @WebParam(name = "username", targetNamespace = "")
        String username)
        throws APIException_Exception
    ;

    /**
     * 
     * @param password
     * @param signature
     * @param username
     * @return
     *     returns wsclient.User
     * @throws APIException_Exception
     */
    @WebMethod(action = "login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.LoginResponse")
    public User login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "signature", targetNamespace = "")
        String signature)
        throws APIException_Exception
    ;

    /**
     * 
     */
    @WebMethod(action = "logout")
    @RequestWrapper(localName = "logout", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.LogoutResponse")
    public void logout();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "preLogin")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "preLogin", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.PreLogin")
    @ResponseWrapper(localName = "preLoginResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.PreLoginResponse")
    public String preLogin();

    /**
     * 
     * @param signature
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestInitTokenAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RequestInitTokenAce")
    @ResponseWrapper(localName = "requestInitTokenAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RequestInitTokenAceResponse")
    public String requestInitTokenAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param tokenHid
     * @return
     *     returns java.lang.String
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestUnblockToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RequestUnblockToken")
    @ResponseWrapper(localName = "requestUnblockTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RequestUnblockTokenResponse")
    public String requestUnblockToken(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid)
        throws APIException_Exception
    ;

    /**
     * 
     * @param signature
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "requestUnblockTokenAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RequestUnblockTokenAce")
    @ResponseWrapper(localName = "requestUnblockTokenAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RequestUnblockTokenAceResponse")
    public String requestUnblockTokenAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param newPassword
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod(action = "resetPassword")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resetPassword", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ResetPassword")
    @ResponseWrapper(localName = "resetPasswordResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.ResetPasswordResponse")
    public ReturnCodeAndMessage resetPassword(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "newPassword", targetNamespace = "")
        String newPassword);

    /**
     * 
     * @param revokeReason
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "revokeToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RevokeToken")
    @ResponseWrapper(localName = "revokeTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.RevokeTokenResponse")
    public ReturnCodeAndMessage revokeToken(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "revokeReason", targetNamespace = "")
        int revokeReason);

    /**
     * 
     * @param blockTokenAction
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setBlockTokenAction", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SetBlockTokenAction")
    @ResponseWrapper(localName = "setBlockTokenActionResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SetBlockTokenActionResponse")
    public ReturnCodeAndMessage setBlockTokenAction(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "blockTokenAction", targetNamespace = "")
        int blockTokenAction);

    /**
     * 
     * @param initTokenAction
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setInitTokenAction", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SetInitTokenAction")
    @ResponseWrapper(localName = "setInitTokenActionResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SetInitTokenActionResponse")
    public ReturnCodeAndMessage setInitTokenAction(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "initTokenAction", targetNamespace = "")
        int initTokenAction);

    /**
     * 
     * @param base64
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "syncCertificate", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SyncCertificate")
    @ResponseWrapper(localName = "syncCertificateResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SyncCertificateResponse")
    public ReturnCodeAndMessage syncCertificate(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "base64", targetNamespace = "")
        String base64);

    /**
     * 
     * @param signature
     * @param base64
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "syncCertificateAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SyncCertificateAce")
    @ResponseWrapper(localName = "syncCertificateAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.SyncCertificateAceResponse")
    public String syncCertificateAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "base64", targetNamespace = "")
        String base64,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param tokenHid
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "unbindToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UnbindToken")
    @ResponseWrapper(localName = "unbindTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UnbindTokenResponse")
    public ReturnCodeAndMessage unbindToken(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid);

    /**
     * 
     * @param blockResult
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateBlockToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateBlockToken")
    @ResponseWrapper(localName = "updateBlockTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateBlockTokenResponse")
    public ReturnCodeAndMessage updateBlockToken(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "blockResult", targetNamespace = "")
        boolean blockResult);

    /**
     * 
     * @param signature
     * @param blockResult
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateBlockTokenAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateBlockTokenAce")
    @ResponseWrapper(localName = "updateBlockTokenAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateBlockTokenAceResponse")
    public String updateBlockTokenAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "blockResult", targetNamespace = "")
        boolean blockResult,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param initResult
     * @param signature
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateInitTokenAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateInitTokenAce")
    @ResponseWrapper(localName = "updateInitTokenAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateInitTokenAceResponse")
    public String updateInitTokenAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "initResult", targetNamespace = "")
        boolean initResult,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param unblockResult
     * @param tokenHid
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUnblockToken", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateUnblockToken")
    @ResponseWrapper(localName = "updateUnblockTokenResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateUnblockTokenResponse")
    public ReturnCodeAndMessage updateUnblockToken(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "unblockResult", targetNamespace = "")
        boolean unblockResult);

    /**
     * 
     * @param signature
     * @param unblockResult
     * @param tokenHid
     * @param timestamp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUnblockTokenAce", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateUnblockTokenAce")
    @ResponseWrapper(localName = "updateUnblockTokenAceResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.UpdateUnblockTokenAceResponse")
    public String updateUnblockTokenAce(
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "unblockResult", targetNamespace = "")
        boolean unblockResult,
        @WebParam(name = "timestamp", targetNamespace = "")
        long timestamp,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param password
     * @param signature
     * @param plainText
     * @param tokenHid
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifyEndUserLogin", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.VerifyEndUserLogin")
    @ResponseWrapper(localName = "verifyEndUserLoginResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.VerifyEndUserLoginResponse")
    public ReturnCodeAndMessage verifyEndUserLogin(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "plainText", targetNamespace = "")
        String plainText,
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

    /**
     * 
     * @param signature
     * @param plainText
     * @param tokenHid
     * @param username
     * @return
     *     returns wsclient.ReturnCodeAndMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifySignature", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.VerifySignature")
    @ResponseWrapper(localName = "verifySignatureResponse", targetNamespace = "http://ws.basic.tms.securemetric.com/", className = "wsclient.VerifySignatureResponse")
    public ReturnCodeAndMessage verifySignature(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "plainText", targetNamespace = "")
        String plainText,
        @WebParam(name = "tokenHid", targetNamespace = "")
        String tokenHid,
        @WebParam(name = "signature", targetNamespace = "")
        String signature);

}