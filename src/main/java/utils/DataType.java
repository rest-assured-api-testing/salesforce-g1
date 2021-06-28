/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package utils;

import utils.strategy.ObjectsNames;
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
    public static boolean validateDataType(final Field firstObject, final Object secondObject) {
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
    public static Object convertStringToObject(final String value, final String dataType) {
        if (value == null) {
            return null;
        }
        return ObjectsNames.valueOf(dataType).getStringToObjectConverter().convertStringToObject(value);
    }
}
