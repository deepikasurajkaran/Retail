package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Id
	@Column(name="email")
	private String email;
	private String password;
	private String phonenumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public User(Long id, String email, String password, String phonenumber) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

}
