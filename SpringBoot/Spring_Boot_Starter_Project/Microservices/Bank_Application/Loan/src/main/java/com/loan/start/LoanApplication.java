package com.loan.start;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.h2.tools.Server;

@SpringBootApplication
@RefreshScope
@ComponentScan(basePackages = {"com.loan.*","com.loan.service"})
@EntityScan(basePackages = {"com.loan.bean"})
@EnableJpaRepositories(basePackages = {"com.loan.dao"})
public class LoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplication.class, args);
	}
	
	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
	    return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}

}
