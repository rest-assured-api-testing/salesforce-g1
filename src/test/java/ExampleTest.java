/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

import entities.Account;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.strategy.ObjectsNames;

import static io.restassured.RestAssured.baseURI;
import static utils.DataType.convertStringToObject;

public class ExampleTest {
    @Test
    public void itShouldReturnStatusCodeOkOnGetApiVersions() {
        baseURI = "https://fundacionjala4-dev-ed.my.salesforce.com/services/data/";
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification
                .when()
                .get()
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void test10() {
        String integer = "1";
        String data = "Integer";
        System.out.println(convertStringToObject(integer,data));
        String bill = "{\"city\":\"Cochabamba\",\"country\":\"Bolivia\"}";
        String data2 = "BillingAddress";
        System.out.println(convertStringToObject(bill,data2));
    }
}
