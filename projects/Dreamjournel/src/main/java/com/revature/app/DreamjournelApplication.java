package com.revature.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.revature")
@EntityScan("com.revature.Models")
@EnableJpaRepositories("com.revature.repositories")
public class DreamjournelApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamjournelApplication.class, args);
	}

}