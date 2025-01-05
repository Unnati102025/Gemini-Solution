import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class GetReqWithAssertion {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // Perform GET request and assert for 200 response code
        given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200) // Assert that the status code is 200
                .log().all(); // Log the response to the console
    }
}
