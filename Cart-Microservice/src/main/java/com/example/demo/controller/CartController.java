package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CartController {
	
	@Autowired
	private CartService cartservice;
	@PostMapping("/add")
	public ResponseEntity<String> addItemToCart(@RequestBody Cart cart){
		cartservice.addItemtoCart(cart);
		return ResponseEntity.ok("Product added to cart successfully");
	}
	@DeleteMapping("/delete/{cartid}")
	public String removeItemfromCart(@PathVariable("cartid") Long cartid){
		cartservice.removeItemfromCart(cartid);
		return "Products are removed from cart";
	}
	@GetMapping("/all")
	public List<Cart> findAll(){
		return cartservice.getall();
		
	}
	@GetMapping("/userid/{userid}")
	public List<Cart> getallbyuserid(@PathVariable("userid")String userid){
		return cartservice.getallbyuserid(userid);
	}
	@PostMapping("/quantity")
	public ResponseEntity<?> updateCart(@RequestBody Cart cart){
		cartservice.updateCartItem(cart);
		return ResponseEntity.ok().build();
		
	}

}