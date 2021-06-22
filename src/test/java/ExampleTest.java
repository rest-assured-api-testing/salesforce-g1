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
