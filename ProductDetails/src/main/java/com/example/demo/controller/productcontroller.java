package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.ProductWrapper;
import com.example.demo.service.ProductService;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/products")
public class productcontroller {
	private ProductService productservice;

	public productcontroller(ProductService productservice) {
		super();
		this.productservice = productservice;
	}
	
	
	@GetMapping
	public List<Product> findAll(){
		return productservice.findAll();
	}
	
	@GetMapping("/productsid/{id}")
	public ResponseEntity<Product> getproductbyid(@PathVariable("id") Long id) {
		return new ResponseEntity<Product>(productservice.getproductbyid(id),HttpStatus.OK);
		
	}
	
//	@GetMapping({"category"})
//	public ResponseEntity<List<Product>> getProductsByCategoryName(@PathVariable("category") String categoryName){
//		List<Product> products = productservice.getProductByCategoryName(categoryName);
//		if(products.isEmpty()) {
//			return ResponseEntity.notFound().build();
//		}
//		else {
//			return ResponseEntity.ok(products);
//		}
//	}
	
//	@GetMapping({"categoryid"})
//	public ResponseEntity<List<Product>> getProductsByCategoryId(@PathVariable("categoryid") Long catId){
//		List<Product> products = productservice.getProductsByCategoryId(catId);
//		if(products.isEmpty()) {
//			return ResponseEntity.notFound().build();
//		}
//		else {
//			return ResponseEntity.ok(products);
//		}
//	}
//-----------------
	@GetMapping("/category/{categoryid}")
	public List<Product> getProductsByCategoryId(@PathVariable("categoryid") Long category_id){
		return productservice.getProductsByCategoryId(category_id);
	}
//	------------

//	@GetMapping("/category/{categoryid}")
//	public List<ProductWrapper> findAllBycategory_id(@PathVariable("categoryid") Long category_id){
//		return productservice.findAllBycategory_id(category_id);
//	}
	
}
