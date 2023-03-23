package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;


@SuppressWarnings("unused")
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SearchMicroserviceApplicationTests {

   
    @Test
    @Order(1)
    public void testSearchProducts() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:9006/search/productname/Sample")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
   
}
