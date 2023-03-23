package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;


import com.example.demo.Exception.ResourceNotFound;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.model.ProductWrapper;
import com.example.demo.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productrepository;
//	@Autowired
//	private final RestTemplate restTemplate;
	
//	public ProductServiceImpl(RestTemplate restTemplate) {
//		super();
//		this.restTemplate = restTemplate;
//	}
	

	

//	@Autowired
//	private RestTemplate resttemplate;
//	
//	public List<Product> getProductByCategory(Long categoryId){
//		String url="http://localhost:8071/products?categoryId="+categoryId;
//		ResponseEntity<List<Product>> responseEntity = resttemplate.exchange(
//				url,
//				HttpMethod.GET,
//				null,
//				new ParameterizedTypeReference<List<Product>>() {});
//		return responseEntity.getBody();
//				
//		
//	}--------
//	public ProductServiceImpl(ProductRepository productrepository, RestTemplate restTemplate) {
//	super();
//	this.productrepository = productrepository;
//	this.restTemplate = restTemplate;
//}
//	-------------
	public ProductServiceImpl(ProductRepository productrepository) {
	super();
	this.productrepository = productrepository;
}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productrepository.findAll();
	}



	@Override
	public Product getproductbyid(long id) {
		// TODO Auto-generated method stub
		return productrepository.findById(id).orElseThrow(()->new ResourceNotFound("Category","id",id));
	}
///it retrieves the category id for product
//	@Override
//	public List<Product> findByCategoryId(Long id) {
//		// TODO Auto-generated method stub
//		String url="http://catalogcontroller/categories/{id}";
//		ResponseEntity<Category> response = restTemplate.getForEntity(url,Category.class);
//		return response.getBody();
//	}
	//---------
//	
//	@Override
//	public List<Product> getProductsByCategoryId(Long category_id) {
//		ProductCatalog productcatalog = restTemplate.getForObject("http://localhost:8083/categories"+category_id, ProductCatalog.class, category_id);
//		if(productcatalog != null) {
//		Long catId = productcatalog.getId();
//		List<Product> products=getProductsByCategoryId(catId);
//		return products;
//		}
//		return Collections.emptyList();
////		return productrepository.getProductsByCategoryId(categoryId);
//	}
//----------
	@Override
	public List<Product> getProductsByCategoryId(Long category_id) {
		return productrepository.getProductsByCategoryId(category_id);
	}
//-----

//	@Override
//	public List<ProductWrapper> findAllBycategory_id(Long category_id) {
//		// TODO Auto-generated method stub
//		return productrepository.findAllBycategory_id(category_id);
//	}
//	
	
	

//	@Override
//	public List<Product> getProductByCategoryName(String categoryName) {
//		ProductCatalog productcatalog = restTemplate.getForObject("http://localhost:8083/categories"+categoryName, ProductCatalog.class, categoryName);
//		if(productcatalog != null) {
//		Long categoryId = productcatalog.getId();
//		List<Product> products=getProductsByCategoryId(categoryId);
//		return products;
//		}
//		return Collections.emptyList();
//	}

	

}
