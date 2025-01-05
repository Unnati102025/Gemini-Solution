import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DeleteReqWithAssertion {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // Perform DELETE request and assert for 204 response code
        given()
                .when()
                .delete("/users/2")
                .then()
                .statusCode(204) // Assert that the status code is 204
                .log().all(); // Log the response to the console
    }
}
