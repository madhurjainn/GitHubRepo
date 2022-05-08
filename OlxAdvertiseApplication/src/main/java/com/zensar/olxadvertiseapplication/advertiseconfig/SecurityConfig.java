/*
 * package com.zensar.olxadvertiseapplication.advertiseconfig;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * public class SecurityConfig extends WebSecurityConfigurerAdapter{
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.inMemoryAuthentication() .withUser("Zensar")
 * .password("Zensar@123") .roles("Admin") .and() .withUser("Madhur")
 * .password("Madhur@123") .roles("User"); }
 * 
 * @Bean public PasswordEncoder passwordEncoder() {
 * 
 * return NoOpPasswordEncoder.getInstance();
 * 
 * }
 * 
 * }
 */