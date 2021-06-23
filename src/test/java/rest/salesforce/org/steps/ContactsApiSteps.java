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

public class ContactsApiSteps {
    @Before("@CreateAndDeleteContact")
    public void createAContact() {
    }

    @After("@CreateAndDeleteContact")
    public void deleteAContact() {
    }

    @Before("@CreateContact")
    public void createContact() {
    }

    @After("@DeleteContact")
    public void deleteContact() {
    }

    @Given("I build a {string} request for a single Contact")
    public void iBuildARequestForASingleContact(final String apiMethod) {
    }

    @When("I execute the get single Contact request on {string} endpoint")
    public void iExecuteTheGetSingleContactRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get single Contact request")
    public void theResponseStatusCodeShouldBeOnGetSingleContactRequest(final String statusCode) {
    }

    @Given("I build a {string} request for all Contacts")
    public void iBuildARequestForAllContacts(final String apiMethod) {
    }

    @When("I execute the get all Contacts request on {string} endpoint")
    public void iExecuteTheGetAllContactsRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get all Contacts request")
    public void theResponseStatusCodeShouldBeOnGetAllContactsRequest(final String statusCode) {
    }

    @Given("I build a {string} request for a Contact")
    public void iBuildARequestForAContact(final String apiMethod) {
    }

    @And("I execute the post Contact request on {string} endpoint")
    public void iExecuteThePostContactRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on post Contact request")
    public void theResponseStatusCodeShouldBeOnPostContactRequest(final String statusCode) {
    }

    @And("I execute the patch Contact request on {string} endpoint")
    public void iExecuteThePatchContactRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on patch Contact request")
    public void theResponseStatusCodeShouldBeOnPatchContactRequest(final String statusCode) {
    }

    @When("I execute the delete Contact request on {string} endpoint")
    public void iExecuteTheDeleteContactRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on delete Contact request")
    public void theResponseStatusCodeShouldBeOnDeleteContactRequest(final String statusCode) {
    }

    @When("I create Contact body with name {string}")
    public void iCreateContactBodyWithName(final String contactName) {
    }
}
