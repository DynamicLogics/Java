package com.OAuth2.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.OAuth2.service.UserService;
//Part-6
/*
 * 
    public PasswordEncoder encoder() : This method return the object or bean of
	BCryptPasswordEncoder. Since it is returning the bean, so we tagged this method
	with @Bean annotation so that the spring container will manage this bean.
	Spring Boot Security using OAuth2 with JWT The purpose of this method is to convert the 
	plain password into hash format during the registration of 
	a new user or it converts to the hash format at the time of user authentication.
 * 
 */

/*
    we need to create a configuration class that helps to enable Web Security. To
	make a configuration class, we need to tag the class with @Configuration
	annotation.

   	we need to define two very important methods such as the encoder() and
	authenticationManagerBean(). And this class should extend the
	WebSecurityConfigurerAdapter class. 
	
	public PasswordEncoder encoder() : This method return the object or bean of
	BCryptPasswordEncoder. Since it is returning the bean, so we tagged this method
	with @Bean annotation so that the spring container will manage this bean.
	The purpose of this method is to convert the plain password into hash format during 
	the registration of a new user or it converts to the hash format at the time of user authentication.
*/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	 @Autowired
	 public UserService userService; 
	 
	/*  
	    @Bean
	 	@Lazy
	 	public PasswordEncoder encoder() {
		   return new BCryptPasswordEncoder();
	 	}
	*/ 
	 
	 @Autowired
	 EncoderConfig pwdEncoder;
	 
	 @Override
	 @Autowired
	 //Here, Iam doing Autowiring on AuthenticationManagerBuilder in method parameter setter injection 
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		 System.out.println("step-6 SecurityConfiguration");
		//System.out.println("UserService Key: "+userService);
 		//System.out.println(pwdEncoder.encoder());
		auth.userDetailsService(userService).passwordEncoder(pwdEncoder.encoder());
	 }
	 
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
		 System.out.println("step-7 SecurityConfiguration");
		 http.authorizeRequests().anyRequest().authenticated().and().sessionManagement()
		 .sessionCreationPolicy(SessionCreationPolicy.NEVER);
	 }
	 
	 @Override
	 public void configure(WebSecurity web) throws Exception {
		 System.out.println("step-8 SecurityConfiguration");
		 web.ignoring();
	 }
	 
	 @Override
	 @Bean
	 public AuthenticationManager authenticationManagerBean() throws Exception {
		 System.out.println("step-9 SecurityConfiguration");
		 return super.authenticationManagerBean();
	 }
	
}
