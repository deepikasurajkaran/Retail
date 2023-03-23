package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CartItem;
import com.example.demo.model.CartItemWrapper;

public interface CartRepository extends JpaRepository<CartItem,Integer> {
	CartItemWrapper findByProdId(Integer productid);
	List<CartItemWrapper> findByUserId(Integer userid);

}
