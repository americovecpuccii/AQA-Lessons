package lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTests {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testGetWithQueryParameters() {
        given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRawText() {
        String rawText = "This is raw POST data";
        given()
                .contentType("text/plain")
                .body(rawText)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(rawText));
    }

    @Test
    public void testPostFormData() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("name", "Ivan")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.name", equalTo("Ivan"));
    }

    @Test
    public void testPutRequest() {
        String putData = "This is PUT data";

        given()
                .contentType("text/plain")
                .body(putData)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(putData));
    }

    @Test
    public void testPatchRequest() {
        String patchData = "{\"field\": \"new_value\"}";

        given()
                .contentType("application/json")
                .body(patchData)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(patchData));
    }

    @Test
    public void testDeleteRequest() {
        String deleteData = "Data to delete";

        given()
                .contentType("text/plain")
                .body(deleteData)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(deleteData));
    }
}
