package com.example.demo.model;

public class ProductSearch {
	private Long productid;
	private String name;
	private String description;
	private Double price;
	private String image_url;
	private int rating;
	public ProductSearch(Long productid, String name, String description, Double price, String image_url, int rating) {
		super();
		this.productid = productid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.image_url = image_url;
		this.rating = rating;
	}
	public ProductSearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
