import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PutRequestExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // PUT Request Body
        String putBody = "{ \"name\": \"John\", \"job\": \"manager\" }";

        // PUT Request
        Response response = given()
                .header("Content-Type", "application/json")
                .body(putBody)
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("PUT Response: " + response.asString());
    }
}
