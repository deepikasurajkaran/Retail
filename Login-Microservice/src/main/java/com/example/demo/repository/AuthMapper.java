package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.models.AuthenticationRequest;

public class AuthMapper implements RowMapper<AuthenticationRequest> {

	@Override
	public AuthenticationRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		AuthenticationRequest auth = new AuthenticationRequest();
		auth.setEmail(rs.getString("email"));
		auth.setPassword(rs.getString("password"));
		return auth;
	}

}
