package org.acme.resource;


import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class DeviceTypeResourceTest {

    @Test
    public void testFindAllEndpoint() {

        given().when().get("/deviceType/all").then().statusCode(200);

    }

}
