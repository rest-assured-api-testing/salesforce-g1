package rest.salesforce.org.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.text.ParseException;
import java.util.Map;

import static configfile.Configuration.dotenv;

public class ApiSteps {
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    ApiResponseObject apiResponseObject = new ApiResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    Account accountToSend = new Account();
    Asset assetToSend = new Asset();
    Contact contactToSend = new Contact();
    Contract contractToSend = new Contract();
    Order orderToSend = new Order();

    @Given("I build a {string} request")
    public void iBuildARequest(final String apiMethod) {
        requestBuilder.addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.valueOf(apiMethod));
    }

    @When("^I create body with parameters$")
    public void iCreateBodyWithParameters(final Map<String, String> entry) throws JsonProcessingException, ParseException {
        if (entry.get("object").equals("Account")) {
            accountToSend.setName(entry.get("name"));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(accountToSend));
        } else if (entry.get("object").equals("Asset")) {
            assetToSend.setName(entry.get("name"));
            assetToSend.setAccountId(entry.get("accountId"));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(assetToSend));
        } else if (entry.get("object").equals("Contact")) {
            contactToSend.setLastName(entry.get("lastName"));
            contactToSend.setAccountId(entry.get("accountId"));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(contactToSend));
        } else if (entry.get("object").equals("Contract")) {
            contractToSend.setAccountId(entry.get("accountId"));
            contractToSend.setStatus(entry.get("status"));
            contractToSend.setStartDate(entry.get("startDate"));
            contractToSend.setContractTerm(Integer.parseInt(entry.get("contractTerm")));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(contractToSend));
        } else if (entry.get("object").equals("Order")) {
            orderToSend.setAccountId(entry.get("accountId"));
            orderToSend.setStatus(entry.get("status"));
            orderToSend.setEffectiveDate(entry.get("effectiveDate"));
            orderToSend.setContractId(entry.get("contractId"));
            requestBuilder.addBody(new ObjectMapper().writeValueAsString(orderToSend));
        }
    }

    @And("I execute the request on {string} endpoint")
    public void iExecuteTheRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        RequestID.setIdAccount(apiResponseObject.getId());
    }

    @Then("The response status code should be {string}")
    public void theResponseStatusCodeShouldBe(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).getValue());
        apiResponse.getResponse().then().log().body();
    }

    @When("I execute the request on {string} endpoint and {string} param")
    public void iExecuteTheRequestOnEndpointAndParam(final String endpoint, final String param) {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, RequestID.getIdFeature(param))
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @When("I execute the request on {string}")
    public void iExecuteTheRequestOn(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @And("I execute the request with body on {string} endpoint and {string} param")
    public void iExecuteTheRequestWithBodyOnEndpointAndParam(final String endpoint, final String param) {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, RequestID.getIdFeature(param))
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
    }

    @When("^I set body with parameters$")
    public void iSetBodyWithParameters(final Map<String, String> entry) throws JsonProcessingException {
        accountToSend.setName(entry.get("name"));
        requestBuilder.setBody(new ObjectMapper().writeValueAsString(accountToSend));
    }
}
