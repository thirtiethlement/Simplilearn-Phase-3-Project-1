package com.example.sp3s1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.model")
@ComponentScan(basePackages = "com")
@EnableJpaRepositories(basePackages = "com.dao")
public class Sp3s1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sp3s1Application.class, args);
	}

}
