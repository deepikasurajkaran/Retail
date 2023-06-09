package com.example.demo.repository;

public class productsDto {
	private Long productid;
	private String name;
	private String description;
	private Double price;
	private String imageUrl;
	private int rating;
	private productcategoryDto productcategorydto;
	
	public productcategoryDto getProductcategorydto() {
		return productcategorydto;
	}
	public void setProductcategorydto(productcategoryDto productcategorydto) {
		this.productcategorydto = productcategorydto;
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public productsDto(Long productid, String name, String description, Double price, String imageUrl, int rating,
			productcategoryDto productcategorydto) {
		super();
		this.productid = productid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imageUrl = imageUrl;
		this.rating = rating;
		this.productcategorydto = productcategorydto;
	}
	public productsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
