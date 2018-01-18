
package wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddUserResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "addUserResponse");
    private final static QName _SetInitTokenActionResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "setInitTokenActionResponse");
    private final static QName _SyncCertificateAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "syncCertificateAce");
    private final static QName _SyncCertificate_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "syncCertificate");
    private final static QName _Login_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "login");
    private final static QName _GetServerTime_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getServerTime");
    private final static QName _BindTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "bindTokenResponse");
    private final static QName _BindToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "bindToken");
    private final static QName _GetServerTimeResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getServerTimeResponse");
    private final static QName _GetTokenNotificationResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenNotificationResponse");
    private final static QName _DeactivateToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "deactivateToken");
    private final static QName _RevokeTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "revokeTokenResponse");
    private final static QName _VerifyEndUserLoginResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "verifyEndUserLoginResponse");
    private final static QName _RequestInitTokenAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "requestInitTokenAceResponse");
    private final static QName _GetServerUnixTime_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getServerUnixTime");
    private final static QName _RequestUnblockTokenAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "requestUnblockTokenAce");
    private final static QName _UnbindToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "unbindToken");
    private final static QName _GetTokenCertificateFingerprintResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenCertificateFingerprintResponse");
    private final static QName _UnbindTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "unbindTokenResponse");
    private final static QName _GetTokenInfo_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenInfo");
    private final static QName _PreLogin_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "preLogin");
    private final static QName _DeactivateUser_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "deactivateUser");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "changePasswordResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "logoutResponse");
    private final static QName _GetUserInfo_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getUserInfo");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "deleteUserResponse");
    private final static QName _UpdateInitTokenAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateInitTokenAceResponse");
    private final static QName _UpdateUnblockTokenAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateUnblockTokenAce");
    private final static QName _RequestUnblockTokenAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "requestUnblockTokenAceResponse");
    private final static QName _VerifySignatureResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "verifySignatureResponse");
    private final static QName _GetTokenNotification_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenNotification");
    private final static QName _RevokeToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "revokeToken");
    private final static QName _ActivateUserResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "activateUserResponse");
    private final static QName _PreLoginResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "preLoginResponse");
    private final static QName _RequestUnblockTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "requestUnblockTokenResponse");
    private final static QName _GetTokenBlockStatus_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenBlockStatus");
    private final static QName _SetBlockTokenAction_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "setBlockTokenAction");
    private final static QName _ChangePassword_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "changePassword");
    private final static QName _SyncCertificateAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "syncCertificateAceResponse");
    private final static QName _RequestInitTokenAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "requestInitTokenAce");
    private final static QName _GetTokenBlockStatusAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenBlockStatusAce");
    private final static QName _UpdateUnblockTokenAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateUnblockTokenAceResponse");
    private final static QName _GetTokenBlockStatusResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenBlockStatusResponse");
    private final static QName _DeactivateUserResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "deactivateUserResponse");
    private final static QName _UpdateBlockTokenAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateBlockTokenAce");
    private final static QName _SetBlockTokenActionResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "setBlockTokenActionResponse");
    private final static QName _UpdateBlockTokenAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateBlockTokenAceResponse");
    private final static QName _UpdateBlockToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateBlockToken");
    private final static QName _ActivateUser_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "activateUser");
    private final static QName _ResetPasswordResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "resetPasswordResponse");
    private final static QName _GetTokenBlockStatusAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenBlockStatusAceResponse");
    private final static QName _Logout_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "logout");
    private final static QName _UpdateUnblockTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateUnblockTokenResponse");
    private final static QName _GetTokenCertificateFingerprintAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenCertificateFingerprintAce");
    private final static QName _EditUser_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "editUser");
    private final static QName _SetInitTokenAction_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "setInitTokenAction");
    private final static QName _UpdateInitTokenAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateInitTokenAce");
    private final static QName _DeactivateTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "deactivateTokenResponse");
    private final static QName _ActivateTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "activateTokenResponse");
    private final static QName _AddUser_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "addUser");
    private final static QName _ResetPassword_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "resetPassword");
    private final static QName _EditUserResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "editUserResponse");
    private final static QName _RequestUnblockToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "requestUnblockToken");
    private final static QName _UpdateBlockTokenResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateBlockTokenResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "deleteUser");
    private final static QName _GetTokenInitStatusAce_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenInitStatusAce");
    private final static QName _ActivateToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "activateToken");
    private final static QName _UpdateUnblockToken_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "updateUnblockToken");
    private final static QName _GetTokenCertificateFingerprintAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenCertificateFingerprintAceResponse");
    private final static QName _APIException_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "APIException");
    private final static QName _GetTokenCertificateFingerprint_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenCertificateFingerprint");
    private final static QName _GetTokenInitStatusAceResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenInitStatusAceResponse");
    private final static QName _GetTokenInfoResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getTokenInfoResponse");
    private final static QName _GetUserInfoResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getUserInfoResponse");
    private final static QName _VerifyEndUserLogin_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "verifyEndUserLogin");
    private final static QName _SyncCertificateResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "syncCertificateResponse");
    private final static QName _GetServerUnixTimeResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "getServerUnixTimeResponse");
    private final static QName _VerifySignature_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "verifySignature");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.basic.tms.securemetric.com/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResetPassword }
     * 
     */
    public ResetPassword createResetPassword() {
        return new ResetPassword();
    }

    /**
     * Create an instance of {@link EditUserResponse }
     * 
     */
    public EditUserResponse createEditUserResponse() {
        return new EditUserResponse();
    }

    /**
     * Create an instance of {@link RequestUnblockToken }
     * 
     */
    public RequestUnblockToken createRequestUnblockToken() {
        return new RequestUnblockToken();
    }

    /**
     * Create an instance of {@link DeactivateTokenResponse }
     * 
     */
    public DeactivateTokenResponse createDeactivateTokenResponse() {
        return new DeactivateTokenResponse();
    }

    /**
     * Create an instance of {@link ActivateTokenResponse }
     * 
     */
    public ActivateTokenResponse createActivateTokenResponse() {
        return new ActivateTokenResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link EditUser }
     * 
     */
    public EditUser createEditUser() {
        return new EditUser();
    }

    /**
     * Create an instance of {@link SetInitTokenAction }
     * 
     */
    public SetInitTokenAction createSetInitTokenAction() {
        return new SetInitTokenAction();
    }

    /**
     * Create an instance of {@link UpdateInitTokenAce }
     * 
     */
    public UpdateInitTokenAce createUpdateInitTokenAce() {
        return new UpdateInitTokenAce();
    }

    /**
     * Create an instance of {@link GetTokenCertificateFingerprintAce }
     * 
     */
    public GetTokenCertificateFingerprintAce createGetTokenCertificateFingerprintAce() {
        return new GetTokenCertificateFingerprintAce();
    }

    /**
     * Create an instance of {@link GetTokenBlockStatusAceResponse }
     * 
     */
    public GetTokenBlockStatusAceResponse createGetTokenBlockStatusAceResponse() {
        return new GetTokenBlockStatusAceResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link UpdateUnblockTokenResponse }
     * 
     */
    public UpdateUnblockTokenResponse createUpdateUnblockTokenResponse() {
        return new UpdateUnblockTokenResponse();
    }

    /**
     * Create an instance of {@link ActivateUser }
     * 
     */
    public ActivateUser createActivateUser() {
        return new ActivateUser();
    }

    /**
     * Create an instance of {@link ResetPasswordResponse }
     * 
     */
    public ResetPasswordResponse createResetPasswordResponse() {
        return new ResetPasswordResponse();
    }

    /**
     * Create an instance of {@link SetBlockTokenActionResponse }
     * 
     */
    public SetBlockTokenActionResponse createSetBlockTokenActionResponse() {
        return new SetBlockTokenActionResponse();
    }

    /**
     * Create an instance of {@link UpdateBlockTokenAceResponse }
     * 
     */
    public UpdateBlockTokenAceResponse createUpdateBlockTokenAceResponse() {
        return new UpdateBlockTokenAceResponse();
    }

    /**
     * Create an instance of {@link UpdateBlockToken }
     * 
     */
    public UpdateBlockToken createUpdateBlockToken() {
        return new UpdateBlockToken();
    }

    /**
     * Create an instance of {@link UpdateUnblockTokenAceResponse }
     * 
     */
    public UpdateUnblockTokenAceResponse createUpdateUnblockTokenAceResponse() {
        return new UpdateUnblockTokenAceResponse();
    }

    /**
     * Create an instance of {@link GetTokenBlockStatusResponse }
     * 
     */
    public GetTokenBlockStatusResponse createGetTokenBlockStatusResponse() {
        return new GetTokenBlockStatusResponse();
    }

    /**
     * Create an instance of {@link DeactivateUserResponse }
     * 
     */
    public DeactivateUserResponse createDeactivateUserResponse() {
        return new DeactivateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateBlockTokenAce }
     * 
     */
    public UpdateBlockTokenAce createUpdateBlockTokenAce() {
        return new UpdateBlockTokenAce();
    }

    /**
     * Create an instance of {@link SyncCertificateResponse }
     * 
     */
    public SyncCertificateResponse createSyncCertificateResponse() {
        return new SyncCertificateResponse();
    }

    /**
     * Create an instance of {@link GetServerUnixTimeResponse }
     * 
     */
    public GetServerUnixTimeResponse createGetServerUnixTimeResponse() {
        return new GetServerUnixTimeResponse();
    }

    /**
     * Create an instance of {@link VerifySignature }
     * 
     */
    public VerifySignature createVerifySignature() {
        return new VerifySignature();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link VerifyEndUserLogin }
     * 
     */
    public VerifyEndUserLogin createVerifyEndUserLogin() {
        return new VerifyEndUserLogin();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetTokenCertificateFingerprint }
     * 
     */
    public GetTokenCertificateFingerprint createGetTokenCertificateFingerprint() {
        return new GetTokenCertificateFingerprint();
    }

    /**
     * Create an instance of {@link GetTokenInitStatusAceResponse }
     * 
     */
    public GetTokenInitStatusAceResponse createGetTokenInitStatusAceResponse() {
        return new GetTokenInitStatusAceResponse();
    }

    /**
     * Create an instance of {@link GetTokenInfoResponse }
     * 
     */
    public GetTokenInfoResponse createGetTokenInfoResponse() {
        return new GetTokenInfoResponse();
    }

    /**
     * Create an instance of {@link ActivateToken }
     * 
     */
    public ActivateToken createActivateToken() {
        return new ActivateToken();
    }

    /**
     * Create an instance of {@link UpdateUnblockToken }
     * 
     */
    public UpdateUnblockToken createUpdateUnblockToken() {
        return new UpdateUnblockToken();
    }

    /**
     * Create an instance of {@link GetTokenCertificateFingerprintAceResponse }
     * 
     */
    public GetTokenCertificateFingerprintAceResponse createGetTokenCertificateFingerprintAceResponse() {
        return new GetTokenCertificateFingerprintAceResponse();
    }

    /**
     * Create an instance of {@link APIException }
     * 
     */
    public APIException createAPIException() {
        return new APIException();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link GetTokenInitStatusAce }
     * 
     */
    public GetTokenInitStatusAce createGetTokenInitStatusAce() {
        return new GetTokenInitStatusAce();
    }

    /**
     * Create an instance of {@link UpdateBlockTokenResponse }
     * 
     */
    public UpdateBlockTokenResponse createUpdateBlockTokenResponse() {
        return new UpdateBlockTokenResponse();
    }

    /**
     * Create an instance of {@link PreLogin }
     * 
     */
    public PreLogin createPreLogin() {
        return new PreLogin();
    }

    /**
     * Create an instance of {@link DeactivateUser }
     * 
     */
    public DeactivateUser createDeactivateUser() {
        return new DeactivateUser();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetTokenCertificateFingerprintResponse }
     * 
     */
    public GetTokenCertificateFingerprintResponse createGetTokenCertificateFingerprintResponse() {
        return new GetTokenCertificateFingerprintResponse();
    }

    /**
     * Create an instance of {@link UnbindTokenResponse }
     * 
     */
    public UnbindTokenResponse createUnbindTokenResponse() {
        return new UnbindTokenResponse();
    }

    /**
     * Create an instance of {@link GetTokenInfo }
     * 
     */
    public GetTokenInfo createGetTokenInfo() {
        return new GetTokenInfo();
    }

    /**
     * Create an instance of {@link GetTokenNotificationResponse }
     * 
     */
    public GetTokenNotificationResponse createGetTokenNotificationResponse() {
        return new GetTokenNotificationResponse();
    }

    /**
     * Create an instance of {@link DeactivateToken }
     * 
     */
    public DeactivateToken createDeactivateToken() {
        return new DeactivateToken();
    }

    /**
     * Create an instance of {@link RevokeTokenResponse }
     * 
     */
    public RevokeTokenResponse createRevokeTokenResponse() {
        return new RevokeTokenResponse();
    }

    /**
     * Create an instance of {@link VerifyEndUserLoginResponse }
     * 
     */
    public VerifyEndUserLoginResponse createVerifyEndUserLoginResponse() {
        return new VerifyEndUserLoginResponse();
    }

    /**
     * Create an instance of {@link RequestInitTokenAceResponse }
     * 
     */
    public RequestInitTokenAceResponse createRequestInitTokenAceResponse() {
        return new RequestInitTokenAceResponse();
    }

    /**
     * Create an instance of {@link GetServerUnixTime }
     * 
     */
    public GetServerUnixTime createGetServerUnixTime() {
        return new GetServerUnixTime();
    }

    /**
     * Create an instance of {@link RequestUnblockTokenAce }
     * 
     */
    public RequestUnblockTokenAce createRequestUnblockTokenAce() {
        return new RequestUnblockTokenAce();
    }

    /**
     * Create an instance of {@link UnbindToken }
     * 
     */
    public UnbindToken createUnbindToken() {
        return new UnbindToken();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetServerTime }
     * 
     */
    public GetServerTime createGetServerTime() {
        return new GetServerTime();
    }

    /**
     * Create an instance of {@link BindTokenResponse }
     * 
     */
    public BindTokenResponse createBindTokenResponse() {
        return new BindTokenResponse();
    }

    /**
     * Create an instance of {@link BindToken }
     * 
     */
    public BindToken createBindToken() {
        return new BindToken();
    }

    /**
     * Create an instance of {@link GetServerTimeResponse }
     * 
     */
    public GetServerTimeResponse createGetServerTimeResponse() {
        return new GetServerTimeResponse();
    }

    /**
     * Create an instance of {@link SyncCertificate }
     * 
     */
    public SyncCertificate createSyncCertificate() {
        return new SyncCertificate();
    }

    /**
     * Create an instance of {@link SyncCertificateAce }
     * 
     */
    public SyncCertificateAce createSyncCertificateAce() {
        return new SyncCertificateAce();
    }

    /**
     * Create an instance of {@link SetInitTokenActionResponse }
     * 
     */
    public SetInitTokenActionResponse createSetInitTokenActionResponse() {
        return new SetInitTokenActionResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link GetTokenBlockStatusAce }
     * 
     */
    public GetTokenBlockStatusAce createGetTokenBlockStatusAce() {
        return new GetTokenBlockStatusAce();
    }

    /**
     * Create an instance of {@link RequestInitTokenAce }
     * 
     */
    public RequestInitTokenAce createRequestInitTokenAce() {
        return new RequestInitTokenAce();
    }

    /**
     * Create an instance of {@link SetBlockTokenAction }
     * 
     */
    public SetBlockTokenAction createSetBlockTokenAction() {
        return new SetBlockTokenAction();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link SyncCertificateAceResponse }
     * 
     */
    public SyncCertificateAceResponse createSyncCertificateAceResponse() {
        return new SyncCertificateAceResponse();
    }

    /**
     * Create an instance of {@link GetTokenBlockStatus }
     * 
     */
    public GetTokenBlockStatus createGetTokenBlockStatus() {
        return new GetTokenBlockStatus();
    }

    /**
     * Create an instance of {@link RevokeToken }
     * 
     */
    public RevokeToken createRevokeToken() {
        return new RevokeToken();
    }

    /**
     * Create an instance of {@link ActivateUserResponse }
     * 
     */
    public ActivateUserResponse createActivateUserResponse() {
        return new ActivateUserResponse();
    }

    /**
     * Create an instance of {@link PreLoginResponse }
     * 
     */
    public PreLoginResponse createPreLoginResponse() {
        return new PreLoginResponse();
    }

    /**
     * Create an instance of {@link RequestUnblockTokenResponse }
     * 
     */
    public RequestUnblockTokenResponse createRequestUnblockTokenResponse() {
        return new RequestUnblockTokenResponse();
    }

    /**
     * Create an instance of {@link GetTokenNotification }
     * 
     */
    public GetTokenNotification createGetTokenNotification() {
        return new GetTokenNotification();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link UpdateInitTokenAceResponse }
     * 
     */
    public UpdateInitTokenAceResponse createUpdateInitTokenAceResponse() {
        return new UpdateInitTokenAceResponse();
    }

    /**
     * Create an instance of {@link UpdateUnblockTokenAce }
     * 
     */
    public UpdateUnblockTokenAce createUpdateUnblockTokenAce() {
        return new UpdateUnblockTokenAce();
    }

    /**
     * Create an instance of {@link RequestUnblockTokenAceResponse }
     * 
     */
    public RequestUnblockTokenAceResponse createRequestUnblockTokenAceResponse() {
        return new RequestUnblockTokenAceResponse();
    }

    /**
     * Create an instance of {@link VerifySignatureResponse }
     * 
     */
    public VerifySignatureResponse createVerifySignatureResponse() {
        return new VerifySignatureResponse();
    }

    /**
     * Create an instance of {@link ReturnCodeAndMessage }
     * 
     */
    public ReturnCodeAndMessage createReturnCodeAndMessage() {
        return new ReturnCodeAndMessage();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetInitTokenActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "setInitTokenActionResponse")
    public JAXBElement<SetInitTokenActionResponse> createSetInitTokenActionResponse(SetInitTokenActionResponse value) {
        return new JAXBElement<SetInitTokenActionResponse>(_SetInitTokenActionResponse_QNAME, SetInitTokenActionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCertificateAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "syncCertificateAce")
    public JAXBElement<SyncCertificateAce> createSyncCertificateAce(SyncCertificateAce value) {
        return new JAXBElement<SyncCertificateAce>(_SyncCertificateAce_QNAME, SyncCertificateAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "syncCertificate")
    public JAXBElement<SyncCertificate> createSyncCertificate(SyncCertificate value) {
        return new JAXBElement<SyncCertificate>(_SyncCertificate_QNAME, SyncCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getServerTime")
    public JAXBElement<GetServerTime> createGetServerTime(GetServerTime value) {
        return new JAXBElement<GetServerTime>(_GetServerTime_QNAME, GetServerTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "bindTokenResponse")
    public JAXBElement<BindTokenResponse> createBindTokenResponse(BindTokenResponse value) {
        return new JAXBElement<BindTokenResponse>(_BindTokenResponse_QNAME, BindTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "bindToken")
    public JAXBElement<BindToken> createBindToken(BindToken value) {
        return new JAXBElement<BindToken>(_BindToken_QNAME, BindToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getServerTimeResponse")
    public JAXBElement<GetServerTimeResponse> createGetServerTimeResponse(GetServerTimeResponse value) {
        return new JAXBElement<GetServerTimeResponse>(_GetServerTimeResponse_QNAME, GetServerTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenNotificationResponse")
    public JAXBElement<GetTokenNotificationResponse> createGetTokenNotificationResponse(GetTokenNotificationResponse value) {
        return new JAXBElement<GetTokenNotificationResponse>(_GetTokenNotificationResponse_QNAME, GetTokenNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "deactivateToken")
    public JAXBElement<DeactivateToken> createDeactivateToken(DeactivateToken value) {
        return new JAXBElement<DeactivateToken>(_DeactivateToken_QNAME, DeactivateToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "revokeTokenResponse")
    public JAXBElement<RevokeTokenResponse> createRevokeTokenResponse(RevokeTokenResponse value) {
        return new JAXBElement<RevokeTokenResponse>(_RevokeTokenResponse_QNAME, RevokeTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyEndUserLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "verifyEndUserLoginResponse")
    public JAXBElement<VerifyEndUserLoginResponse> createVerifyEndUserLoginResponse(VerifyEndUserLoginResponse value) {
        return new JAXBElement<VerifyEndUserLoginResponse>(_VerifyEndUserLoginResponse_QNAME, VerifyEndUserLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestInitTokenAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "requestInitTokenAceResponse")
    public JAXBElement<RequestInitTokenAceResponse> createRequestInitTokenAceResponse(RequestInitTokenAceResponse value) {
        return new JAXBElement<RequestInitTokenAceResponse>(_RequestInitTokenAceResponse_QNAME, RequestInitTokenAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerUnixTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getServerUnixTime")
    public JAXBElement<GetServerUnixTime> createGetServerUnixTime(GetServerUnixTime value) {
        return new JAXBElement<GetServerUnixTime>(_GetServerUnixTime_QNAME, GetServerUnixTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestUnblockTokenAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "requestUnblockTokenAce")
    public JAXBElement<RequestUnblockTokenAce> createRequestUnblockTokenAce(RequestUnblockTokenAce value) {
        return new JAXBElement<RequestUnblockTokenAce>(_RequestUnblockTokenAce_QNAME, RequestUnblockTokenAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbindToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "unbindToken")
    public JAXBElement<UnbindToken> createUnbindToken(UnbindToken value) {
        return new JAXBElement<UnbindToken>(_UnbindToken_QNAME, UnbindToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenCertificateFingerprintResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenCertificateFingerprintResponse")
    public JAXBElement<GetTokenCertificateFingerprintResponse> createGetTokenCertificateFingerprintResponse(GetTokenCertificateFingerprintResponse value) {
        return new JAXBElement<GetTokenCertificateFingerprintResponse>(_GetTokenCertificateFingerprintResponse_QNAME, GetTokenCertificateFingerprintResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbindTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "unbindTokenResponse")
    public JAXBElement<UnbindTokenResponse> createUnbindTokenResponse(UnbindTokenResponse value) {
        return new JAXBElement<UnbindTokenResponse>(_UnbindTokenResponse_QNAME, UnbindTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenInfo")
    public JAXBElement<GetTokenInfo> createGetTokenInfo(GetTokenInfo value) {
        return new JAXBElement<GetTokenInfo>(_GetTokenInfo_QNAME, GetTokenInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "preLogin")
    public JAXBElement<PreLogin> createPreLogin(PreLogin value) {
        return new JAXBElement<PreLogin>(_PreLogin_QNAME, PreLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "deactivateUser")
    public JAXBElement<DeactivateUser> createDeactivateUser(DeactivateUser value) {
        return new JAXBElement<DeactivateUser>(_DeactivateUser_QNAME, DeactivateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getUserInfo")
    public JAXBElement<GetUserInfo> createGetUserInfo(GetUserInfo value) {
        return new JAXBElement<GetUserInfo>(_GetUserInfo_QNAME, GetUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInitTokenAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateInitTokenAceResponse")
    public JAXBElement<UpdateInitTokenAceResponse> createUpdateInitTokenAceResponse(UpdateInitTokenAceResponse value) {
        return new JAXBElement<UpdateInitTokenAceResponse>(_UpdateInitTokenAceResponse_QNAME, UpdateInitTokenAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUnblockTokenAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateUnblockTokenAce")
    public JAXBElement<UpdateUnblockTokenAce> createUpdateUnblockTokenAce(UpdateUnblockTokenAce value) {
        return new JAXBElement<UpdateUnblockTokenAce>(_UpdateUnblockTokenAce_QNAME, UpdateUnblockTokenAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestUnblockTokenAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "requestUnblockTokenAceResponse")
    public JAXBElement<RequestUnblockTokenAceResponse> createRequestUnblockTokenAceResponse(RequestUnblockTokenAceResponse value) {
        return new JAXBElement<RequestUnblockTokenAceResponse>(_RequestUnblockTokenAceResponse_QNAME, RequestUnblockTokenAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifySignatureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "verifySignatureResponse")
    public JAXBElement<VerifySignatureResponse> createVerifySignatureResponse(VerifySignatureResponse value) {
        return new JAXBElement<VerifySignatureResponse>(_VerifySignatureResponse_QNAME, VerifySignatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenNotification")
    public JAXBElement<GetTokenNotification> createGetTokenNotification(GetTokenNotification value) {
        return new JAXBElement<GetTokenNotification>(_GetTokenNotification_QNAME, GetTokenNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "revokeToken")
    public JAXBElement<RevokeToken> createRevokeToken(RevokeToken value) {
        return new JAXBElement<RevokeToken>(_RevokeToken_QNAME, RevokeToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "activateUserResponse")
    public JAXBElement<ActivateUserResponse> createActivateUserResponse(ActivateUserResponse value) {
        return new JAXBElement<ActivateUserResponse>(_ActivateUserResponse_QNAME, ActivateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "preLoginResponse")
    public JAXBElement<PreLoginResponse> createPreLoginResponse(PreLoginResponse value) {
        return new JAXBElement<PreLoginResponse>(_PreLoginResponse_QNAME, PreLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestUnblockTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "requestUnblockTokenResponse")
    public JAXBElement<RequestUnblockTokenResponse> createRequestUnblockTokenResponse(RequestUnblockTokenResponse value) {
        return new JAXBElement<RequestUnblockTokenResponse>(_RequestUnblockTokenResponse_QNAME, RequestUnblockTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenBlockStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenBlockStatus")
    public JAXBElement<GetTokenBlockStatus> createGetTokenBlockStatus(GetTokenBlockStatus value) {
        return new JAXBElement<GetTokenBlockStatus>(_GetTokenBlockStatus_QNAME, GetTokenBlockStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBlockTokenAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "setBlockTokenAction")
    public JAXBElement<SetBlockTokenAction> createSetBlockTokenAction(SetBlockTokenAction value) {
        return new JAXBElement<SetBlockTokenAction>(_SetBlockTokenAction_QNAME, SetBlockTokenAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCertificateAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "syncCertificateAceResponse")
    public JAXBElement<SyncCertificateAceResponse> createSyncCertificateAceResponse(SyncCertificateAceResponse value) {
        return new JAXBElement<SyncCertificateAceResponse>(_SyncCertificateAceResponse_QNAME, SyncCertificateAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestInitTokenAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "requestInitTokenAce")
    public JAXBElement<RequestInitTokenAce> createRequestInitTokenAce(RequestInitTokenAce value) {
        return new JAXBElement<RequestInitTokenAce>(_RequestInitTokenAce_QNAME, RequestInitTokenAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenBlockStatusAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenBlockStatusAce")
    public JAXBElement<GetTokenBlockStatusAce> createGetTokenBlockStatusAce(GetTokenBlockStatusAce value) {
        return new JAXBElement<GetTokenBlockStatusAce>(_GetTokenBlockStatusAce_QNAME, GetTokenBlockStatusAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUnblockTokenAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateUnblockTokenAceResponse")
    public JAXBElement<UpdateUnblockTokenAceResponse> createUpdateUnblockTokenAceResponse(UpdateUnblockTokenAceResponse value) {
        return new JAXBElement<UpdateUnblockTokenAceResponse>(_UpdateUnblockTokenAceResponse_QNAME, UpdateUnblockTokenAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenBlockStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenBlockStatusResponse")
    public JAXBElement<GetTokenBlockStatusResponse> createGetTokenBlockStatusResponse(GetTokenBlockStatusResponse value) {
        return new JAXBElement<GetTokenBlockStatusResponse>(_GetTokenBlockStatusResponse_QNAME, GetTokenBlockStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "deactivateUserResponse")
    public JAXBElement<DeactivateUserResponse> createDeactivateUserResponse(DeactivateUserResponse value) {
        return new JAXBElement<DeactivateUserResponse>(_DeactivateUserResponse_QNAME, DeactivateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBlockTokenAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateBlockTokenAce")
    public JAXBElement<UpdateBlockTokenAce> createUpdateBlockTokenAce(UpdateBlockTokenAce value) {
        return new JAXBElement<UpdateBlockTokenAce>(_UpdateBlockTokenAce_QNAME, UpdateBlockTokenAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBlockTokenActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "setBlockTokenActionResponse")
    public JAXBElement<SetBlockTokenActionResponse> createSetBlockTokenActionResponse(SetBlockTokenActionResponse value) {
        return new JAXBElement<SetBlockTokenActionResponse>(_SetBlockTokenActionResponse_QNAME, SetBlockTokenActionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBlockTokenAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateBlockTokenAceResponse")
    public JAXBElement<UpdateBlockTokenAceResponse> createUpdateBlockTokenAceResponse(UpdateBlockTokenAceResponse value) {
        return new JAXBElement<UpdateBlockTokenAceResponse>(_UpdateBlockTokenAceResponse_QNAME, UpdateBlockTokenAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBlockToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateBlockToken")
    public JAXBElement<UpdateBlockToken> createUpdateBlockToken(UpdateBlockToken value) {
        return new JAXBElement<UpdateBlockToken>(_UpdateBlockToken_QNAME, UpdateBlockToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "activateUser")
    public JAXBElement<ActivateUser> createActivateUser(ActivateUser value) {
        return new JAXBElement<ActivateUser>(_ActivateUser_QNAME, ActivateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "resetPasswordResponse")
    public JAXBElement<ResetPasswordResponse> createResetPasswordResponse(ResetPasswordResponse value) {
        return new JAXBElement<ResetPasswordResponse>(_ResetPasswordResponse_QNAME, ResetPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenBlockStatusAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenBlockStatusAceResponse")
    public JAXBElement<GetTokenBlockStatusAceResponse> createGetTokenBlockStatusAceResponse(GetTokenBlockStatusAceResponse value) {
        return new JAXBElement<GetTokenBlockStatusAceResponse>(_GetTokenBlockStatusAceResponse_QNAME, GetTokenBlockStatusAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUnblockTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateUnblockTokenResponse")
    public JAXBElement<UpdateUnblockTokenResponse> createUpdateUnblockTokenResponse(UpdateUnblockTokenResponse value) {
        return new JAXBElement<UpdateUnblockTokenResponse>(_UpdateUnblockTokenResponse_QNAME, UpdateUnblockTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenCertificateFingerprintAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenCertificateFingerprintAce")
    public JAXBElement<GetTokenCertificateFingerprintAce> createGetTokenCertificateFingerprintAce(GetTokenCertificateFingerprintAce value) {
        return new JAXBElement<GetTokenCertificateFingerprintAce>(_GetTokenCertificateFingerprintAce_QNAME, GetTokenCertificateFingerprintAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "editUser")
    public JAXBElement<EditUser> createEditUser(EditUser value) {
        return new JAXBElement<EditUser>(_EditUser_QNAME, EditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetInitTokenAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "setInitTokenAction")
    public JAXBElement<SetInitTokenAction> createSetInitTokenAction(SetInitTokenAction value) {
        return new JAXBElement<SetInitTokenAction>(_SetInitTokenAction_QNAME, SetInitTokenAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInitTokenAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateInitTokenAce")
    public JAXBElement<UpdateInitTokenAce> createUpdateInitTokenAce(UpdateInitTokenAce value) {
        return new JAXBElement<UpdateInitTokenAce>(_UpdateInitTokenAce_QNAME, UpdateInitTokenAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "deactivateTokenResponse")
    public JAXBElement<DeactivateTokenResponse> createDeactivateTokenResponse(DeactivateTokenResponse value) {
        return new JAXBElement<DeactivateTokenResponse>(_DeactivateTokenResponse_QNAME, DeactivateTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "activateTokenResponse")
    public JAXBElement<ActivateTokenResponse> createActivateTokenResponse(ActivateTokenResponse value) {
        return new JAXBElement<ActivateTokenResponse>(_ActivateTokenResponse_QNAME, ActivateTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "resetPassword")
    public JAXBElement<ResetPassword> createResetPassword(ResetPassword value) {
        return new JAXBElement<ResetPassword>(_ResetPassword_QNAME, ResetPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "editUserResponse")
    public JAXBElement<EditUserResponse> createEditUserResponse(EditUserResponse value) {
        return new JAXBElement<EditUserResponse>(_EditUserResponse_QNAME, EditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestUnblockToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "requestUnblockToken")
    public JAXBElement<RequestUnblockToken> createRequestUnblockToken(RequestUnblockToken value) {
        return new JAXBElement<RequestUnblockToken>(_RequestUnblockToken_QNAME, RequestUnblockToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBlockTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateBlockTokenResponse")
    public JAXBElement<UpdateBlockTokenResponse> createUpdateBlockTokenResponse(UpdateBlockTokenResponse value) {
        return new JAXBElement<UpdateBlockTokenResponse>(_UpdateBlockTokenResponse_QNAME, UpdateBlockTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenInitStatusAce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenInitStatusAce")
    public JAXBElement<GetTokenInitStatusAce> createGetTokenInitStatusAce(GetTokenInitStatusAce value) {
        return new JAXBElement<GetTokenInitStatusAce>(_GetTokenInitStatusAce_QNAME, GetTokenInitStatusAce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "activateToken")
    public JAXBElement<ActivateToken> createActivateToken(ActivateToken value) {
        return new JAXBElement<ActivateToken>(_ActivateToken_QNAME, ActivateToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUnblockToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "updateUnblockToken")
    public JAXBElement<UpdateUnblockToken> createUpdateUnblockToken(UpdateUnblockToken value) {
        return new JAXBElement<UpdateUnblockToken>(_UpdateUnblockToken_QNAME, UpdateUnblockToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenCertificateFingerprintAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenCertificateFingerprintAceResponse")
    public JAXBElement<GetTokenCertificateFingerprintAceResponse> createGetTokenCertificateFingerprintAceResponse(GetTokenCertificateFingerprintAceResponse value) {
        return new JAXBElement<GetTokenCertificateFingerprintAceResponse>(_GetTokenCertificateFingerprintAceResponse_QNAME, GetTokenCertificateFingerprintAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenCertificateFingerprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenCertificateFingerprint")
    public JAXBElement<GetTokenCertificateFingerprint> createGetTokenCertificateFingerprint(GetTokenCertificateFingerprint value) {
        return new JAXBElement<GetTokenCertificateFingerprint>(_GetTokenCertificateFingerprint_QNAME, GetTokenCertificateFingerprint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenInitStatusAceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenInitStatusAceResponse")
    public JAXBElement<GetTokenInitStatusAceResponse> createGetTokenInitStatusAceResponse(GetTokenInitStatusAceResponse value) {
        return new JAXBElement<GetTokenInitStatusAceResponse>(_GetTokenInitStatusAceResponse_QNAME, GetTokenInitStatusAceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTokenInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getTokenInfoResponse")
    public JAXBElement<GetTokenInfoResponse> createGetTokenInfoResponse(GetTokenInfoResponse value) {
        return new JAXBElement<GetTokenInfoResponse>(_GetTokenInfoResponse_QNAME, GetTokenInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getUserInfoResponse")
    public JAXBElement<GetUserInfoResponse> createGetUserInfoResponse(GetUserInfoResponse value) {
        return new JAXBElement<GetUserInfoResponse>(_GetUserInfoResponse_QNAME, GetUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyEndUserLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "verifyEndUserLogin")
    public JAXBElement<VerifyEndUserLogin> createVerifyEndUserLogin(VerifyEndUserLogin value) {
        return new JAXBElement<VerifyEndUserLogin>(_VerifyEndUserLogin_QNAME, VerifyEndUserLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "syncCertificateResponse")
    public JAXBElement<SyncCertificateResponse> createSyncCertificateResponse(SyncCertificateResponse value) {
        return new JAXBElement<SyncCertificateResponse>(_SyncCertificateResponse_QNAME, SyncCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerUnixTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "getServerUnixTimeResponse")
    public JAXBElement<GetServerUnixTimeResponse> createGetServerUnixTimeResponse(GetServerUnixTimeResponse value) {
        return new JAXBElement<GetServerUnixTimeResponse>(_GetServerUnixTimeResponse_QNAME, GetServerUnixTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifySignature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "verifySignature")
    public JAXBElement<VerifySignature> createVerifySignature(VerifySignature value) {
        return new JAXBElement<VerifySignature>(_VerifySignature_QNAME, VerifySignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.basic.tms.securemetric.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
