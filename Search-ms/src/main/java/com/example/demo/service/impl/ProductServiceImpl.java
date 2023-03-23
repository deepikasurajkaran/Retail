package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProductSearch;
import com.example.demo.repository.ProductSearchRepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductSearchRepo productsearchrepo;
	@Override
	public List<ProductSearch> findAll() {
		// TODO Auto-generated method stub
		return productsearchrepo.getallProducts();
	}

	@Override
	public ProductSearch getByProductId(Long productid) {
		// TODO Auto-generated method stub
		return productsearchrepo.getByProductId(productid);
	}

	@Override
	public ProductSearch getByPrice(Double price) {
		// TODO Auto-generated method stub
		return productsearchrepo.getByPrice(price);
	}

	@Override
	public ProductSearch getByProductName(String name) {
		// TODO Auto-generated method stub
		return productsearchrepo.getByProductName(name);
	}

	@Override
	public ProductSearch getByImage(String image_url) {
		// TODO Auto-generated method stub
		return productsearchrepo.getByImage(image_url);
	}

	@Override
	public ProductSearch getByRating(Integer rating) {
		// TODO Auto-generated method stub
		return productsearchrepo.getByRating(rating);
	}

	@Override
	public ProductSearch getBydescription(String description) {
		// TODO Auto-generated method stub
		return productsearchrepo.getBydescription(description);
	}

}
