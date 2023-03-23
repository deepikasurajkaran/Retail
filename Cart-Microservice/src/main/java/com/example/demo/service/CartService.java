package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cart;

public interface CartService {
	public String addItemtoCart(Cart cart);
	public String removeItemfromCart(Long cartid);
	List<Cart> getall();
	public List<Cart> getallbyuserid(String userid);
	public void updateCartItem(Cart cart);
    
}
