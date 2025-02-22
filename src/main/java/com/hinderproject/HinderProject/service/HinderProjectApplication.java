package com.hinderproject.HinderProject.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.hinderproject.HinderProject.repository")
@EntityScan("com.hinderproject.HinderProject.model")
public class HinderProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HinderProjectApplication.class, args);
	}

}
