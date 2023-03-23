package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ProductSearch;

public interface ProductService {
	
	List<ProductSearch> findAll();
	public ProductSearch getByProductId(Long productid);
	public ProductSearch getByProductName(String name);
	public ProductSearch getByPrice(Double price);
	public ProductSearch getByImage(String image_url);
	public ProductSearch getByRating(Integer rating);
	public ProductSearch getBydescription(String description);

}
