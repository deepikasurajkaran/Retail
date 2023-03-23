package com.example.demo.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Exception.ResourceNotFound;
import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.repository.ResponseDto;
import com.example.demo.repository.productcategoryDto;
import com.example.demo.repository.productsDto;
import com.example.demo.service.ProductsService;
@Service
public class ProductsSerImpl implements ProductsService {
	private ProductsRepository productsrepository;
	private final RestTemplate resttemplate;
	private final String producturl="http://localhost:8083/categories/categoryid/{id}";
	
	
	public ProductsSerImpl(ProductsRepository productsrepository, RestTemplate resttemplate) {
		super();
		this.productsrepository = productsrepository;
		this.resttemplate = resttemplate;
	}

	@Override
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productsrepository.findAll();
	}

	@Override
	public Products getproductbyid(long id) {
		// TODO Auto-generated method stub
		return productsrepository.findById(id).orElseThrow(()->new ResourceNotFound("Category","id",id));
	}

	@Override
	public List<productsDto> getproductsbycategoryid(long categoryid) {
		
//		productcategoryDto categoryDto = resttemplate.getForObject("http://localhost:8083/categories/categoryid/{id}", productcategoryDto.class, categoryid);
		ResponseEntity<productsDto[]> response=resttemplate.getForEntity(producturl, productsDto[].class, categoryid);
		return Arrays.asList(response.getBody());
	
	}

}
