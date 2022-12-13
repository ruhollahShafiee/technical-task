package org.acme.resource;


import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.acme.resource.resource.OperationTypeResource;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
@TestHTTPEndpoint(OperationTypeResource.class)
public class OperationTypeResourceTest {

    @Test
    public void testFindAllEndpoint() {

        given().when().get().then().statusCode(200);

    }
}
