/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.org.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssetsApiSteps {
    @Before("@CreateAndDeleteAsset")
    public void createAnAsset() {
    }

    @After("@CreateAndDeleteAsset")
    public void deleteAnAsset() {
    }

    @Before("@CreateAsset")
    public void createAsset() {
    }

    @After("@DeleteAsset")
    public void deleteAsset() {
    }

    @Given("I build {string} request for a single Asset")
    public void iBuildRequestForASingleAsset(final String apiMethod) {
    }

    @When("I execute the get single Asset request on {string} endpoint")
    public void iExecuteTheGetSingleAssetRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get single Asset request")
    public void theResponseStatusCodeShouldBeOnGetSingleAssetRequest(final String statusCode) {
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
