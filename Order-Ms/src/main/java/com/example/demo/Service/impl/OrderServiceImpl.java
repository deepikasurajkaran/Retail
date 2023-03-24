package com.example.demo.Service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OrdersRepository;
import com.example.demo.Service.OrdersService;
import com.example.demo.model.Orders;
@Service
public class OrderServiceImpl implements OrdersService {
	@Autowired
	private OrdersRepository orderrepo;

	@Override
	public List<String> getOrderId(String userid) {
		// TODO Auto-generated method stub
//		String a="";
//		List<Long> b= orderrepo.getCartidsByUserid(userid);
//		for(int i=0;i<b.size();i++) {
//			a+=b.get(i);
//		}
		 return orderrepo.getCartidsByUserid(userid);
	}

	@Override
	public Orders createOrder(Orders order) {
		return orderrepo.save(order);
	}

	@Override
	public List<Orders> getOrders(String userid) {
		
		return orderrepo.getOrders(userid);
	}



	


	
}
