package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;


public class Cart {
	List<Cart> cartItems = new ArrayList<>();
	private double totalPrice;
	public List<Cart> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<Cart> cartItems) {
		this.cartItems = cartItems;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Cart(List<Cart> cartItems, double totalPrice) {
		super();
		this.cartItems = cartItems;
		this.totalPrice = totalPrice;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	private long cartid;
//	private long productid;
//	private int Quantity;
//	private double price;
//	private String name;
//	public long getCartid() {
//		return cartid;
//	}
//	public void setCartid(long cartid) {
//		this.cartid = cartid;
//	}
//	public long getProductid() {
//		return productid;
//	}
//	public void setProductid(long productid) {
//		this.productid = productid;
//	}
//	public int getQuantity() {
//		return Quantity;
//	}
//	public void setQuantity(int quantity) {
//		Quantity = quantity;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Cart() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Cart(long cartid, long productid, int quantity, double price, String name) {
//		super();
//		this.cartid = cartid;
//		this.productid = productid;
//		Quantity = quantity;
//		this.price = price;
//		this.name = name;
//	}
//	
//	

}
