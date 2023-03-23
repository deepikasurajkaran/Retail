package com.example.demo.models;

public class LoginUser {
	 private Long id; 
	 private String email;
	 private String password;
	 private Long phonenumber;
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
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public LoginUser(Long id, String email, String password, Long phonenumber) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
	}
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
