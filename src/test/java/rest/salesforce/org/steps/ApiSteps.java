package rest.salesforce.org.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import entities.responseobject.ResponseObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static configfile.Configuration.dotenv;

public class ApiSteps {

//    private ApiRequest apiRequest = new ApiRequest();
//    private ApiResponse apiResponse;
//    Account account = new Account();
//    private String userToken = dotenv.get("TOKEN");
//    private String baseUri = dotenv.get("BASE_URL");

    private ApiRequestBuilder requestBuilder = new ApiRequestBuilder();
    private ResponseObject responseObject = new ResponseObject();
    private ApiResponse apiResponse = new ApiResponse();
    Account accountToSend = new Account();

    @Before
    public void createAccount() throws JsonProcessingException {
        accountToSend.setName("cristian choque desde java");
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .clearPathParams()
                .addEndpoint("/Account/")
                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
                .addMethod(ApiMethod.POST)
                .build();
        apiResponse = ApiManager.executeWithBody(requestBuilder.build());
        responseObject = apiResponse.getBody(ResponseObject.class);
    }

    @Given("I build {string} request")
    public void iBuildRequest(String arg0) {
        requestBuilder.addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addMethod(ApiMethod.GET);
    }

    @When("I execute {string} method from {string} request")
    public void iExecuteMethodFromRequest(String arg0, String arg1) {
        requestBuilder.addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", responseObject.getId())
                .build();
        apiResponse = ApiManager.execute(requestBuilder.build());
    }

    @Then("the response status code should be {string}")
    public void theResponseStatusCodeShouldBe(String arg0) {
        Assert.assertEquals(apiResponse.getStatusCode(), 200);
        apiResponse.getResponse().then().log().body();
    }

    @After
    public void deleteAccount() {
        requestBuilder
                .addToken(dotenv.get("TOKEN"))
                .addBaseUri(dotenv.get("BASE_URL"))
                .addEndpoint("/Account/{accountID}")
                .addPathParams("accountID", responseObject.getId())
                .addMethod(ApiMethod.DELETE)
                .build();
        ApiManager.execute(requestBuilder.build());
    }


}
