/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package entities;

import java.util.List;

/**
 * This class creates a ResponseObject object.
 */
public class ResponseObject {
    public String id;
    public boolean success;
    public List<Object> errors;

    /**
     * Gets ResponseObject's id.
     *
     * @return a String with the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ResponseObejct's id.
     *
     * @param id a String with the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets if the ResponseObject is successful.
     *
     * @return a boolean with the answer
     */
    public boolean getIsSuccess() {
        return success;
    }

    /**
     * Sets the ResponseObject's is success status.
     *
     * @param success a boolean with the success status to set
     */
    public void setIsSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets a list of errors from the ResponseObject.
     *
     * @return a list with the errors
     */
    public List<Object> getErrors() {
        return errors;
    }

    /**
     * Sets a list of errors to the ResponseObject.
     *
     * @param errors a list with the errors to set
     */
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }
}
