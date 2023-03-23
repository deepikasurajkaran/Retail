package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/payment")
public class PayController {
	@Autowired
	private PaymentService paymentservice;

	public PayController(PaymentService paymentservice) {
		super();
		this.paymentservice = paymentservice;
	}

	@PostMapping("/pay")
	public ResponseEntity<Payment> Savepay(@RequestBody Payment payment){
		return new ResponseEntity<Payment>(paymentservice.Savepay(payment),HttpStatus.CREATED);
	}
	
	
}
