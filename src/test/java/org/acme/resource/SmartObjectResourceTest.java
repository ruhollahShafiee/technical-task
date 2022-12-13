package org.acme.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SmartObjectResourceTest {


    @BeforeAll
    public void prepareSmartObjectMockData(){

    }

    @Test
    public void testHelloEndpoint() {
        given()
          .when().post("/smartObject/add")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}