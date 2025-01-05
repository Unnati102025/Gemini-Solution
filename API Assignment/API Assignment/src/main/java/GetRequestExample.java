import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequestExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        // GET Request
        Response response = given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("GET Response: " + response.asString());
    }
}
