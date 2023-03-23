package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductSearch;
import com.example.demo.service.ProductService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProductSearchController {
	@Autowired
	private ProductService productservice;
	
	@GetMapping()
	public List<ProductSearch> findAll(){
		return productservice.findAll();
	}
	
	@GetMapping("/productid/{productid}")
	public ProductSearch getByProductId(@PathVariable("productid")Long productid) {
		return productservice.getByProductId(productid);
	}
	@GetMapping("/productname/{name}")
	public ProductSearch getByProductName(@PathVariable("name")String name) {
		return productservice.getByProductName(name);
	}
	@GetMapping("/price/{price}")
	public ProductSearch getByPrice(@PathVariable("price")Double price) {
		return productservice.getByPrice(price);
	}
	@GetMapping("/rating/{rating}")
	public ProductSearch getByRating(@PathVariable("rating")Integer rating) {
		return productservice.getByRating(rating);
	}
	@GetMapping("/desc/{desc}")
	public ProductSearch getBydescription(@PathVariable("desc")String description) {
		return productservice.getBydescription(description);
	}
	@GetMapping("/image/{image}")
	public ProductSearch getByImage(@PathVariable("image")String image_url) {
		return productservice.getByImage(image_url);
	}
	
	
	
	

}
