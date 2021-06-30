/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package utils.strategy;

/**
 * This class converts a string to a Double object.
 */
public class StringToDouble implements StringToObjectConverter {
    /**
     * Converts a String to an object of type Double.
     *
     * @param string with the value to convert
     * @return an object of type Double
     */
    @Override
    public Object convertStringToObject(final String string) {
        Double doubleObject = Double.valueOf(string);
        return doubleObject;
    }
}
