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
import entities.Asset;
import entities.ResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static configfile.Configuration.dotenv;

public class AssetsApiSteps {
    ResponseObject responseObject = new ResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    Asset asset = new Asset();
    Account account = new Account();
    String accountID = "";

    @Before("@CreateAndDeleteAsset")
    public void createAnAsset() throws JsonProcessingException {
        asset.setName("asset name from java");
        asset.setAccountId("0015e00000BFWjNAAX");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Asset/")
                .addBody(new ObjectMapper().writeValueAsString(asset))
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

    @Before("@CreateAAAAsset")
    public void createAsset() throws JsonProcessingException {
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
        accountID = responseObject.getId();

        asset.setName("asset name to test");
        asset.setAccountId(responseObject.getId());
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Asset/")
                .addBody(new ObjectMapper().writeValueAsString(asset))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@CreateAAAAsset")
    public void deleteAssetAccount() {
        requestBuilder
                .addEndpoint("/Account/{accountID}")
                .clearPathParams()
                .addPathParams("accountID", accountID)
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @After("@DeleteAAAAsset")
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
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"));
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
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams("AssetId", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on delete Asset request")
    public void theResponseStatusCodeShouldBeOnDeleteAssetRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }

    @When("I create Asset body with name {string}")
    public void iCreateAssetBodyWithName(final String assetName) {
    }
}
