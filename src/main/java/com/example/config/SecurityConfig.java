package com.example.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    private static final String[] UNSECURED_RESOURCE_LIST = new String[] { "/resources/**",
            "/assets/**", "/css/**", "/webjars/**", "/images/**", "/dandelion-assets/**" };

    private static final String[] UNAUTHORIZED_RESOURCE_LIST = new String[] { "/test.html", "/",
            "/unauthorized", "/error*", "/users*" };

    
	
}
