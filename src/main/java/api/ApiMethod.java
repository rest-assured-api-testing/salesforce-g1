/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

/**
 * Gives request types.
 */
public enum ApiMethod {
    GET("GET"),
    POST("POST"),
    DELETE("DELETE"),
    PUT("PUT"),
    PATCH("PATCH");

    private String name;

    ApiMethod(String name) {
        this.name =  name;
    }

    /**
     * Gets enum's name.
     *
     * @return a String with the name
     */
    public String toName() {
        return name;
    }

}
