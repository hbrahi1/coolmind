package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfig {

    private static final String[] UNSECURED_RESOURCE_LIST = new String[] { "/resources/**",
            "/assets/**", "/css/**", "/webjars/**", "/images/**", "/dandelion-assets/**" };

    private static final String[] UNAUTHORIZED_RESOURCE_LIST = new String[] { "/test.html", "/",
            "/unauthorized", "/error*", "/users*" };

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("user").roles("USER").and()
                .withUser("admin").password("admin").roles("USER","ADMIN");
    }
	
}
