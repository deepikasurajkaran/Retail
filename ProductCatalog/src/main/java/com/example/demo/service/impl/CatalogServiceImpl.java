package com.example.demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ResourceNotFound;
import com.example.demo.Repository.CatalogRepository;
import com.example.demo.model.ProductCatalog;
import com.example.demo.service.CatalogService;

@Service
public class CatalogServiceImpl implements CatalogService{
	@Autowired
	private CatalogRepository catalogrepository;
	
//	private final RestTemplate restTemplate;
	
//	public CatalogServiceImpl(RestTemplate restTemplate) {
//		super();
//		this.restTemplate = restTemplate;
//	}

//	@Autowired
//	private ProductService productservice;
//	
//	public List<ProductCatalog> getallcategorieswithproducts(){
//		List<ProductCatalog> categories = catalogrepository.findAll();
//		for(ProductCatalog productcatalog:categories) {
//			List<Product> products=productservice.getProductByCategory(productcatalog.getId());
//			productcatalog.setProducts(products);
//		}
//		return categories;
//	}
	@Override
	public List<ProductCatalog> getallCategories() {
		// TODO Auto-generated method stub
		return catalogrepository.findAll() ;
	}
	
	@Override
	public ProductCatalog getCategoryByname(String name){
		// TODO Auto-generated method stub
		return catalogrepository.findByname(name);
	}

	@Override
	public ProductCatalog getCategoryById(long id) {
		// TODO Auto-generated method stub
		return catalogrepository.findById(id).orElseThrow(()->new ResourceNotFound("Category","id",id));
	}
	
	
	

}