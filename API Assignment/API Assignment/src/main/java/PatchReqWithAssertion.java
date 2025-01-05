import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class PatchReqWithAssertion {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // JSON Body for PATCH request
        String requestBody = "{ \"name\": \"John\" }";

        // Perform PATCH request and assert for 200 response code
        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .patch("/users/2")
                .then()
                .statusCode(200) // Assert that the status code is 200
                .log().all(); // Log the response to the console
    }
}
