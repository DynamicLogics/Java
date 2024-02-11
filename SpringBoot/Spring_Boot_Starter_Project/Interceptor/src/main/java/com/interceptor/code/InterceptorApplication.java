package com.interceptor.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.interceptor.*"})
public class InterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterceptorApplication.class, args);
	}

}
