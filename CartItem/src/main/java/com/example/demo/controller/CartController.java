package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CartService;

@RestController
@RequestMapping
public class CartController {
	@Autowired
	CartService cartservice;
	
	
	public CartController(CartService cartservice) {
		super();
		this.cartservice = cartservice;
	}


	@PostMapping("/add")
	public ResponseEntity<String> addToCart(Map<String, String> requestMap) {
		cartservice.addToCart(requestMap);
		return ResponseEntity.ok().build();
	}
	


}
