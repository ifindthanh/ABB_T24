import java.net.MalformedURLException;
import java.net.URL;

import wsclient.ApiService;
import wsclient.ApiService_Service;
import wsclient.GetTokenNotification;
import wsclient.ObjectFactory;

public class TestSOAP {

    public static void main(String[] args) {
        ObjectFactory factory = new ObjectFactory();
        ApiService service = new ApiService_Service().getApiServicePort();
        String tokenNotification = service.getTokenNotification("1111111111111");
        System.out.println(tokenNotification);
    }

}
