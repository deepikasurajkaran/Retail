package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProductSearch;

@Repository
public class ProductSearchRepo {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<ProductSearch> getallProducts(){
		List<ProductSearch> product = jdbctemplate.query("select * from product_details", new ProductMapper());
		return product;
	}
	public ProductSearch getByProductId(Long productid) {
		String sql="select * from product_details where productid=?";
		ProductSearch product=jdbctemplate.queryForObject(sql, new Object[] {productid}, new ProductMapper());
		return product;
	}
	public ProductSearch getByProductName(String name) {
		String sql="select * from product_details where name =?";
		ProductSearch product=jdbctemplate.queryForObject(sql, new Object[] {name}, new ProductMapper());
		return product;
	}
	public ProductSearch getByPrice(Double price) {
		String sql="select * from product_details where price=?";
		ProductSearch product=jdbctemplate.queryForObject(sql, new Object[] {price}, new ProductMapper());
		return product;
	}
	public ProductSearch getByImage(String image_url) {
		String sql="select * from product_details where image_url=?";
		ProductSearch product=jdbctemplate.queryForObject(sql, new Object[] {image_url}, new ProductMapper());
		return product;
	}
	public ProductSearch getBydescription(String description) {
		String sql="select * from product_details where description=?";
		ProductSearch product=jdbctemplate.queryForObject(sql, new Object[] {description}, new ProductMapper());
		return product;
	}
	public ProductSearch getByRating(Integer rating) {
		String sql="select * from product_details where rating=?";
		ProductSearch product=jdbctemplate.queryForObject(sql, new Object[] {rating}, new ProductMapper());
		return product;
	}

	
	
	

}
