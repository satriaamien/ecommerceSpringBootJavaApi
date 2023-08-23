package com.example.EcommerceMiniProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    
    protected void configure(HttpSecurity http) throws Exception{
    	http.authorizeRequests().anyRequest()
    	.authenticated()
    	.and()
    	.formLogin()
    	.loginPage("/login")
    	.permitAll()
    	.and()
    	.logout()
    	.invalidateHttpSession(true)
    	.clearAuthentication(true)
    	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
    	.logoutSuccessUrl("/login?logout")
    	.permitAll();; 
    }
}
