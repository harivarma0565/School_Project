package com.example.schools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages ="com.example.schools.*")
@ComponentScan(basePackages = "com.example.schools.*")
@Configuration
//@EnableTransactionManagement
//@PropertySource(value="classpath:application.properties")
//@EntityScan("com.example.schools.DTO")
//@EnableJpaRepositories(basePackages="com.example.schools.DAO")
public class SchoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolsApplication.class, args);
	}

}
