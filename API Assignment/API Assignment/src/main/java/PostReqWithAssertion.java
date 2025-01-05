import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class PostReqWithAssertion {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // JSON Body for POST request
        String requestBody = "{ \"name\": \"John\", \"job\": \"developer\" }";

        // Perform POST request and assert for 201 response code
        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201) // Assert that the status code is 201
                .log().all(); // Log the response to the console
    }
}
