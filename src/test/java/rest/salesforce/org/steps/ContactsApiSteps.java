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
import entities.Contact;
import entities.ResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static configfile.Configuration.dotenv;

public class ContactsApiSteps {
    ResponseObject responseObject = new ResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    Contact contact = new Contact();

    @Before("@CreateAndDeleteContact")
    public void createAContact() throws JsonProcessingException {
        contact.setFirstName("contact from java");
        contact.setLastName("last name from java");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contact))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@CreateAndDeleteContact")
    public void deleteAContact() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateAAAContact")
    public void createContact() throws JsonProcessingException {
        contact.setFirstName("contact name to test");
        contact.setLastName("contact last name to test");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Contact/")
                .addBody(new ObjectMapper().writeValueAsString(contact))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@DeleteAAAContact")
    public void deleteContact() {
    }

    @Given("I build a {string} request for a single Contact")
    public void iBuildARequestForASingleContact(final String apiMethod) {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.GET);
    }

    @When("I execute the get single Contact request on {string} endpoint")
    public void iExecuteTheGetSingleContactRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint("/Contact/{contactID}")
                .addPathParams("contactID", responseObject.getId())
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on get single Contact request")
    public void theResponseStatusCodeShouldBeOnGetSingleContactRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
        apiResponse.getResponse().then().log().body();
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
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"));
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
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams("ContactId", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on delete Contact request")
    public void theResponseStatusCodeShouldBeOnDeleteContactRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }

    @When("I create Contact body with name {string}")
    public void iCreateContactBodyWithName(final String contactName) {
    }
}
