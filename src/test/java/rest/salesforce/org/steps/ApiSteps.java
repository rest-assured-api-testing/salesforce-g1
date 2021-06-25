package rest.salesforce.org.steps;

import api.ApiResponseObject;
import api.ApiResponse;
import api.ApiRequestBuilder;
import api.ApiMethod;
import api.ApiManager;
import api.RequestID;
import api.ApiStatusCode;
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
    Features feature;
    FeatureFactory featureFactory = new FeatureFactory();

    @Given("I build a {string} request")
    public void iBuildARequest(final String apiMethod) {
        requestBuilder.addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.valueOf(apiMethod));
    }

    @When("^I create body with parameters$")
    public void iCreateBodyWithParameters(final Map entry) throws JsonProcessingException, ParseException {
        feature = featureFactory.getFeature((String) entry.get("featureType"));
        feature.setAllFields(entry);
        requestBuilder.addBody(new ObjectMapper().writeValueAsString(feature));
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
    public void iSetBodyWithParameters(final Map entry) throws JsonProcessingException {
        feature = featureFactory.getFeature((String) entry.get("featureType"));
        feature.setAllFields(entry);
        requestBuilder.setBody(new ObjectMapper().writeValueAsString(feature));
    }
}
