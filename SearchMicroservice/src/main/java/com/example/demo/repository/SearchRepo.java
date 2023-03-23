package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Search;

public interface SearchRepo extends JpaRepository<Search,Long> {
	@Query(value="select * from product_details where name like %?% ;",nativeQuery=true)
	List<Search> getproducts(String name);

}
