package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Products;
import com.example.demo.repository.productsDto;
import com.example.demo.service.ProductsService;


@RestController
@RequestMapping("/products")
public class ProductsController {
	private ProductsService productsservice;
	

	public ProductsController(ProductsService productsservice) {
		super();
		this.productsservice = productsservice;
	}

	@GetMapping
	public List<Products> findAll(){
		return productsservice.findAll();
	}
	
	@GetMapping("/productsid/{id}")
	public ResponseEntity<Products> getproductbyid(@PathVariable("id") Long id) {
		return new ResponseEntity<Products>(productsservice.getproductbyid(id),HttpStatus.OK);
		
		
	}
	@GetMapping("/categories/{categoryid}")
	public List<productsDto> getproductsbycategoryid(@PathVariable("{categoryid}") long categoryid) {
		return productsservice.getproductsbycategoryid(categoryid);
	}
		
	
	

}
