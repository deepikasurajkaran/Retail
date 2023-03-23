package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Products;
import com.example.demo.repository.productsDto;


public interface ProductsService {
	List<Products> findAll();
	Products getproductbyid(long id);

	List<productsDto> getproductsbycategoryid(long categoryid);

}
