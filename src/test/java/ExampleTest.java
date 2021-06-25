/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;

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
}
