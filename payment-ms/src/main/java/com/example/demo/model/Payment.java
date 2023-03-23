package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long paymentid;
	@Column(name="price")
	private long totalprice;
	@Column(name="userid")
	private String userid;
	public long getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(long paymentid) {
		this.paymentid = paymentid;
	}
	public long getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(long totalprice) {
		this.totalprice = totalprice;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	public Payment(long paymentid, long totalprice, String userid) {
		super();
		this.paymentid = paymentid;
		this.totalprice = totalprice;
		this.userid = userid;
		
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
