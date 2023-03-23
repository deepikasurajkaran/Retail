package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Product;
import com.example.demo.model.ProductWrapper;



public interface ProductRepository extends JpaRepository<Product,Long> {
	
//	@Query(value="select p.name,p.image_url,p.price,p.description,p.rating,pc.name from product_details\r\n"
//			+ "p,productcategories pc where p.category_id=pc.id and pc.id=?;",nativeQuery=true)
	@Query(value="SELECT * FROM catalog.product_details where category_id = ?",nativeQuery=true)
	List<Product> getProductsByCategoryId(Long category_id);




}
