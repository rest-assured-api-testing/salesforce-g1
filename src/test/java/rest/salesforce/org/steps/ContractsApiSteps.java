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

public class ContractsApiSteps {
    @Before("@CreateAndDeleteContract")
    public void createAContract() {
    }

    @After("@CreateAndDeleteContract")
    public void deleteAContract() {
    }

    @Before("@CreateContract")
    public void createContract() {
    }

    @After("@DeleteContract")
    public void deleteContract() {
    }

    @Given("I build a {string} request for a single Contract")
    public void iBuildARequestForASingleContract(final String apiMethod) {
    }

    @When("I execute the get single Contract request on {string} endpoint")
    public void iExecuteTheGetSingleContractRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get single Contract request")
    public void theResponseStatusCodeShouldBeOnGetSingleContractRequest(final String statusCode) {
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
