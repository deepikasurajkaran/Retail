package com.example.demo.Service;

import java.util.List;
import com.example.demo.model.Orders;

public interface OrdersService {
//	public void placeOrder(Long userid,String address,double Totalprice);
	
   public List<String> getOrderId(String userid);
   public Orders createOrder(Orders order);
   public List<Orders> getOrders(String userid);
  
}
