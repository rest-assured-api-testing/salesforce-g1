/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package utils.strategy;

import com.google.gson.Gson;
import entities.ShippingAddress;

/**
 * This class converts a string to a ShippingAddress object
 */
public class StringToShippingAddress implements StringToObjectConverter {
    /**
     * Converts a String to an object of type ShippingAddress
     * @param string with the value to convert
     * @return an object of type ShippingAddress
     */
    @Override
    public Object convertStringToObject(final String string) {
        Gson gson = new Gson();
        ShippingAddress shippingAddressObject = gson.fromJson(string, ShippingAddress.class);
        return shippingAddressObject;
    }
}