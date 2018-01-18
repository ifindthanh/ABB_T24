
import java.sql.SQLException;

import javax.ws.rs.core.MediaType;

import com.securemetric.DBHelper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestRest {
    public static void main(String[] args) {
        /*Client client = Client.create();
        WebResource service = client.resource("https://demo.centagate.com/CentagateWS/webresources/auth/authBasic");
        String[] types = new String[] {MediaType.APPLICATION_JSON};
        ClientResponse response = (ClientResponse) service.accept(types).post(ClientResponse.class);
        System.out.println("DEBUG Message[OTPAuth] : Call API " + response.toString()); 
        String output = response.getEntity(String.class);

        System.out.println("Output from Server .... \n");
        System.out.println(output);*/
        try {
            DBHelper.saveResult(System.currentTimeMillis(), "true");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
    }
}
