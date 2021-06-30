/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.strategy;

/**
 * This class converts a string to an Integer object.
 */
public class StringToInteger implements StringToObjectConverter {
    /**
     * Converts a String to an object of type Integer.
     *
     * @param string with the value to convert
     * @return an object of type Integer
     */
    @Override
    public Object convertStringToObject(final String string) {
        return Integer.valueOf(string);
    }
}
