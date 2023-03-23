package com.example.demo.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface CartService {
	public ResponseEntity<String> addToCart(Map<String,String>requestMap);

}
