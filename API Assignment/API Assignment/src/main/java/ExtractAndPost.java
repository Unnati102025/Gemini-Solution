import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class ExtractAndPost {
    public static void main(String[] args) {
        // Set Base URI
        RestAssured.baseURI = "https://reqres.in/api";

        // Step 1: Perform GET request to extract email
        Response getResponse = given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200) // Assert that the response status is 200
                .extract()
                .response();

        // Extract email from the first user
        JsonPath jsonPath = getResponse.jsonPath();
        String email = jsonPath.getString("data[0].email"); // Extract "email" from the first user
        System.out.println("Extracted Email: " + email);

        // Step 2: Use the extracted email in the POST request payload
        String postBody = "{ \"name\": \"John\", \"job\": \"developer\", \"email\": \"" + email + "\" }";

        // Step 3: Perform POST request with the payload
        Response postResponse = given()
                .header("Content-Type", "application/json")
                .body(postBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201) // Assert that the response status is 201
                .log().all() // Log the response for debugging
                .extract()
                .response();

        // Output the POST response
        System.out.println("POST Response: " + postResponse.asString());
    }
}
