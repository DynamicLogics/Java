package com.loan.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@RefreshScope
@ComponentScan(basePackages = {"com.loan.*","com.loan.service"})
@EntityScan(basePackages = {"com.loan.bean"})
@EnableJpaRepositories(basePackages = {"com.loan.dao"})
public class LoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplication.class, args);
	}

}
