package com.example.demo.model;

import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@NamedQuery(name="CartItem.findByUserId",query="select new com.example.demo.model.CartItemWrapper(c.cartid,c.productid,c.productname,c.productprice,c.userid)from CartItem c where c.userid=:userid")
@NamedQuery(name="CartItem.findByProdId",query="select new com.example.demo.model.CartItemWrapper(c.cartid,c.productid,c.productname,c.productprice,c.userid)from CartItem c where c.productid=:productid")

@Entity
@Table(name="CartItem")
public class CartItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cartid")
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
	public CartItem(Integer cartid, Integer productid, Integer userid, String productname, double productprice) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.userid = userid;
		this.productname = productname;
		this.productprice = productprice;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
