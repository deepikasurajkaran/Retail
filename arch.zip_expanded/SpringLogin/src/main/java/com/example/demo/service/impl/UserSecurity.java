package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.jwt.JwtFilter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class UserSecurity extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserLoginService userloginservice;
	@Autowired
	private JwtFilter jwtfilter;
	
	@Bean
	public AuthenticationProvider authprovider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userloginservice);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeRequests().antMatchers("/authenticate").permitAll().
		antMatchers(HttpMethod.OPTIONS,"/**").permitAll().anyRequest().authenticated().and().sessionManagement().
		sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(jwtfilter,UsernamePasswordAuthenticationFilter.class);
	}
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManagerBean();
	}

}
