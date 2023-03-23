package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserLoginRepository;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private UserLoginRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	UserDetails LoginUser = repo.loadByusername(email);
    	if(LoginUser==null) {
    		throw new UsernameNotFoundException("User Not Found");
    		
    	}
        return LoginUser;
    }
}