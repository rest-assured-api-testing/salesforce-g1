/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ApiResponse {

    private Response response;

    public ApiResponse(Response response) {
        this.response = response;
    }

    public ApiResponse() {
    }

    public Response getResponse() {
        return response;
    }

    /**
     * Gets the status of the code
     * @return
     */
    public int getStatusCode() {
        return response.getStatusCode();
    }

    /**
     * Gets a body
     * @param cls
     * @param <T>
     * @return Body response as class
     */
    public <T> T getBody(Class<T> cls) {
        return response.getBody().as(cls);
    }

    /**
     * Validates the schema of feature
     * @param schema
     */
    public void validateBodySchema(String schema) {
        response.then().log().body().assertThat().body(matchesJsonSchemaInClasspath(schema));
    }

}
