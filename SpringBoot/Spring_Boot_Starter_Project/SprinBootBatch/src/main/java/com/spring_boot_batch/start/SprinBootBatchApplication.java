package com.spring_boot_batch.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.batch.configuration","com.batch.job"})
@EntityScan("com.batch.bean")
@EnableJpaRepositories(basePackages = {"com.batch.dao"})
public class SprinBootBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootBatchApplication.class, args);
	} 

}
