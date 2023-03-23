package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="userid")
	private String userid;
	@Column(name="address")
	private String address;
	@Column(name="totalprice")
	private Double totalprice;
	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="products")
	private String products;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public Orders(long id, String userid, String address, Double totalprice, String products,String phonenumber) {
		super();
		this.id = id;
		this.userid = userid;
		this.address = address;
		this.totalprice = totalprice;
		this.phonenumber=phonenumber;
		this.products=products;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
