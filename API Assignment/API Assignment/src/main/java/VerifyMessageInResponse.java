import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class VerifyMessageInResponse {

    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://reqres.in/api";

        // Perform GET request
        Response response = given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200) // Assert status code
                .extract()
                .response();

        // Convert response body to String
        String responseBody = response.asString();

        // Verify the presence of a message or specific text in the response body
        verifyMessage(responseBody, "Michael");
    }

    public static void verifyMessage(String responseBody, String message) {
        if (responseBody.contains(message)) {
            System.out.println("Message \"" + message + "\" is present in the response body.");
        } else {
            System.out.println("Message \"" + message + "\" is NOT present in the response body.");
        }
    }
}
