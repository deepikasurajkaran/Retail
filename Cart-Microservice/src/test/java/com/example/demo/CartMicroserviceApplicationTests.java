package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class CartMicroserviceApplicationTests {
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
class CartMicroserviceApplicationTests {

    @Test
    @Order(1)
    public void testAddCart() {
        String jsonbody="{\"userid\":\"maha@gmail.com\",\"productid\":\"1\",\"quantity\":\"1\",\"name\":\"kitkat\",\"price\":\"20000\"}";
        String res=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .post("http://localhost:8095/api/add")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    @Test
    @Order(2)
    public void testQuantity() {
        String jsonbody="{\"cartid\":\"3\",\"quantity\":\"1\"}";
        String res=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .post("http://localhost:8095/api/quantity")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    

    
    @Test
    @Order(3)
    public void testgetallcartbyuserid() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8095/api/userid/User7@gmail.com")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
    @Test
    @Order(4)
    public void testdeletecartid() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .delete("http://localhost:8095/api/delete/10")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }

}
