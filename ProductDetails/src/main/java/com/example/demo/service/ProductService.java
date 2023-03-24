package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Product;

public interface ProductService {
	List<Product> findAll();
	Product getproductbyid(long id);
//	List<Product> getProductByCategoryName(String categoryName);
	List<Product> getProductsByCategoryId(Long category_id);

	
}
