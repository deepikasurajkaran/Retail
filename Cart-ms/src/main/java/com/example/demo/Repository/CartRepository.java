package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.cart;

public interface CartRepository extends JpaRepository<cart,Long>{
	@Query(value="select cartid from cart where userid=? and productid=?;",nativeQuery=true)
	Optional<cart> findByUserIdandProductId(Long userid, Long productid);
	


}
