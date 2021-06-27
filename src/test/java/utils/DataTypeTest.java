/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package utils;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.Field;
import static utils.DataType.validateDataType;
import static utils.DataType.convertStringToObject;

public class DataTypeTest {
    @Test
    public void testValidateDataType() {
        Field a = null;
        Integer b = 2;
        boolean expected = validateDataType(a, b);
        Assert.assertTrue(expected);
    }

    @Test
    public void testConvertDataType() {
        String a = "true";
        String b = "Boolean";
        System.out.println(convertStringToObject(a, b));
    }
}