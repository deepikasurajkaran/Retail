package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductCatalog;

public interface CatalogRepository extends JpaRepository<ProductCatalog,Long> {

	ProductCatalog findByname(String name);

}
