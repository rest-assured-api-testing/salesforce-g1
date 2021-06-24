package rest.salesforce.org.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import api.ApiResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Map;

import static configfile.Configuration.dotenv;

public class ApiSteps {
    ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    ApiResponseObject apiResponseObject = new ApiResponseObject();
    ApiResponse apiResponse = new ApiResponse();
    Account accountToSend = new Account();

    @After("@DeleteAccount")
    public void deleteAccount() {
        requestBuilder
                .clearPathParams()
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", apiResponseObject.getId().toString())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }

    @Given("I build a {string} request")
    public void iBuildARequest(final String apiMethod) {
        requestBuilder.addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.valueOf(apiMethod));
    }

    @When("^I create body with parameters$")
    public void iCreateBodyWithParameters(final Map<String, String> entry) throws JsonProcessingException {
        accountToSend.setName(entry.get("name"));
        requestBuilder.addBody(new ObjectMapper().writeValueAsString(accountToSend));
    }

    @And("I execute the request on {string} endpoint")
    public void iExecuteTheRequestOnEndpoint(final String endpoint) {
        requestBuilder
                .addEndpoint(endpoint)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        apiResponseObject = apiResponse.getBody(ApiResponseObject.class);
    }

    @Then("The response status code should be {string}")
    public void theResponseStatusCodeShouldBe(final String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).getValue());
    }
}
