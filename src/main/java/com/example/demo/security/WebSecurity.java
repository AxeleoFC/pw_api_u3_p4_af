package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSecurity {

	@Autowired
	private AuthEntryPointJwt unauthorizeHandle;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http
		.cors()
		.and()
		.csrf()
		.disable()
		.exceptionHandling()
		.authenticationEntryPoint(unauthorizeHandle)
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authorizeRequests()
		.anyRequest()
		.authenticated();
		
		http
		.addFilterBefore(this.autheticationJwTokenFilter()
				, UsernamePasswordAuthenticationFilter.class);
		//httpSecurity.authenticationProvider(authenticationProvider());
		return http.build();
		
	}
	
	public AuthTokenFilter autheticationJwTokenFilter() {
		return new AuthTokenFilter();
	}

}
