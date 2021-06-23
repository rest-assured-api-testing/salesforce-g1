package account;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.responseobject.ResponseObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends AccountBaseTest{

    @Test(groups = {"createAccount", "deleteAccount"})
    public void getAccountTest() {
        requestBuilder
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", responseObject.getId())
                .addMethod(ApiMethod.GET)
                .build();
        apiResponse = new ApiResponse(ApiManager.execute(requestBuilder.build()));
//        Account account = apiResponse.getBody(Account.class);
//        System.out.println("------------ " + account.getName());
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
        System.out.println("++++++++++++" + apiResponse.getStatusCode());
//        apiResponse.validateBodySchema("schemas/account.json");
    }

    @Test(groups = {"createAccount", "deleteAccount"})
    public void updateAAccountTest() throws JsonProcessingException {
        accountToSend.setName("cristian choque prueba desde java actualizado");
        requestBuilder
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", responseObject.getId().toString())
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.PATCH)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
        System.out.println("++++++++++++" + apiResponse.getStatusCode());
    }

    @Test(groups = "createAccount")
    public void deleteAAccount() {
        requestBuilder
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", responseObject.getId().toString())
                .addMethod(ApiMethod.DELETE)
                .build();
        apiResponse = new ApiResponse(ApiManager.execute(requestBuilder.build()));
//        Account account = apiResponse.getBody(Account.class);
//        System.out.println("------------ " + account.getName());
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }


    @Test(groups = "deleteAccount")
    public void createAAccountTest() throws JsonProcessingException {
        accountToSend.setName("cristian choque prueba desde java 2");
        requestBuilder
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiResponse apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
        System.out.println("----------------" + responseObject.getId());
        Assert.assertEquals(apiResponse.getStatusCode(), 201);
//        Assert.assertEquals(account.getAttributes().getType(), "Account");
//        apiResponse.validateBodySchema("schemas/account.json");
    }

}
