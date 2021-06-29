/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.org.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.*;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import rest.salesforce.org.RequestID;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class ApiSteps {
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
    public void iCreateBodyWithParameters(final String featureType, final Map<String, String> entry) throws JsonProcessingException, ParseException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        feature = featureFactory.getFeature(featureType);
        Map fieldIdMap = requestID.createMapFields();
        Map completeFields = new HashMap(fieldIdMap);
        completeFields.putAll(entry);
        feature.setAllFields(completeFields);
        requestBuilder.addBody(new ObjectMapper().writeValueAsString(feature));
    }

    @And("I execute the request on {string} endpoint")
    public void iExecuteTheRequestOnEndpoint(final String endpoint) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
        requestID.setField(requestID.nameConverter(endpoint), apiResponseObject.getId());
    }

    @Then("The response status code should be {string}")
    public void theResponseStatusCodeShouldBe(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).getValue());
        apiResponse.getResponse().then().log().body();
    }

    @When("I execute the request on {string} endpoint and {string} param")
    public void iExecuteTheRequestOnEndpointAndParam(final String endpoint, final String param) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, requestID.getField(requestID.nameConverter(param)))
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
    public void iExecuteTheRequestWithBodyOnEndpointAndParam(final String endpoint, final String param) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, requestID.getField(requestID.nameConverter(param)))
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
    }

    @When("^I set \"(.*?)\" body with parameters$")
    public void iSetBodyWithParameters(final String featureType, final Map<String, String> entry) throws JsonProcessingException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        feature = featureFactory.getFeature(featureType);
        feature.setAllFields(entry);
        requestBuilder.setBody(new ObjectMapper().writeValueAsString(feature));
    }

    @When("I execute the request on {string} endpoint and {string} param with {string} value")
    public void iExecuteTheRequestOnEndpointAndParamWithParam(final String endpoint, final String param,
                                                              final String paramValue) {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, paramValue)
                .build();
        ApiManager.execute(requestBuilder.build(), apiResponse);
    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public String stringType(final String cell) {
        return cell;
    }
}
