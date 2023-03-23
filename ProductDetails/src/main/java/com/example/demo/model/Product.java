package com.example.demo.model;


import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@NamedQuery(name = "Product.findAllBycategory_id", query="select new ProductWrapper(p.productid,p.name,p.description,p.price,p.imageUrl,p.rating) from Product p where p.category_id =:category_id" )

@Table(name="product_details")
public class Product {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long productid;
	private String name;
	private String description;
	private Double price;
	private String imageUrl;
	private int rating;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="categoryId",referencedColumnName="id")
//	private ProductCatalog productcatalog;
	
	public Product(Long productid, String name, String description, Double price, String imageUrl, int rating
//			ProductCatalog productcatalog
			) {
		super();
		this.productid = productid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imageUrl = imageUrl;
		this.rating = rating;
//		this.productcatalog = productcatalog;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


//	public ProductCatalog getProductcatalog() {
//		return productcatalog;
//	}
//	public void setProductcatalog(ProductCatalog productcatalog) {
//		this.productcatalog = productcatalog;
//	}
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
	
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="category_id",nullable=false)
//	private ProductCatalog productcatalog;
//	
//	@Column(name="category_id",insertable=false,updatable=false)
//	private Long categoryId;
	
//	private Long categoryId = productcatalog.getId();

	
	

}
