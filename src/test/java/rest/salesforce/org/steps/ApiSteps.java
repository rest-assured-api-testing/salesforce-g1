/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.org.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import api.ApiResponseObject;
import entities.Asset;
import entities.Contact;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.Map;

import static configfile.Configuration.dotenv;

public class ApiSteps {
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    ApiResponseObject apiResponseObject = new ApiResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    Account accountToSend = new Account();
    Asset assetToSend = new Asset();
    Contact contactToSend = new Contact();

    @Before("@CreateAndDeleteAccount")
    public void createAnAccount() throws JsonProcessingException {
        accountToSend.setName("New Account used for testing");
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
    }

    @After("@CreateAndDeleteAccount")
    public void deleteAnAccount() {
        requestBuilder
                .clearPathParams()
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", apiResponseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateAccount")
    public void createAccount() throws JsonProcessingException {
        accountToSend.setName("New Account used for testing");
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
    }

    @After("@DeleteAccount")
    public void deleteAccount() {
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", apiResponseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @After("@DeleteAsset")
    public void deleteAsset() {
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", apiResponseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @After("@DeleteContact")
    public void deleteContact() {
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", apiResponseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Given("I build a {string} request")
    public void iBuildARequest(final String apiMethod) {
        requestBuilder.addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.valueOf(apiMethod));
    }

    @When("^I create body with parameters$")
    public void iCreateBodyWithParameters(final Map<String, String> entry) throws JsonProcessingException {
        if (entry.get("object").equals("Account")) {
            accountToSend.setName(entry.get("name"));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(accountToSend));
        } else if (entry.get("object").equals("Asset")) {
            assetToSend.setName(entry.get("name"));
            assetToSend.setAccountId(entry.get("accountId"));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(assetToSend));
        } else if (entry.get("object").equals("Contact")) {
            contactToSend.setLastName(entry.get("lastName"));
            contactToSend.setAccountId(entry.get("accountId"));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(contactToSend));
        }
    }

    @And("I execute the request on {string} endpoint")
    public void iExecuteTheRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
    }

    @Then("The response status code should be {string}")
    public void theResponseStatusCodeShouldBe(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).getValue());
    }

    @When("I execute the request on {string} endpoint and {string} param")
    public void iExecuteTheRequestOnEndpointAndParam(final String endpoint, final String param) {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, apiResponseObject.getId())
                .build();
        apiResponse = new ApiResponse(ApiManager.execute(requestBuilder.build()));
    }

    @When("I execute the request on {string}")
    public void iExecuteTheRequestOn(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        apiResponse = new ApiResponse(ApiManager.execute(requestBuilder.build()));
    }

    @And("I execute the request with body on {string} endpoint and {string} param")
    public void iExecuteTheRequestWithBodyOnEndpointAndParam(final String endpoint, final String param) {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, apiResponseObject.getId())
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
    }

    @When("^I set body with parameters$")
    public void iSetBodyWithParameters(final Map<String, String> entry) throws JsonProcessingException {
        accountToSend.setName(entry.get("name"));
        requestBuilder.setBody(new ObjectMapper().writeValueAsString(accountToSend));
    }
}
