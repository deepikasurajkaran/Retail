package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.OrdersService;
import com.example.demo.model.Orders;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/orders")
public class OrdersController {
	private OrdersService ordersservice; 
	
	
	public OrdersController(OrdersService ordersservice) {
		super();
		this.ordersservice = ordersservice;
	}
	

	@GetMapping("/order/{userid}")
	public List<String> getOrderId(@PathVariable("userid")String userid) {
		return ordersservice.getOrderId(userid);
		
	}
	
	@PostMapping("/placeorder")
	public ResponseEntity<Orders> placeOrder(@RequestBody Orders order){
		try {
		Orders newOrder = ordersservice.createOrder(order);
		return ResponseEntity.status(HttpStatus.CREATED).body(newOrder) ;
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	@GetMapping("/getorders/{userid}")
	public List<Orders> getOrders(@PathVariable("userid") String userid){
		return ordersservice.getOrders(userid);
		
	}

}
