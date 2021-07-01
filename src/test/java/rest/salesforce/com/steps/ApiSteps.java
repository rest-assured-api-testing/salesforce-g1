/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.com.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import salesforce.FeaturesId;
import salesforce.SalesforceApiResponse;
import salesforce.entities.features.FeatureFactory;
import salesforce.entities.features.Features;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class ApiSteps {
    private SalesforceApiResponse salesforceApiResponse;
    public FeaturesId featuresID;
    ApiRequestBuilder requestBuilder;
    ApiResponse apiResponse;
    Features feature;
    FeatureFactory featureFactory = new FeatureFactory();

    public ApiSteps(ApiRequestBuilder requestBuilder, SalesforceApiResponse salesforceApiResponse, FeaturesId featuresID, ApiResponse apiResponse) {
        this.requestBuilder = requestBuilder;
        this.salesforceApiResponse = salesforceApiResponse;
        this.featuresID = featuresID;
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
        Map fieldIdMap = featuresID.createMapFields();
        Map completeFields = new HashMap(fieldIdMap);
        completeFields.putAll(entry);
        feature.setAllFields(completeFields);
        requestBuilder.addBody(new ObjectMapper().writeValueAsString(feature));
    }

    @And("I execute request on {string}")
    public void iExecuteRequestOn(final String endpoint) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
        salesforceApiResponse = apiResponse.getBody(SalesforceApiResponse.class);
        featuresID.setField(featuresID.nameConverter(endpoint), salesforceApiResponse.getId());
    }

    @Then("The response status should be {string}")
    public void theResponseStatusShouldBe(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).getValue());
        apiResponse.getResponse().then().log().body();
    }

    @When("I execute request on {string} with {string}")
    public void iExecuteRequestOnWith(final String endpoint, final String param) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, featuresID.getField(featuresID.nameConverter(param)))
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

    @And("I execute request on {string} with {string} and body")
    public void iExecuteRequestOnWithAndBody(final String endpoint, final String param) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        requestBuilder
                .addEndpoint(endpoint)
                .addPathParams(param, featuresID.getField(featuresID.nameConverter(param)))
                .build();
        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
    }

    @When("^I set \"(.*?)\" body with parameters$")
    public void iSetBodyWithParameters(final String featureType, final Map<String, String> entry) throws JsonProcessingException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        feature = featureFactory.getFeature(featureType);
        feature.setAllFields(entry);
        requestBuilder.setBody(new ObjectMapper().writeValueAsString(feature));
    }

    @When("I execute request on {string} with {string} as {string}")
    public void iExecuteRequestOnWithAs(final String endpoint, final String param,
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

    @And("The response schema matches {string}")
    public void theResponseSchemaMatches(final String schemaPath) {
        apiResponse.validateBodySchema(schemaPath);
    }
}
