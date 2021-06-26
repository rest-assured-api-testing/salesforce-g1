/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class ApiManager {

    /**
     * Executes a ApiRequest without body.
     * @param apiRequest
     * @return a ApiResponse after execution of request.
     */
    public static void execute(ApiRequest apiRequest, ApiResponse apiResponse) {
        Response response = buildRequest(apiRequest).request(apiRequest.getMethod().name(), apiRequest.getEndpoint());
        apiResponse.setResponse(response);
    }

    /**
     * Builds a RequestSpecification.
     * @param apiRequest
     * @return RequestSpecification.
     */
    private static RequestSpecification buildRequest(ApiRequest apiRequest) {
        return given()
                .headers(apiRequest.getHeaders())
                .queryParams(apiRequest.getQueryParams())
                .pathParams(apiRequest.getPathParams())
                .baseUri(apiRequest.getBaseUri())
                .contentType(ContentType.JSON)
                .auth()
                .oauth2(apiRequest.getToken())
                .log()
                .all();
    }

    /**
     * Executes a ApiRequest with body.
     * @param apiRequest
     * @return a ApiResponse after execution of request.
     */
    public static void executeWithBody(ApiRequest apiRequest, ApiResponse apiResponse){
        Response response = buildRequest(apiRequest)
                .body(apiRequest.getBody())
                .request(apiRequest.getMethod().name(), apiRequest.getEndpoint());
        apiResponse.setResponse(response);
    }

}
