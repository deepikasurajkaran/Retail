package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProductDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDetailsApplication.class, args);
		System.out.println("Hi");
	}
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}