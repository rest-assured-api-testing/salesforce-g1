/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.converter;

/**
 * This interface implements a method to convert a String to an Object.
 */
public interface StringToObjectConverter {
    /**
     * Converts a String to an Object.
     *
     * @param string to convert
     * @return an Object
     */
    Object convertStringToObject(final String string);
}
