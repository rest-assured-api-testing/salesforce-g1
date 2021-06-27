/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package entities;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class is used to obtain attribute's information
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attribute {
    private String type;
    private String url;

    /**
     * Gets the attribute's type
     * @return a String with the attribute's type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the attribute's type
     * @param type a String with the type to set
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Gets the attribute's URL
     * @return a String with the attribute's URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets attribute's URL
     * @param url a String with the URL to set
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
