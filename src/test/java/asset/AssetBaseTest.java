package asset;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequestBuilder;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Account;
import entities.Asset;
import entities.ResponseObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static configfile.Configuration.dotenv;

public class AssetBaseTest {
//    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
//    ResponseObject responseObject = new ResponseObject();
//    ApiResponse apiResponse = new ApiResponse();
//    Asset assetToSend = new Asset();
//    Account accountToSend = new Account();
//    String accountID = "";
//
//    @BeforeClass
//    public void setUp() {
//        requestBuilder.addToken(dotenv.get("TOKEN"))
//                .addBaseUri(dotenv.get("BASE_URL"));
//    }
////
//    @BeforeMethod(onlyForGroups = {"createAsset", "createAccount"})
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
//        accountID = responseObject.getId();
//    }
//
//    @BeforeMethod(dependsOnMethods = "createAccount", onlyForGroups = "createAsset")
//    public void createAsset() throws JsonProcessingException {
//        assetToSend.setName("asset name from java");
//        assetToSend.setAccountId(responseObject.getId());
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint("/Asset/")
//                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
//                .addMethod(ApiMethod.POST)
//                .build();
//        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
//        responseObject = apiResponse.getBody(ResponseObject.class);
//    }
//
//    @AfterMethod(onlyForGroups = "deleteAsset")
//    public void deleteAsset() {
//        requestBuilder
//                .addEndpoint("/Asset/{assetID}")
//                .addPathParams("assetID", responseObject.getId())
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build());
//    }
//
//    @AfterMethod(dependsOnMethods = "deleteAsset", onlyForGroups = "deleteAsset")
//    public void deleteAccount() {
//        requestBuilder
//                .addEndpoint("/Account/{accountID}")
//                .clearPathParams()
//                .addPathParams("accountID", accountID)
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build());
//    }
}
