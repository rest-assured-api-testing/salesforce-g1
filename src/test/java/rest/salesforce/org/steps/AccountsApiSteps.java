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

public class AccountsApiSteps {
    @Before("@CreateAndDeleteAccount")
    public void createAnAccount() {
    }

    @After("@CreateAndDeleteAccount")
    public void deleteAnAccount() {
    }

    @Before("@CreateAccount")
    public void createAccount() {
    }

    @After("@DeleteAccount")
    public void deleteAccount() {
    }

    @Given("I build a {string} request for a single Account")
    public void iBuildARequestForASingleAccount(final String apiMethod) {
    }

    @When("I execute the get single Account request on {string} endpoint")
    public void iExecuteTheGetSingleAccountRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get single Account request")
    public void theResponseStatusCodeShouldBeOnGetSingleAccountRequest(final String statusCCode) {
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
    }

    @Then("The response status code should be {string} on delete Account request")
    public void theResponseStatusCodeShouldBeOnDeleteAccountRequest(final String statusCode) {
    }

    @When("I create Account body with name {string}")
    public void iCreateAccountBodyWithName(final String accountName) {
    }
}