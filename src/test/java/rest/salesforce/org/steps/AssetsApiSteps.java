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
import entities.Asset;
import entities.responseobject.ResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static configfile.Configuration.dotenv;

public class AssetsApiSteps {
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    ResponseObject responseObject = new ResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    Asset assetToSend = new Asset();
    @Before("@CreateAndDeleteAsset")
    public void createAnAsset() throws JsonProcessingException {
        assetToSend.setName("asset name from java");
        assetToSend.setAccountId("0015e00000BFWjNAAX");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Asset/")
                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@CreateAndDeleteAsset")
    public void deleteAnAsset() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateAsset")
    public void createAsset() {
    }

    @After("@DeleteAsset")
    public void deleteAsset() {
    }

    @Given("I build {string} request for a single Asset")
    public void iBuildRequestForASingleAsset(final String apiMethod) {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.GET);
    }

    @When("I execute the get single Asset request on {string} endpoint")
    public void iExecuteTheGetSingleAssetRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint("/Asset/{assetID}")
                .addPathParams("assetID", responseObject.getId())
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on get single Asset request")
    public void theResponseStatusCodeShouldBeOnGetSingleAssetRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
        apiResponse.getResponse().then().log().body();
    }

    @Given("I build a {string} request for all Assets")
    public void iBuildARequestForAllAssets(final String apiMethod) {
    }

    @When("I execute the get all Assets request on {string} endpoint")
    public void iExecuteTheGetAllAssetsRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get all Assets request")
    public void theResponseStatusCodeShouldBeOnGetAllAssetsRequest(final String statusCode) {
    }

    @Given("I build a {string} request for an Asset")
    public void iBuildARequestForAnAsset(final String apiMethod) {
    }

    @And("I execute the post Asset request on {string} endpoint")
    public void iExecuteThePostAssetRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on post Asset request")
    public void theResponseStatusCodeShouldBeOnPostAssetRequest(final String statusCode) {
    }

    @And("I execute the patch Asset request on {string} endpoint")
    public void iExecuteThePatchAssetRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on patch Asset request")
    public void theResponseStatusCodeShouldBeOnPatchAssetRequest(final String statusCode) {
    }

    @When("I execute the delete Asset request on {string} endpoint")
    public void iExecuteTheDeleteAssetRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on delete Asset request")
    public void theResponseStatusCodeShouldBeOnDeleteAssetRequest(final String statusCode) {
    }

    @When("I create Asset body with name {string}")
    public void iCreateAssetBodyWithName(final String assetName) {
    }
}
