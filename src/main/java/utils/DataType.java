/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package utils;

import com.google.gson.Gson;
import entities.*;

import java.lang.reflect.Field;

/**
 * This class provides methods to compare and convert data types
 */
public class DataType {
    /**
     * Checks if the data types matches between objects
     * @param firstObject the first object to check
     * @param secondObject the second object to match
     * @return a boolean with the result
     */
    public static boolean validateDataType(Field firstObject, Object secondObject) {
        if (firstObject.getType().equals(secondObject.getClass())) {
            return true;
        }
        return false;
    }

    /**
     * Converts an object type to another
     * @param value a String with the value to convert
     * @param dataType a String with the type to convert
     * @return the value with the required data type
     */
    public static Object convertStringToObject(String value, String dataType) {
        Gson gson = new Gson();
        if (dataType.equals("Integer")) {
            Integer integerObject = Integer.valueOf(value);
            return integerObject;
        } else if (dataType.equals("Boolean")) {
            Boolean booleanObject = Boolean.valueOf(value);
            return booleanObject;
        } else if (dataType.equals("Double")) {
            Double doubleObject = Double.valueOf(value);
            return doubleObject;
        } else if (dataType.equals("BillingAddress")) {
            BillingAddress billingAddressObject = gson.fromJson(value, BillingAddress.class);
            return billingAddressObject;
        } else if (dataType.equals("MailingAddress")) {
            MailingAddress mailingAddressObject = gson.fromJson(value, MailingAddress.class);
            return mailingAddressObject;
        } else if (dataType.equals("OtherAddress")) {
            OtherAddress otherAddressObject = gson.fromJson(value, OtherAddress.class);
            return otherAddressObject;
        } else if (dataType.equals("ShippingAddress")) {
            ShippingAddress shippingAddressObject = gson.fromJson(value, ShippingAddress.class);
            return shippingAddressObject;
        } else if (dataType.equals("Attribute")) {
            Attribute attribute = gson.fromJson(value, Attribute.class);
            return attribute;
        }
        return null;
    }
}
