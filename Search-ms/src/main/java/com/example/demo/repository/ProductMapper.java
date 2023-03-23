package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.ProductSearch;

public class ProductMapper implements RowMapper<ProductSearch> {

	@Override
	public ProductSearch mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ProductSearch product=new ProductSearch();
		product.setProductid(rs.getLong("productid"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getDouble("price"));
		product.setImage_url(rs.getString("image_url"));
		product.setRating(rs.getInt("rating"));
		product.setDescription(rs.getString("description"));
		return product;
	}
	

}
