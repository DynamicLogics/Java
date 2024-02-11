package com.card.service;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * 
 * @ConfigurationProperties is an annotation in the Spring Framework that is used to bind external 
 * configuration properties to a Java bean. It is commonly used 
 * in Spring Boot applications to externalize the configuration and separate it from the code.
 * 
 */
@Configuration
@ConfigurationProperties(prefix="cards")
@Getter
@Setter
@ToString
public class CardServiceConfig {
	
	private String msg;
	private String buildVersion;
	private Map<String, String> mailDetails;
	private List<String> activeBranches;
	
}
