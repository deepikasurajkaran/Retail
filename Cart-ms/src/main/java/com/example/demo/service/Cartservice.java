package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.cart;

public interface Cartservice {
	void addItemtoCart(Long Userid,Long productid,Integer quantity);
//	void removeItemFromCart(Long productid);
//	Optional<cart> getUserCart(Long userid);
//	void updateCartQuantity(Long productid,Integer quantity);
	

}
