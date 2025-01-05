import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRequestExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // POST Request Body
        String postBody = "{ \"name\": \"John\", \"job\": \"developer\" }";

        // POST Request
        Response response = given()
                .header("Content-Type", "application/json")
                .body(postBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .extract()
                .response();

        System.out.println("POST Response: " + response.asString());
    }
}