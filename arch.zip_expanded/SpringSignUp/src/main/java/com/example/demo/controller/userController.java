package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.service.UserService;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/users")

public class userController {
	private UserService userservice;
	
	public userController(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	@PostMapping("/signup")
	public String saveEmployee(@RequestBody User user){
//		if(userservice.getUserById(user.getEmail())!=null) {
//			return "Account already exists";
//		}
		return userservice.save(user);
				 
	}

}
