package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class OrderMsApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//}

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
class OrderMsApplicationTests {

  
    
    @Test
    @Order(1)
    public void testPlaceOrder() {
        String jsonbody= "{\"address\":\"Sample\",\"phonenumber\":\"test\",\"products\":\"testSamsung\",\"totalprice\":\"20000\",\"email\":\"maha@gmail.com\"}";
        String token=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .post("http://localhost:8098/orders/placeorder")
                .then()
                .assertThat().statusCode(201)
                .extract().response().asString();
    }
    
    @Test
    @Order(2)
    public void testgetorderbyUserid() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8098/orders/getorders/maha@gmail.com")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
  
}
