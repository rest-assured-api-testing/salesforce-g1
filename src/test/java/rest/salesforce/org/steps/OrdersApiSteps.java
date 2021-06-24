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
import entities.Contract;
import entities.Order;
import entities.ResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static configfile.Configuration.dotenv;

public class OrdersApiSteps {
    ResponseObject responseObject = new ResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    Order order = new Order();
    Contract contract = new Contract();
    Account account = new Account();
    String accountID = "";
    String contractID = "";

    @Before("@CreateAndDeleteOrder")
    public void createAnOrder() throws JsonProcessingException {
        order.setStatus("Draft");
        order.setAccountId("0015e00000BFWjNAAX");
        order.setContractId("8005e0000009XEmAAM");
        order.setEffectiveDate("2021-07-28");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Order/")
                .addBody(new ObjectMapper().writeValueAsString(order))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@CreateAndDeleteOrder")
    public void deleteAnOrder() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Order/{orderID}")
                .addPathParams("orderID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Before("@CreateOrder")
    public void createOrder() throws JsonProcessingException {
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

        contract.setAccountId(responseObject.getId());
        contract.setStartDate("2021-06-25");
        contract.setContractTerm(2);
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Contract/")
                .addBody(new ObjectMapper().writeValueAsString(contract))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
        contractID = responseObject.getId();

        order.setAccountId(accountID);
        order.setContractId(contractID);
        order.setEffectiveDate("2021-06-30");
        order.setStatus("Draft");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Order/")
                .addBody(new ObjectMapper().writeValueAsString(order))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @After("@CreateOrder")
    public void deleteAssetAccount() {
        requestBuilder
                .addEndpoint("/Account/{accountID}")
                .clearPathParams()
                .addPathParams("accountID", accountID)
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());

        requestBuilder
                .addEndpoint("/Contract/{contractID}")
                .clearPathParams()
                .addPathParams("contractID", contractID)
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @After("@DeleteOrder")
    public void deleteOrder() {
    }

    @Given("I build a {string} request for a single Order")
    public void iBuildARequestForASingleOrder(final String apiMethod) {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.GET);
    }

    @When("I execute the get single Order request on {string} endpoint")
    public void iExecuteTheGetSingleOrderRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint("/Order/{orderID}")
                .addPathParams("orderID", responseObject.getId())
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on get single Order request")
    public void theResponseStatusCodeShouldBeOnGetSingleOrderRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
        apiResponse.getResponse().then().log().body();
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
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"));
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
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams("OrderId", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("The response status code should be {string} on delete Order request")
    public void theResponseStatusCodeShouldBeOnDeleteOrderRequest(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), 204);
    }

    @When("I create Order body with start date {string}")
    public void iCreateOrderBodyWithStartDate(final String orderStartDate) {
    }
}
