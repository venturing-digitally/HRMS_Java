package com.example.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity

public class UserRegistrationSecurityConfig {
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
		}

}
