import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class PutReqWithAssertion {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // JSON Body for PUT request
        String requestBody = "{ \"name\": \"John\", \"job\": \"manager\" }";

        // Perform PUT request and assert for 200 response code
        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/users/2")
                .then()
                .statusCode(200) // Assert that the status code is 200
                .log().all(); // Log the response to the console
    }
}
