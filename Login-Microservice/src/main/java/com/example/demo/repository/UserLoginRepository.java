package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.example.demo.models.AuthenticationRequest;
@Repository
public class UserLoginRepository {
	@Autowired
	private JdbcTemplate temp;
	public UserDetails loadByusername(String email) {
		String sql="select * from users where email=?";
		AuthenticationRequest auth=temp.queryForObject(sql,new Object[] {email},new AuthMapper());
		return new User(auth.getEmail(),auth.getPassword(),new ArrayList<>());
	}
	

}
