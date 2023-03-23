package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import com.example.demo.utils.JwtUtils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("api/login")
public class Logincontroller {
	private final RestTemplate restTemplate;

	public Logincontroller(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	@PostMapping
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginrequest){
		String url="http://localhost:8082/api/signup/users/{email}";
		Map<String,String> variables=new HashMap<>();
		variables.put("email", loginrequest.getEmail());
		ResponseEntity<User> response=restTemplate.getForEntity(url, User.class, variables);
		User user = response.getBody();
		if(user==null||!passwordEncoder().matches(loginrequest.getPassword(),user.getPassword())){
			return ResponseEntity.badRequest().build();
		}
//		String token = Jwts.builder()
//						.setSubject(user.getEmail())
//						.signWith(SignatureAlgorithm.HS512,"secret-key")
//						.compact();
		String token = JwtUtils.generateToken(user.getEmail());
		LoginResponse loginresponse = new LoginResponse();
		loginresponse.setToken(token);
		return ResponseEntity.ok(loginresponse);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
