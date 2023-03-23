package com.example.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders,Long>{
	@Query(value = "select cartid from cartms where userid=?",nativeQuery=true)
	List<String> getCartidsByUserid(String userid);
	@Query(value = "select * from orders where userid=?",nativeQuery=true)
	List<Orders> getOrders(String userid);
	
	

	
	
	

}
