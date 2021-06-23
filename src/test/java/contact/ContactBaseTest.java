package contact;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Contact;
import entities.responseobject.ResponseObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static configfile.Configuration.dotenv;

public class ContactBaseTest {

    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    ResponseObject responseObject = new ResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    Contact contactToSend = new Contact();

    @BeforeClass
    public void setUp() {
        requestBuilder.addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"));
    }

    @BeforeMethod(onlyForGroups = "createContact")
    public void createContact() throws JsonProcessingException {
        contactToSend.setFirstName("contact from java");
        contactToSend.setLastName("last name from java");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contactToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @AfterMethod(onlyForGroups = "deleteContact")
    public void deleteProject() {
        requestBuilder
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

}
