package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CartRepository;
import com.example.demo.model.cart;
import com.example.demo.service.Cartservice;
@Service
public class Cartserviceimpl implements Cartservice {
	@Autowired
	private CartRepository cartrepository;

	@Override
	public void addItemtoCart(Long userid, Long productid, Integer quantity) {
		Optional<cart> cartop = cartrepository.findByUserIdandProductId(userid,productid);
		if(cartop.isPresent()) {
			cart cart1 = cartop.get();
			cart1.setQuantity(cart1.getQuantity()+quantity);
			cartrepository.save(cart1);	
		}
		else {
			cart cart1 = new cart();
			cart1.setUserid(userid);
			cart1.setProductid(productid);
			cart1.setProduct_price(200);
			cart1.setQuantity(quantity);
			cartrepository.save(cart1);
			
		}
		
	}

}
