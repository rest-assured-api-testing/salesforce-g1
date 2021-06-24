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
import entities.Contract;
import entities.ResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static configfile.Configuration.dotenv;

public class ContractsApiSteps {
    private ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    private ResponseObject responseObject = new ResponseObject();
    private ApiResponse apiResponse = new ApiResponse();
    Contract contractToSend = new Contract();

    @Before("@CreateAndDeleteContract")
    public void createAContract() throws JsonProcessingException {
        contractToSend.setStatus("Draft");
        contractToSend.setAccountId("0015e00000BFWjNAAX");
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
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@CreateAndDeleteContract")
    public void deleteAContract() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Contract/{contractID}")
                .addPathParams("contractID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateContract")
    public void createContract() {
    }

    @After("@DeleteContract")
    public void deleteContract() {
    }

    @Given("I build a {string} request for a single Contract")
    public void iBuildARequestForASingleContract(final String apiMethod) {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.GET);
    }

    @When("I execute the get single Contract request on {string} endpoint")
    public void iExecuteTheGetSingleContractRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint("/Contract/{contractID}")
                .addPathParams("contractID", responseObject.getId())
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on get single Contract request")
    public void theResponseStatusCodeShouldBeOnGetSingleContractRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
        apiResponse.getResponse().then().log().body();
    }

    @Given("I build a {string} request for all Contracts")
    public void iBuildARequestForAllContracts(final String apiMethod) {
    }

    @When("I execute the get all Contracts request on {string} endpoint")
    public void iExecuteTheGetAllContractsRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get all Contracts request")
    public void theResponseStatusCodeShouldBeOnGetAllContractsRequest(final String statusCode) {
    }

    @Given("I build a {string} request for a Contract")
    public void iBuildARequestForAContract(final String apiMethod) {
    }

    @And("I execute the post Contract request on {string} endpoint")
    public void iExecuteThePostContractRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on post Contract request")
    public void theResponseStatusCodeShouldBeOnPostContractRequest(final String statusCode) {
    }

    @And("I execute the patch Contract request on {string} endpoint")
    public void iExecuteThePatchContractRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on patch Contract request")
    public void theResponseStatusCodeShouldBeOnPatchContractRequest(final String statusCode) {
    }

    @When("I execute the delete Contract request on {string} endpoint")
    public void iExecuteTheDeleteContractRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on delete Contract request")
    public void theResponseStatusCodeShouldBeOnDeleteContractRequest(final String statusCode) {
    }

    @When("I create Contract body with start date {string}")
    public void iCreateContractBodyWithStartDate(final String contractStartDate) {
    }
}
