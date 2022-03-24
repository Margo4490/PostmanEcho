package ru.netology;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.Test;

public class EchoTest {

    @Test
    public void ShouldPostSomeDate() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello"))
        ;
    }

    @Test
    public void ShouldPostSomeInteger() {
        given()
                .baseUri("https://postman-echo.com")
                .body("888")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("888"))
        ;

    }

    @Test
    public void ShouldPostSomeIntegerAndString() {
        given()
                .baseUri("https://postman-echo.com")
                .body("A888D")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("A888D"))
        ;

    }
}