package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductCatalog;
import com.example.demo.service.CatalogService;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/categories")
public class catalogcontroller {
	@Autowired
	private CatalogService catalogservice;
	
	
	public catalogcontroller(CatalogService catalogservice) {
		super();
		this.catalogservice = catalogservice;
	}
	@GetMapping
	public List<ProductCatalog> getAllCategories(){
		return catalogservice.getallCategories();
	}
	@GetMapping("/categoryid/{id}")
	public ResponseEntity<ProductCatalog> getCategoryById(@PathVariable("id") Long id) {
		return new ResponseEntity<ProductCatalog>(catalogservice.getCategoryById(id),HttpStatus.OK);
		
	}
	
	@GetMapping("{Categoryname}")
	public ResponseEntity<ProductCatalog> getCategoryByname(@PathVariable("Categoryname") String name){
		ProductCatalog productcatalog = catalogservice.getCategoryByname(name);
		if(productcatalog == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(productcatalog);
		
	}
}
