/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Keeps all data that are required to construct the request.
 */
public class ApiRequest {
    private String baseUri;
    private String endpoint;
    private String body;
    private String token;
    private Enum<ApiMethod> method;
    private List<Header> headers;
    private Map<String, String> queryParams;
    private Map<String, String> pathParams;

    public ApiRequest() {
        headers = new ArrayList<>();
        queryParams = new HashMap<>();
        pathParams = new HashMap<>();
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Enum<ApiMethod> getMethod() {
        return method;
    }

    public void setMethod(Enum<ApiMethod> method) {
        this.method = method;
    }

    public void addHeaders(List<Header> headers) {
        this.headers = headers;
    }

    public void addQueryParams(Map<String, String> queryParams) {
        this.queryParams = queryParams;
    }

    public void addPathParams(Map<String, String> pathParams) {
        this.pathParams = pathParams;
    }

    public void clear() {
        pathParams.clear();
    }

    public Headers getHeaders() {
        return new Headers(headers);
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public Map<String, String> getPathParams() {
        return pathParams;
    }
}
