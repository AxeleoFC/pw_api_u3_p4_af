package com.example.demo.security;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {
	
	private static final Logger LOG=LoggerFactory.getLogger(JwtUtils.class);
	
	@Value("${app.jw.secret}")
	private String jwSecret;
	
	public Boolean validateJwtToken(String token) {
		Jwts
		.parser()
		.setSigningKey(this.jwSecret)
		.parseClaimsJws(token);
		return true;
	}

}
