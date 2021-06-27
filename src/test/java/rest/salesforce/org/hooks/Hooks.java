/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.org.hooks;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import static configfile.Configuration.dotenv;

public class Hooks {
    public Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequestBuilder requestBuilder;
    private ApiResponseObject apiResponseObject;
    private ApiResponse apiResponse;
    private RequestID requestID;
    private ApiResponse tokenApiResponse;
    Account accountToSend = new Account();
    Asset assetToSend = new Asset();
    Contact contactToSend = new Contact();
    Contract contractToSend = new Contract();
    Order orderToSend = new Order();
    String token;

    public Hooks(ApiRequestBuilder requestBuilder, ApiResponseObject apiResponseObject, ApiResponse apiResponse,
                 RequestID requestID, ApiResponse tokenApiResponse) {
        this.requestBuilder = requestBuilder;
        this.apiResponseObject = apiResponseObject;
        this.apiResponse = apiResponse;
        this.requestID = requestID;
        this.tokenApiResponse = tokenApiResponse;
    }

    @Before(order = 0)
    public void setUpConfig() throws JsonProcessingException {
        LOGGER.info("********************* TOKEN *********************");
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
        ApiManager.executeWithoutLog(apiRequestBuilder.build(), tokenApiResponse);
        token = tokenApiResponse.getPath("token_type") + " " + tokenApiResponse.getPath("access_token");
        LOGGER.info("********************* TOKEN *********************");
    }

    @Before(order = 1)
    public void setUp() {
        LOGGER.info("********************* Setup *********************");
        requestBuilder
                .addHeader("Authorization",token)
                .addBaseUri(dotenv.get("BASE_URL"));
    }

    @Before(value = "@CreateAccount", order = 2)
    public void createAnAccount() throws JsonProcessingException {
        LOGGER.info("********************* Create Account *********************");
        accountToSend.setName("New Account used for testing");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setAccountId(apiResponseObject.getId());
    }

    @After(value = "@DeleteAccount")
    public void deleteAnAccount() {
        LOGGER.info("********************* Delete Account *********************");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", requestID.getAccountId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before(value = "@CreateAsset", order = 3)
    public void createAnAsset() throws JsonProcessingException {
        LOGGER.info("********************* Create Asset *********************");
        assetToSend.setName("asset name from java");
        assetToSend.setAccountId(requestID.getAccountId());
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Asset/")
                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setAssetId(apiResponseObject.getId());
    }

    @After("@DeleteAsset")
    public void deleteAnAsset() {
        LOGGER.info("********************* Delete Asset *********************");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", requestID.getAssetId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before("@CreateContact")
    public void createAContact() throws JsonProcessingException {
        LOGGER.info("********************* Create Contact *********************");
        contactToSend.setFirstName("contact from java");
        contactToSend.setLastName("last name from java");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contactToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setContactId(apiResponseObject.getId());
    }

    @After("@DeleteContact")
    public void deleteAContact() {
        LOGGER.info("********************* Delete Contact *********************");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", requestID.getContactId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before(value = "@CreateContract", order = 4)
    public void createAContract() throws JsonProcessingException {
        LOGGER.info("********************* Create Contract *********************");
        contractToSend.setStatus("Draft");
        contractToSend.setAccountId(requestID.getAccountId());
        contractToSend.setStartDate("2021-06-27");
        contractToSend.setContractTerm(8);
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Contract/")
                .addBody(new ObjectMapper().writeValueAsString(contractToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setContractId(apiResponseObject.getId());
    }

    @After("@DeleteContract")
    public void deleteAContract() {
        LOGGER.info("********************* Delete Contract *********************");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Contract/{contractID}")
                .addPathParams("contractID", requestID.getContractId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @Before(value = "@CreateOrder", order = 5)
    public void createAnOrder() throws JsonProcessingException {
        LOGGER.info("********************* Create Order *********************");
        orderToSend.setStatus("Draft");
        orderToSend.setAccountId(requestID.getAccountId());
        orderToSend.setContractId(requestID.getContractId());
        orderToSend.setEffectiveDate("2021-07-28");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Order/")
                .addBody(new ObjectMapper().writeValueAsString(orderToSend))
                .addMethod(ApiMethod.POST)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject.setId(apiResponse.getBody(ApiResponseObject.class).getId());
        requestID.setOrderId(apiResponseObject.getId());
    }

    @After("@DeleteOrder")
    public void deleteAnOrder() {
        LOGGER.info("********************* Delete Order *********************");
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Order/{orderID}")
                .addPathParams("orderID", requestID.getOrderId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }
}