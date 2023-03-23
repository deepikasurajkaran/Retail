package com.example.demo.model;

public class CartItemWrapper {
	private Integer cartid;
	private Integer productid;
	private Integer userid;
	private String productname;
	private double productprice;
	public Integer getCartid() {
		return cartid;
	}
	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	
	public CartItemWrapper(Integer cartid, Integer productid, Integer userid, String productname, double productprice) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.userid = userid;
		this.productname = productname;
		this.productprice = productprice;
	}
	public CartItemWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
