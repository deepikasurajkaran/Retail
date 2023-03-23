package com.example.demo.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.service.impl.UserLoginService;


@Component
public class JwtFilter extends OncePerRequestFilter{
	 @Autowired
	    private UserLoginService userloginservice;

	    @Autowired
	    private JwtUtils jwtUtils;

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
	            throws ServletException, IOException {

	        final String authorizationHeader = request.getHeader("Authorization");

	        String userName = null;
	        String token = null;

	        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
	            token = authorizationHeader.substring(7);
	            userName = jwtUtils.extractUsername(token);
	        }


	        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {

	            UserDetails userDetails = this.userloginservice.loadUserByUsername(userName);

	            if (jwtUtils.validateToken(token, userDetails)) {

	                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
	                        userDetails, null, userDetails.getAuthorities());
	                usernamePasswordAuthenticationToken
	                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
	            }
	        }
	        chain.doFilter(request, response);
	    }

		

	}

