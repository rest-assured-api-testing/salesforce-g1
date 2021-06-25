package rest.salesforce.org.hooks;

import api.ApiResponseObject;
import api.ApiResponse;
import api.ApiRequestBuilder;
import api.ApiMethod;
import api.ApiManager;
import api.RequestID;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static configfile.Configuration.dotenv;

public class Hooks {
    private static final Logger LOGGER = LogManager.getRootLogger();
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    ApiResponseObject apiResponseObject = new ApiResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    Account accountToSend = new Account();
    Asset assetToSend = new Asset();
    Contact contactToSend = new Contact();
    Contract contractToSend = new Contract();
    Order orderToSend = new Order();
    String token;

//    public Hooks(ApiRequestBuilder requestBuilder, ApiResponseObject apiResponseObject, ApiResponse apiResponse) {
//        this.requestBuilder = requestBuilder;
//        this.apiResponseObject = apiResponseObject;
//        this.apiResponse = apiResponse;
//    }

    @Before("@SetUpConfig")
    public void setUpConfig() throws JsonProcessingException {
        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
        apiRequestBuilder
                .addBaseUri(dotenv.get("AUTH_URL"))
                .addEndpoint("/services/oauth2/token")
                .addQueryParams("grant_type", "password")
                .addQueryParams("client_id",dotenv.get("CLIENT_ID"))
                .addQueryParams("client_secret",dotenv.get("CLIENT_SECRET"))
                .addQueryParams("username",dotenv.get("SALESFORCE_USERNAME"))
                .addQueryParams("password",dotenv.get("PASSWORD_TOKEN"))
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addMethod(ApiMethod.POST);
        ApiResponse apiResponseToken = ApiManager.execute(apiRequestBuilder.build());
        token = apiResponseToken.getPath("token_type") + " " + apiResponseToken.getPath("access_token");
    }

    @Before("@CreateAccount")
    public void createAnAccount() throws JsonProcessingException {
        accountToSend.setName("New Account used for testing");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        RequestID.setIdAccount(apiResponseObject.getId());
        RequestID.getIdFeature("AccountId");
    }

    @After("@DeleteAccount")
    public void deleteAnAccount() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", RequestID.getIdAccount())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateAsset")
    public void createAnAsset() throws JsonProcessingException {
        assetToSend.setName("asset name from java");
        assetToSend.setAccountId(RequestID.getIdAccount());
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Asset/")
                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        RequestID.setIdAsset(apiResponseObject.getId());
        RequestID.getIdFeature("AssetId");
    }

    @After("@DeleteAsset")
    public void deleteAnAsset() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", RequestID.getIdAsset())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateContact")
    public void createAContact() throws JsonProcessingException {
        contactToSend.setFirstName("contact from java");
        contactToSend.setLastName("last name from java");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contactToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        RequestID.setIdContact(apiResponseObject.getId());
        RequestID.getIdFeature("ContactId");
    }

    @After("@DeleteContact")
    public void deleteAContact() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", RequestID.getIdContact())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateContract")
    public void createAContract() throws JsonProcessingException {
        contractToSend.setStatus("Draft");
        contractToSend.setAccountId(RequestID.getIdAccount());
        contractToSend.setStartDate("2021-06-27");
        contractToSend.setContractTerm(8);
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Contract/")
                .addBody(new ObjectMapper().writeValueAsString(contractToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        RequestID.setIdContract(apiResponseObject.getId());
        RequestID.getIdFeature("ContractId");
    }

    @After("@DeleteContract")
    public void deleteAContract() {
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Contract/{contractID}")
                .addPathParams("contractID", RequestID.getIdContract())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateOrder")
    public void createAnOrder() throws JsonProcessingException {
        orderToSend.setStatus("Draft");
        orderToSend.setAccountId(RequestID.getIdAccount());
        orderToSend.setContractId(RequestID.getIdContract());
        orderToSend.setEffectiveDate("2021-07-28");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Order/")
                .addBody(new ObjectMapper().writeValueAsString(orderToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        RequestID.setIdOrder(apiResponseObject.getId());
        RequestID.getIdFeature("OrderId");
    }

    @After("@DeleteOrder")
    public void deleteAnOrder() {
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Order/{orderID}")
                .addPathParams("orderID", RequestID.getIdOrder())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }
}
