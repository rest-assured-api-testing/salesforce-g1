package utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;

import static utils.DataType.*;

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