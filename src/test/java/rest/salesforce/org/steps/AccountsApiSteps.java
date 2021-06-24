/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequestBuilder;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import entities.ResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static configfile.Configuration.dotenv;
public class AccountsApiSteps {
    ResponseObject responseObject = new ResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    Account account = new Account();

    @Before("@CreateAndDeleteAccount")
    public void createAnAccount() throws JsonProcessingException {
        account.setName("cristian choque from java");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(account))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@CreateAndDeleteAccount")
    public void deleteAnAccount() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateAccount")
    public void createAccount() throws JsonProcessingException {
        account.setName("account name to test");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(account))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }
    @After("@DeleteAccount")
    public void deleteAccount() {
    }

    @Given("I build a {string} request for a single Account")
    public void iBuildARequestForASingleAccount(final String apiMethod) {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.GET);
    }

    @When("I execute the get single Account request on {string} endpoint")
    public void iExecuteTheGetSingleAccountRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", responseObject.getId())
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on get single Account request")
    public void theResponseStatusCodeShouldBeOnGetSingleAccountRequest(final String statusCCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
        apiResponse.getResponse().then().log().body();
    }

    @Given("I build a {string} request for all Accounts")
    public void iBuildARequestForAllAccounts(final String apiMethod) {
    }
    @When("I execute the get all Accounts request on {string} endpoint")
    public void iExecuteTheGetAllAccountsRequestOnEndpoint(final String endpoint) {
    }
    @Then("The response status code should be {string} on get all Accounts request")
    public void theResponseStatusCodeShouldBeOnGetAllAccountsRequest(final String statusCode) {
    }
    @Given("I build a {string} request for an Account")
    public void iBuildARequestForAnAccount(final String apiMethod) {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"));
    }
    @And("I execute the post Account request on {string} endpoint")
    public void iExecuteThePostAccountRequestOnEndpoint(final String endpoint) {
    }
    @Then("The response status code should be {string} on post Account request")
    public void theResponseStatusCodeShouldBeOnPostAccountRequest(final String statusCode) {
    }
    @And("I execute the patch Account request on {string} endpoint")
    public void iExecuteThePatchAccountRequestOnEndpoint(final String endpoint) {
    }
    @Then("The response status code should be {string} on patch Account request")
    public void theResponseStatusCodeShouldBeOnPatchAccountRequest(final String statusCode) {
    }
    @When("I execute the delete Account request on {string} endpoint")
    public void iExecuteTheDeleteAccountRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams("AccountId", responseObject.getId().toString())
                .addMethod(ApiMethod.DELETE)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }
    @Then("The response status code should be {string} on delete Account request")
    public void theResponseStatusCodeShouldBeOnDeleteAccountRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }
    @When("I create Account body with name {string}")
    public void iCreateAccountBodyWithName(final String accountName) {
    }
}
