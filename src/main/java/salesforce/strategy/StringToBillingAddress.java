/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.strategy;

import com.google.gson.Gson;
import salesforce.entities.BillingAddress;

/**
 * This class converts a string to a BillingAddress object.
 */
public class StringToBillingAddress implements StringToObjectConverter {
    /**
     * Converts a String to an object of type BillingAddress.
     *
     * @param string with the value to convert
     * @return an object of type BillingAddress
     */
    @Override
    public Object convertStringToObject(final String string) {
        return new Gson().fromJson(string, BillingAddress.class);
    }
}
