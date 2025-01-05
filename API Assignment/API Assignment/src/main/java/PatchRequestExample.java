import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PatchRequestExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // PATCH Request Body
        String patchBody = "{ \"name\": \"John\" }";

        // PATCH Request
        Response response = given()
                .header("Content-Type", "application/json")
                .body(patchBody)
                .when()
                .patch("/users/2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("PATCH Response: " + response.asString());
    }
}
