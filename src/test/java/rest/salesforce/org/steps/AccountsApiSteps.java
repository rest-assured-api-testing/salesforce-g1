package rest.salesforce.org.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
    public void iExecuteTheGetAllAccountsRequestOnEndpoint(String arg0) {
    }

    @Then("The response status code should be {string} on get all Accounts request")
    public void theResponseStatusCodeShouldBeOnGetAllAccountsRequest(String arg0) {
    }

    @Given("I build a {string} request for an Account")
    public void iBuildARequestForAnAccount(final String apiMethod) {
    }

    @When("I execute the post Account request on {string} endpoint")
    public void iExecuteThePostAccountRequestOnEndpoint(String arg0) {
    }

    @Then("The response status code should be {string} on post Account request")
    public void theResponseStatusCodeShouldBeOnPostAccountRequest(String arg0) {
    }

    @When("I execute the patch Account request on {string} endpoint")
    public void iExecuteThePatchAccountRequestOnEndpoint(String arg0) {
    }

    @Then("The response status code should be {string} on patch Account request")
    public void theResponseStatusCodeShouldBeOnPatchAccountRequest(String arg0) {
    }

    @When("I execute the delete Account request on {string} endpoint")
    public void iExecuteTheDeleteAccountRequestOnEndpoint(String arg0) {
    }

    @Then("The response status code should be {string} on delete Account request")
    public void theResponseStatusCodeShouldBeOnDeleteAccountRequest(String arg0) {
    }
}
