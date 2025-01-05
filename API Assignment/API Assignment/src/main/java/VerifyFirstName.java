import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class VerifyFirstName {
    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://reqres.in/api";

        // GET Request
        given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200) // Assert 200 status code
                .body("data[0].first_name", equalTo("Michael")) // Verify "first_name" key value
                .log().all(); // Log response
    }
}
