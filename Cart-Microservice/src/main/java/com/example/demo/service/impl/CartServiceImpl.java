package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CartMicroserviceApplication;
import com.example.demo.Exception.ResourceNotFound;
import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
import com.example.demo.service.CartService;
@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartRepository cartrepository;

	@Override
	public String addItemtoCart(Cart cart) {
		
		String check = cartrepository.getbyuidpid(cart.getUserid(),cart.getProductid());
		System.out.println(cart.getProductid());
		if(check == null) {
			cartrepository.save(cart);
		}
		else {
			Cart existingcart = cartrepository.findById(Long.parseLong(check)).orElseThrow(() -> new ResourceNotFound("id","id",cart.getUserid()));
			existingcart.setQuantity(existingcart.getQuantity()+ cart.getQuantity());
			cartrepository.save(existingcart);
		}
		return "Added to Cart";	
	}

	@Override
	public String removeItemfromCart(Long cartid) {
		Cart check = cartrepository.findById(cartid).orElseThrow(() -> new ResourceNotFound("id","id",cartid));
		
//			Cart existingcart = cartrepository.findById(Long.parseLong(check)).orElseThrow(() -> new ResourceNotFound("id","id",cart.getUserid()));
//			existingcart.setQuantity(existingcart.getQuantity() - cart.getQuantity());
			cartrepository.deleteById(cartid);

		return "Removed from Cart";	
	}

	@Override
	public List<Cart> getall() {
		 return cartrepository.findAll();
		
	}

	@Override
	public List<Cart> getallbyuserid(String userid) {
		// TODO Auto-generated method stub
		return cartrepository.getbyuid(userid);
	}

	@Override
	public void updateCartItem(Cart cart) {
		Cart existingCartItem = cartrepository.findById(cart.getCartid()).orElseThrow(()->new ResourceNotFound("id","id",cart.getCartid()));
		existingCartItem.setQuantity(cart.getQuantity());
		cartrepository.save(existingCartItem);
		
		
	}

		
}
