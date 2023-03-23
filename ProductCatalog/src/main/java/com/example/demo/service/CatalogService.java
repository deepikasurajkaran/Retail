package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ProductCatalog;

public interface CatalogService {
	List<ProductCatalog> getallCategories();
	ProductCatalog getCategoryById(long id);
//	ProductCatalog getCategoryByname(String name);

	ProductCatalog getCategoryByname(String name);

}
