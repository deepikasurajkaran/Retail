package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Cart;

public interface CartRepository extends JpaRepository<Cart,Long> {
	
	@Query(value="select cartid from cartms where userid=? and productid=?;",nativeQuery=true)
	public String getbyuidpid(String userid, Long productid);
	@Query(value="select * from cartms where userid=?;",nativeQuery=true)
	public List<Cart> getbyuid(String userid);

//	@Query(value="select cartid from cart where userid=? and productid=?;",nativeQuery=true)
//	public Cart findByUserIdandProductId(Long userid, Long productid);

}
