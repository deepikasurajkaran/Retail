package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Payment;

public interface PayRepository extends JpaRepository<Payment,Long>{
	@Query(value="select totalprice,id from orders where userid=?",nativeQuery=true)
	List<Payment> getprice(String userid);
	

}
