package com.example.demo.utils;


import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JwtUtils {
//	public static String generateJwtToken(String email,String secretKey) {
//		String token = Jwts.builder()
//				.setSubject(email)
//				.signWith(SignatureAlgorithm.HS512,secretKey)
//				.compact();
//		return token;
//	}
	private final SecretKey secretkey=Keys.secretKeyFor(SignatureAlgorithm.HS256);
	public String generateToken(String email) {
		Date now = new Date();
		Date expiryDate = new Date(now.getTime()+86400000);
		//these are the methods to configurethe token compact method is used to generate the final token string
		return Jwts.builder()
				.setSubject(email)
				.setIssuedAt(now)
				.setExpiration(expiryDate)
				.signWith(secretkey)
				.compact();
	}
	public String getEmailFromToken(String Token) {
		//it takes input as token and returns email address from token
		Claims claims = Jwts.parserBuilder()
				.setSigningKey(secretkey)//it is used to set the secret key used to sign the token
				.build()
				.parseClaimsJws(Token)
				.getBody();
		return claims.getSubject();
	}
}

