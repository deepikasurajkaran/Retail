package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.repository.PayRepository;
import com.example.demo.service.PaymentService;
@Service
public class PayServiceImpl implements PaymentService{
	@Autowired
	private PayRepository payrepository;
	

	public PayServiceImpl(PayRepository payrepository) {
		super();
		this.payrepository = payrepository;
	}


	@Override
	public List<Payment> getprice(String userid) {
		// TODO Auto-generated method stub
		return payrepository.getprice(userid) ;
	}


	@Override
	public Payment Savepay(Payment payment) {
		
		return payrepository.save(payment);
	}

}
