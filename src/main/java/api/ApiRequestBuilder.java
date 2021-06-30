/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

import io.restassured.http.Header;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helps to build an ApiRequest entity.
 */
public  class ApiRequestBuilder implements IBuilder{
    private String baseUri;
    private String endpoint;
    private String body;
    private String token;
    private Enum<ApiMethod> method;
    private List<Header> headers;
    private Map<String, String> queryParams;
    private Map<String, String> pathParms;

    public ApiRequestBuilder() {
        this.headers = new ArrayList<>();
        this.queryParams = new HashMap<>();
        this.pathParms = new HashMap<>();
    }

    /**
     * Adds Base uri in the request builder.
     *
     * @param baseUri Base of url.
     * @return Request builder with base uri.
     */
    public ApiRequestBuilder addBaseUri(String baseUri) {
        this.baseUri = baseUri;
        return this;
    }

    /**
     * Adds End point in the request builder.
     *
     * @param endpoint end point of the feature.
     * @return Request builder with end point.
     */
    public ApiRequestBuilder addEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Adds Body in the request builder.
     *
     * @param body body of the dates.
     * @return Request builder with body.
     */
    public ApiRequestBuilder addBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Adds Token in the request builder.
     *
     * @param token
     * @return Request builder with token
     */
    public ApiRequestBuilder addToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Adds Method in the request builder.
     *
     * @param method
     * @return Request builder with Method
     */
    public ApiRequestBuilder addMethod(Enum<ApiMethod> method) {
        this.method = method;
        return this;
    }

    /**
     * Adds Header in the request builder.
     *
     * @param header
     * @param value
     * @return Request builder with Header
     */
    public ApiRequestBuilder addHeader(final String header, final String value) {
        headers.add(new Header(header, value));
        return this;
    }

    /**
     * Adds Query params in the request builder.
     *
     * @param param
     * @param value
     * @return Request builder with Query params
     */
    public ApiRequestBuilder addQueryParams(final String param, final String value) {
        queryParams.put(param, value);
        return this;
    }

    /**
     * Adds Path params in the request builder.
     *
     * @param param
     * @param value
     * @return Request builder with Path params
     */
    public ApiRequestBuilder addPathParams(final String param, final String value) {
        pathParms.put(param, value);
        return this;
    }

    /**
     * Clears Path Params.
     *
     * @return path params empty
     */
    public ApiRequestBuilder clearPathParams() {
        pathParms.clear();
        return this;
    }

    /**
     * Sets the body.
     *
     * @param newBody a String with the new body
     */
    public void setBody(final String newBody) {
        this.body = newBody;
    }

    @Override
    public ApiRequest build() {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setBaseUri(this.baseUri);
        apiRequest.setEndpoint(this.endpoint);
        apiRequest.setBody(this.body);
        apiRequest.setToken(this.token);
        apiRequest.setMethod(this.method);
        apiRequest.addHeaders(this.headers);
        apiRequest.addQueryParams(this.queryParams);
        apiRequest.addPathParams(this.pathParms);
        return apiRequest;
    }

}
