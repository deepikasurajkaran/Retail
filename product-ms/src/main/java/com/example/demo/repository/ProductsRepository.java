package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Products;

public interface ProductsRepository extends JpaRepository<Products,Long> {
	@Query("SELECT com.example.demo.repository.productsDto(p.productid,p.name,p.description,p.imageUrl,p.price,p.rating) from Products p WHERE p.categoryid=:categoryid")
	List<productsDto> getproductsbycategoryid(@Param("categoryid")long categoryid);
}
