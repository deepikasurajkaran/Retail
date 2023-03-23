package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jwt.JwtUtils;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/login")
public class UserController {
	
	@Autowired
	private AuthenticationManager authmanage;
	@Autowired
	private JwtUtils jwtutils;
	

	@PostMapping("/authenticate")
	public String authUser(@RequestBody User user) {
		try {
			@SuppressWarnings("unused")
			Authentication authtoken= authmanage.authenticate(
					new UsernamePasswordAuthenticationToken(user.getEmail(),user.getPassword()));
			String token = jwtutils.generateToken(user.getEmail().toString());
			return token;
		}
		catch(Exception e) {
			return "Login Failed";
		}
		
	}
	
	
	
	

	

}
