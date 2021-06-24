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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersApiSteps {
    @Before("@CreateAndDeleteOrder")
    public void createAnOrder() {
    }

    @After("@CreateAndDeleteOrder")
    public void deleteAnOrder() {
    }

    @Before("@CreateOrder")
    public void createOrder() {
    }

    @After("@DeleteOrder")
    public void deleteOrder() {
    }

    @Given("I build a {string} request for a single Order")
    public void iBuildARequestForASingleOrder(final String apiMethod) {
    }

    @When("I execute the get single Order request on {string} endpoint")
    public void iExecuteTheGetSingleOrderRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get single Order request")
    public void theResponseStatusCodeShouldBeOnGetSingleOrderRequest(final String statusCode) {
    }

    @Given("I build a {string} request for all Orders")
    public void iBuildARequestForAllOrders(final String apiMethod) {
    }

    @When("I execute the get all Orders request on {string} endpoint")
    public void iExecuteTheGetAllOrdersRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on get all Orders request")
    public void theResponseStatusCodeShouldBeOnGetAllOrdersRequest(final String statusCode) {
    }

    @Given("I build a {string} request for a Order")
    public void iBuildARequestForAOrder(final String apiMethod) {
    }

    @When("I execute the post Order request on {string} endpoint")
    public void iExecuteThePostOrderRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on post Order request")
    public void theResponseStatusCodeShouldBeOnPostOrderRequest(final String statusCode) {
    }

    @When("I execute the patch Order request on {string} endpoint")
    public void iExecuteThePatchOrderRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on patch Order request")
    public void theResponseStatusCodeShouldBeOnPatchOrderRequest(final String statusCode) {
    }

    @When("I execute the delete Order request on {string} endpoint")
    public void iExecuteTheDeleteOrderRequestOnEndpoint(final String endpoint) {
    }

    @Then("The response status code should be {string} on delete Order request")
    public void theResponseStatusCodeShouldBeOnDeleteOrderRequest(final String statusCode) {
    }

    @When("I create Order body with start date {string}")
    public void iCreateOrderBodyWithStartDate(final String orderStartDate) {
    }
}
