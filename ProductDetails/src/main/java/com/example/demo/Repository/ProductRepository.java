package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Product;




public interface ProductRepository extends JpaRepository<Product,Long> {
	
	@Query(value="SELECT * FROM catalog.product_details where category_id = ?",nativeQuery=true)
	List<Product> getProductsByCategoryId(Long category_id);




}
