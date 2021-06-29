/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package utils;

import utils.strategy.ObjectsNames;

/**
 * This class provides methods to compare and convert data types.
 */
public class DataType {
    /**
     * Converts an object type to another.
     *
     * @param value a String with the value to convert
     * @param dataType a String with the type to convert
     * @return the value with the required data type
     */
    public static Object convertStringToObject(final String value, final String dataType) {
        if (value == null) {
            return null;
        }
        return ObjectsNames.valueOf(dataType).getStringToObjectConverter()
                .convertStringToObject(value);
    }
}
