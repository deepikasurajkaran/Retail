package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Product;
import com.example.demo.model.ProductWrapper;

public interface ProductService {
	List<Product> findAll();
	Product getproductbyid(long id);
//	List<Product> getProductByCategoryName(String categoryName);
	List<Product> getProductsByCategoryId(Long category_id);
//	List<ProductWrapper> findAllBycategory_id(Long category_id);
	
}
