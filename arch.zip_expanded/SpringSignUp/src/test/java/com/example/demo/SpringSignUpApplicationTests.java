package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class SpringSignUpApplicationTests {
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
class SpringSignUpApplicationTests  {

    @Test
    @Order(1)
    public void testSignup() {
        String jsonbody="{\"name\":\"Sample\",\"email\":\"sample@gmail.com\",\"password\":\"sample123\",\"phonenumber\":\"1234567890\"}";
        String res=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .post("http://localhost:8082/api/users/signup")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
//    @Test
//    @Order(2)
//    public void testLogin() {
//        String jsonbody= "{\"email\" : \"sample@gmail.com\",\"password\" : \"sample123\"}";
//        String token=given()
//                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
//                .body(jsonbody)
//                .when()
//                .post("http://localhost:5051/api/doctors/authenticate")
//                .then()
//                .assertThat().statusCode(200)
//                .extract().response().asString();
//    }
//    
//    @Test
//    @Order(3)
//    public void testgetalldoctors() {
//        String result=given()
//                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
//                .when()
//                .get("http://localhost:5051/api/doctors/alldoctors")
//                .then()
//                .assertThat().statusCode(200)
//                .extract().response().asString();
//    }
//    
//    @Test
//    @Order(4)
//    public void testgetdoctor() {
//        String result=given()
//                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
//                .when()
//                .get("http://localhost:5051/api/doctors/get/sample@gmail.com")
//                .then()
//                .assertThat().statusCode(200)
//                .extract().response().asString();
//    }
//    
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
