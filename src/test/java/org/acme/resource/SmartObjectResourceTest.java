package org.acme.resource;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.*;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;


@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestHTTPEndpoint(SmartObjectResource.class)
public class SmartObjectResourceTest {


//    @BeforeAll
//    public static void prepareSmartObjectMockData() {
//
//    }

    @Test
    @Order(1)
    public void testAddEndpoint() {
        given()
                .header(javax.ws.rs.core.HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when().get()
                .then()
                .statusCode(200);
    }


    @Test
    @Order(2)
    public void testAllEndpoint() {
        given().header(javax.ws.rs.core.HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when().get()
                .then()
                .statusCode(200);
    }

}