package account;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import entities.ResponseObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static configfile.Configuration.dotenv;

public class AccountBaseTest {

//    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
//    ResponseObject responseObject = new ResponseObject();
//    ApiResponse apiResponse = new ApiResponse();
//    Account accountToSend = new Account();
//
//    @BeforeClass
//    public void setUp() {
//        requestBuilder.addToken(dotenv.get("TOKEN"))
//                .addBaseUri(dotenv.get("BASE_URL"));
//    }
//
//    @BeforeMethod(onlyForGroups = "createAccount")
//    public void createAccount() throws JsonProcessingException {
//        accountToSend.setName("cristian choque prueba desde java");
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint("/Account/")
//                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
//                .addMethod(ApiMethod.POST)
//                .build();
//        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
//        responseObject = apiResponse.getBody(ResponseObject.class);
//    }
//
//    @AfterMethod(onlyForGroups = "deleteAccount")
//    public void deleteAccount() {
//        requestBuilder
//                .addEndpoint("/Account/{accountID}")
//                .addPathParams("accountID", responseObject.getId())
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build());
//    }
}
