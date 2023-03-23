package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class ProductCatalogApplicationTests {
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
class ProductCatalogApplicationTests {

 
    
    @Test
    @Order(1)
    public void testgetallcategories() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8083/categories")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
    @Test
    @Order(2)
    public void testgetcategoriesbyname() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8083/categories/furniture")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
    @Test
    @Order(3)
    public void testgetcategoriesbyId() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8083/categories/categoryid/1")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
//    @Test
//    @Order(5)
//    public void testdeletepatient() {
//        String jsonbody= "{\"email\" : \"sample@gmail.com\",\"password\" : \"sample123\"}";
//        String token=given()
//                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
//                .body(jsonbody)
//                .when()
//                .post("http://localhost:5051/api/doctors/authenticate")
//                .then()
//                .assertThat().statusCode(200)
//                .extract().response().asString();
//        
//        String result=given()
//                .header("Authorization","Bearer "+token).contentType(ContentType.JSON).accept(ContentType.JSON)
//                .when()
//                .delete("http://localhost:5051/api/doctors/delete/sample@gmail.com")
//                .then()
//                .assertThat().statusCode(200)
//                .extract().response().asString();
//    }
}
