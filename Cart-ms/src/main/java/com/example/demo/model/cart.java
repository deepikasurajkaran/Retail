package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="cart")
public class cart {	
	@Id
	private long cartid;
	private long userid;
	private long productid;
	private int Quantity;
	private double product_price;
	
	public cart(long cartid, long userid, long productid, int quantity, double product_price) {
		super();
		this.cartid = cartid;
		this.userid = userid;
		this.productid = productid;
		Quantity = quantity;
		this.product_price = product_price;
	}

	public long getCartid() {
		return cartid;
	}

	public void setCartid(long cartid) {
		this.cartid = cartid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
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

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
