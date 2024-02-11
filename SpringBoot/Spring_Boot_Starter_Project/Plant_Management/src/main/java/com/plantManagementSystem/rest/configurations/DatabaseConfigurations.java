package com.plantManagementSystem.rest.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
* Author: Shubham.S.Ashtaputre
* License: Open Source Project
* Created Date: 18/08/2022
*/

@Configuration
//@ConfigurationProperties("spring.datasource")
public class DatabaseConfigurations {
	
	//Read the parameters of application-dev.properties file
	@Value("${spring.datasource.url}")
	public String url;

	//Read the parameters of application-dev.properties file
	@Value("${spring.datasource.driverClassName}")
	public String driverClassName;
	
	//Read the parameters of application-dev.properties file
	@Value("${spring.datasource.username}")
	public String username;
	
	//Read the parameters of application-dev.properties file
	@Value("${spring.datasource.password}")
	public String password;
	
	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		System.out.println("DEV environment db connection establishing...");
		System.out.println("DB URL: "+url);
		System.out.println("DB DRIVER-CLASS: "+driverClassName);
		System.out.println("USERNAME: "+username);
		System.out.println("PASSWORD: "+password);
		return "DEV DB connected successfully...";
	}
	
	@Profile("prod")
	@Bean
	public String prodDatabaseConnection() {
		System.out.println("PRODUCTION DB Connection");
		return "PRODUCTION DB Connection conn";
	}
	
}