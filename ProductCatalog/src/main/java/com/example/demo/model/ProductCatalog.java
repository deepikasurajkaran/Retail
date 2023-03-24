package com.example.demo.model;

import jakarta.persistence.Column;

//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="productcategories")
public class ProductCatalog {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long Id;
	@Column(name="name")
	private String name;

	public ProductCatalog() {
		
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public ProductCatalog(Long id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	
	

}
