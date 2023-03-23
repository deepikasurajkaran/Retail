package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="productdetails")
public class Products {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long productid;
	private String name;
	private String description;
	private Double price;
	private String imageUrl;
	private int rating;
	private Long categoryid;
	
	public Long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
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
	
	public Products(Long productid, String name, String description, Double price, String imageUrl, int rating,
			Long categoryid) {
		super();
		this.productid = productid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imageUrl = imageUrl;
		this.rating = rating;
		this.categoryid = categoryid;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
