package com.errors.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

//"com.resource_not_found_exception.code",
//"com.custom_exception.code"
@SpringBootApplication
@ComponentScan(basePackages={"com.custom_exception.code"})
public class RestErrorHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestErrorHandlingApplication.class, args);
	}

}
