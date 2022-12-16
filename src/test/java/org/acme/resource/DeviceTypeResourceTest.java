package org.acme.resource;


import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.acme.service.dto.DeviceTypeDto;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;


@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestHTTPEndpoint(DeviceTypeResource.class)
public class DeviceTypeResourceTest {

    @Test
    @Order(1)
    public void testAddEndpoint(){

        DeviceTypeDto deviceTypeDto=DeviceTypeDto
                .builder()
                .name("name1")
                .code("N1")
                .build();

        given().header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .body(deviceTypeDto)
                .when().post().then().statusCode(200);

    }



    @Test
    @Order(2)
    public void testFindAllEndpoint() {

        given().header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when().get().then().statusCode(200).body("size()",greaterThan(0));

    }

}

