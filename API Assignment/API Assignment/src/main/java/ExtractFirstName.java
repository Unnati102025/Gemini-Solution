import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
public class ExtractFirstName {
    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://reqres.in/api";

        // GET Request and Extract Response
        String response = given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        // Parse JSON and Extract First Name
        JsonPath jsonPath = new JsonPath(response);
        String firstName = jsonPath.getString("data[0].first_name");

        // Print the first name
        System.out.println("First Name: " + firstName);

        // Assert the first name
        assert firstName.equals("Michael") : "First name does not match!";
    }
}
