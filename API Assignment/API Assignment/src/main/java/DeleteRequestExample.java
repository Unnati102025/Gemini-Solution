import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DeleteRequestExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // DELETE Request
        Response response = given()
                .when()
                .delete("/users/2")
                .then()
                .statusCode(204) // No Content
                .extract()
                .response();

        System.out.println("DELETE Response Status Code: " + response.statusCode());
    }
}
