package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequestBuilder;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.Before;

import static configfile.Configuration.dotenv;

public class Hooks {
    String token;

    @Before("@SetUpConfig")
    public void setUpConfig() throws JsonProcessingException {
        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
        apiRequestBuilder
                .addBaseUri(dotenv.get("AUTH_URL"))
                .addEndpoint("/services/oauth2/token")
                .addQueryParams("grant_type", "password")
                .addQueryParams("client_id",dotenv.get("CLIENT_ID"))
                .addQueryParams("client_secret",dotenv.get("CLIENT_SECRET"))
                .addQueryParams("username",dotenv.get("USERNAME1"))
                .addQueryParams("password",dotenv.get("PASSWORD_TOKEN"))
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addMethod(ApiMethod.POST);
        ApiResponse apiResponseToken = ApiManager.execute(apiRequestBuilder.build());
        token = apiResponseToken.getPath("token_type") + " " + apiResponseToken.getPath("access_token");
    }
}
