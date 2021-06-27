package rest.salesforce.org.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;
import java.text.ParseException;
import java.util.Map;

public class ApiSteps {
    public Logger LOGGER = Logger.getLogger(getClass());
    private ApiResponseObject apiResponseObject;
    public RequestID requestID;
    ApiRequestBuilder requestBuilder;
    ApiResponse apiResponse;
    Features feature;
    FeatureFactory featureFactory = new FeatureFactory();

    public ApiSteps(ApiRequestBuilder requestBuilder, ApiResponseObject apiResponseObject, RequestID requestID, ApiResponse apiResponse) {
        this.requestBuilder = requestBuilder;
        this.apiResponseObject = apiResponseObject;
        this.requestID = requestID;
        this.apiResponse = apiResponse;
    }

    @Given("I build a {string} request")
    public void iBuildARequest(final String apiMethod) {
        requestBuilder
                .addMethod(ApiMethod.valueOf(apiMethod));
    }

    @When("^I create \"(.*?)\" body with parameters$")
    public void iCreateBodyWithParameters(final String featureType, final Map entry) throws JsonProcessingException, ParseException {
        feature = featureFactory.getFeature(featureType);
        feature.setAllFields(entry);
        requestBuilder.addBody(new ObjectMapper().writeValueAsString(feature));
    }

    @And("I execute the request on {string} endpoint")
    public void iExecuteTheRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        requestID.setIdAccount(apiResponseObject.getId());
    }

    @Then("The response status code should be {string}")
    public void theResponseStatusCodeShouldBe(final String statusCode) {
        System.out.println("status expected " + ApiStatusCode.valueOf(statusCode).getValue());
        System.out.println("status actual" + apiResponse.getStatusCode());
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).getValue());
        apiResponse.getResponse().then().log().body();
    }

    @When("I execute the request on {string} endpoint and {string} param")
    public void iExecuteTheRequestOnEndpointAndParam(final String endpoint, final String param) {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, requestID.getIdFeature(param))
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @When("I execute the request on {string}")
    public void iExecuteTheRequestOn(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @And("I execute the request with body on {string} endpoint and {string} param")
    public void iExecuteTheRequestWithBodyOnEndpointAndParam(final String endpoint, final String param) {
        System.out.println("========account para actualizar " + requestID.getIdFeature(param));
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, requestID.getIdFeature(param))
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
    }

    @When("^I set \"(.*?)\" body with parameters$")
    public void iSetBodyWithParameters(final String featureType, final Map entry) throws JsonProcessingException {
        feature = featureFactory.getFeature(featureType);
        feature.setAllFields(entry);
        requestBuilder.setBody(new ObjectMapper().writeValueAsString(feature));
    }
}
