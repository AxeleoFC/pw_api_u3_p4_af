package com.example.demo.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;

//@Component
public class JwtUtils {
	
	private static final Logger LOG=LoggerFactory.getLogger(JwtUtils.class);
	
//	@Value("${app.jw.secret}")
//	private String jwSecret;
	
	public Boolean validateJwtToken(String token) {
		try {
			Jwts
			.parser()
			.setSigningKey("semilla1")
			.parseClaimsJws(token);
			return true;
		}catch (ExpiredJwtException e) {
			// TODO: handle exception
			LOG.error("Token expiro {}",e.getMessage());
		}catch (SignatureException e) {
			// TODO: handle exception
			LOG.error("Token invalido {}",e.getMessage());
		}
		
		return false;
	}
	
	public String getUserNameFromJwtToken(String token) {
		return Jwts
				.parser()
				.setSigningKey("semilla1")
				.parseClaimsJws(token)
				.getBody().getSubject();
	}

}
