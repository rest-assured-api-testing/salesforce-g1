package contact;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.responseobject.ResponseObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends ContactBaseTest{

    @Test(groups = {"createContact", "deleteContact"})
    public void getContactTest() {
        requestBuilder
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", responseObject.getId())
                .addMethod(ApiMethod.GET)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
//        Contact contact = apiResponse.getBody(Contact.class);
//        System.out.println("------------ " + contact.getFirstName());
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
//        System.out.println("++++++++++++" + apiResponse.getStatusCode());
//        apiResponse.validateBodySchema("schemas/contact.json");
    }

    @Test(groups = {"createContact", "deleteContact"})
    public void updateAContactTest() throws JsonProcessingException {
        contactToSend.setFirstName("felipe udated ");
        requestBuilder
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", responseObject.getId())
                .addBody(new ObjectMapper().writeValueAsString(contactToSend))
                .addMethod(ApiMethod.PATCH)
                .build();
        ApiResponse apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }

    @Test(groups = "createContact")
    public void deleteAContact() {
        requestBuilder
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }
//
//
    @Test(groups = "deleteContact")
    public void createAContactTest() throws JsonProcessingException {
        contactToSend.setFirstName("contact from java");
        contactToSend.setLastName("last name from java");
        requestBuilder
                .addEndpoint("/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contactToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiResponse apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
//        System.out.println("----------------" + responseObject.getId());
        Assert.assertEquals(apiResponse.getStatusCode(), 201);
    }

}
