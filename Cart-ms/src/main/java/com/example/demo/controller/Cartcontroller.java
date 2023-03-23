package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.cart;
import com.example.demo.service.Cartservice;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/carts")
public class Cartcontroller {
	@Autowired
	private Cartservice cartservice;
	
	

	@PostMapping("/add")
	public ResponseEntity<String> addItemToCart(Long userid,Long productid,Integer quantity){
		cartservice.addItemtoCart(userid, productid, quantity);
		return ResponseEntity.ok("Product added to cart successfully");
	}
	
	
//	@PostMapping("/{productid}/{quantity}")
//	public ResponseEntity<String> addItemToCart(@PathVariable Long productid,@PathVariable Integer quantity,HttpServletRequest request){
//		String token=request.getHeader("Authorization").substring(7);
//		Claims claims = Jwts.parser().setSigningKey("secret").parseClaimsJws(token).getBody();
//		Long userid=Long.parseLong(claims.getSubject());
//		cartservice.addItemtoCart(userid, productid, quantity);
//		return ResponseEntity.ok("Product added to cart successfully");
//	}

}

