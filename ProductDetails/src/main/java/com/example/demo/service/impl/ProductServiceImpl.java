package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.Exception.ResourceNotFound;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productrepository;



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


	@Override
	public List<Product> getProductsByCategoryId(Long category_id) {
		return productrepository.getProductsByCategoryId(category_id);
	}



}
