package com.example.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cartms")
public class Cart {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column
	private long cartid;
	@Column(name="userid")
	private String userid;
	@Column(name="productid")
	private long productid;
	@Column(name="quantity")
	private int Quantity;
	@Column(name="price")
	private double price;
	@Column(name="name")
	private String name;
	public long getCartid() {
		return cartid;
	}
	public void setCartid(long cartid) {
		this.cartid = cartid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cart(long cartid, String userid, long productid, int quantity, double price, String name) {
		super();
		this.cartid = cartid;
		this.userid = userid;
		this.productid = productid;
		Quantity = quantity;
		this.price = price;
		this.name = name;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
