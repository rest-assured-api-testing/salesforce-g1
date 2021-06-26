package rest.salesforce.org.hooks;

import api.*;
//import api.RequestID;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static configfile.Configuration.dotenv;

public class Hooks {
    public Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequestBuilder requestBuilder;
    private ApiResponseObject apiResponseObject;
    private ApiResponse apiResponse;
    private RequestID requestID;
//    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
//    ApiResponseObject apiResponseObject = new ApiResponseObject();
//    ApiResponse apiResponse = new ApiResponse();
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

    public Hooks(ApiRequestBuilder requestBuilder, ApiResponseObject apiResponseObject, ApiResponse apiResponse, RequestID requestID) {
        this.requestBuilder = requestBuilder;
        this.apiResponseObject = apiResponseObject;
        this.apiResponse = apiResponse;
        this.requestID = requestID;
    }

//    @Before("@SetUpConfig")
//    public void setUpConfig() throws JsonProcessingException {
//        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
//        apiRequestBuilder
//                .addBaseUri(dotenv.get("AUTH_URL"))
//                .addEndpoint("/services/oauth2/token")
//                .addQueryParams("grant_type", "password")
//                .addQueryParams("client_id",dotenv.get("CLIENT_ID"))
//                .addQueryParams("client_secret",dotenv.get("CLIENT_SECRET"))
//                .addQueryParams("username",dotenv.get("SALESFORCE_USERNAME"))
//                .addQueryParams("password",dotenv.get("PASSWORD_TOKEN"))
//                .addHeader("Accept", "application/json")
//                .addHeader("Content-Type", "application/x-www-form-urlencoded")
//                .addMethod(ApiMethod.POST);
//        ApiResponse apiResponseToken = ApiManager.execute(apiRequestBuilder.build());
//        token = apiResponseToken.getPath("token_type") + " " + apiResponseToken.getPath("access_token");
//    }

    @Before(value = "@CreateAccount", order = 1)
    public void createAnAccount() throws JsonProcessingException {
        LOGGER.info("======================> Create Account");
        accountToSend.setName("New Account used for testing");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setIdAccount(apiResponseObject.getId());
        System.out.println("========account creado " + requestID.getIdAccount());
    }

    @After(value = "@DeleteAccount")
    public void deleteAnAccount() {
        LOGGER.info("======================> Delete Account");
        System.out.println("========account eliminar " + requestID.getIdAccount());
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", requestID.getIdAccount())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before(value = "@CreateAsset", order = 2)
    public void createAnAsset() throws JsonProcessingException {
        LOGGER.info("======================> Create Asset");
        assetToSend.setName("asset name from java");
        assetToSend.setAccountId(requestID.getIdAccount());
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Asset/")
                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
                .addMethod(ApiMethod.POST)
                .build();
//        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
//        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
//        RequestID.setIdAsset(apiResponseObject.getId());
//        RequestID.getIdFeature("AssetId");
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setIdAsset(apiResponseObject.getId());
        System.out.println("========account creado " + requestID.getIdAsset());
    }

    @After("@DeleteAsset")
    public void deleteAnAsset() {
        LOGGER.info("======================> Delete Asset");
        System.out.println("========asset eliminar " + requestID.getIdAsset());
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", requestID.getIdAsset())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before("@CreateContact")
    public void createAContact() throws JsonProcessingException {
        LOGGER.info("======================> Create Contact");
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
//        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
//        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
//        RequestID.setIdContact(apiResponseObject.getId());
//        RequestID.getIdFeature("ContactId");
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setIdContact(apiResponseObject.getId());
        System.out.println("========contact creado " + requestID.getIdContact());
    }

    @After("@DeleteContact")
    public void deleteAContact() {
        LOGGER.info("======================> Delete Contact");
        System.out.println("========contact eliminar " + requestID.getIdContact());
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", requestID.getIdContact())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before(value = "@CreateContract", order = 3)
    public void createAContract() throws JsonProcessingException {
        LOGGER.info("======================> Create Contract");
        contractToSend.setStatus("Draft");
        contractToSend.setAccountId(requestID.getIdAccount());
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
//        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
//        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
//        RequestID.setIdContract(apiResponseObject.getId());
//        RequestID.getIdFeature("ContractId");
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setIdContract(apiResponseObject.getId());
        System.out.println("========contract creado " + requestID.getIdContract());
    }

    @After("@DeleteContract")
    public void deleteAContract() {
        LOGGER.info("======================> Delete Contract");
        System.out.println("========contract eliminar " + requestID.getIdContract());
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Contract/{contractID}")
                .addPathParams("contractID", requestID.getIdContract())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before(value = "@CreateOrder", order = 4)
    public void createAnOrder() throws JsonProcessingException {
        LOGGER.info("======================> Create Order");
        orderToSend.setStatus("Draft");
        orderToSend.setAccountId(requestID.getIdAccount());
        orderToSend.setContractId(requestID.getIdContract());
        orderToSend.setEffectiveDate("2021-07-28");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Order/")
                .addBody(new ObjectMapper().writeValueAsString(orderToSend))
                .addMethod(ApiMethod.POST)
                .build();
//        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
//        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
//        RequestID.setIdOrder(apiResponseObject.getId());
//        RequestID.getIdFeature("OrderId");
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setIdOrder(apiResponseObject.getId());
        System.out.println("========order creado " + requestID.getIdOrder());
    }

    @After("@DeleteOrder")
    public void deleteAnOrder() {
        LOGGER.info("======================> Delete Contract");
        System.out.println("========contract eliminar " + requestID.getIdOrder());
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Order/{orderID}")
                .addPathParams("orderID", requestID.getIdOrder())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }
}
