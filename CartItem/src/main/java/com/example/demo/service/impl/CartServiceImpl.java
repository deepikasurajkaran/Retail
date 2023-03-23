package com.example.demo.service.impl;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.CartItem;
import com.example.demo.model.CartItemWrapper;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;
@Service
public class CartServiceImpl implements CartService{
	@Autowired
	CartRepository cartrepository;

	@Override
	public ResponseEntity<String> addToCart(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		CartItemWrapper cart=cartrepository.findByProdId(Integer.parseInt(requestMap.get("productid")));
		if(Objects.isNull(cart)) {
			System.out.println(requestMap.get("productname"));
			CartItem cartitem=new CartItem();
			try {
				cartitem.setProductid(Integer.parseInt(requestMap.get("productid")));
				cartitem.setProductname(requestMap.get("productname"));
				cartitem.setProductprice(Double.parseDouble(requestMap.get("product_price")));
				cartitem.setUserid(Integer.parseInt(requestMap.get("userid")));
				cartrepository.save(cartitem);
				return new ResponseEntity<String>("Products added successfully",HttpStatus.OK);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			return new ResponseEntity<String>("Products not added",HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		else {
			return new ResponseEntity<String>("This Products are already in cart",HttpStatus.BAD_REQUEST);
		}
	
	}

}
