package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Payment;

public interface PaymentService {
	public List<Payment> getprice(String userid);
	public Payment Savepay(Payment payment);

}
