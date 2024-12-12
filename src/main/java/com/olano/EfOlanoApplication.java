package com.olano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EfOlanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfOlanoApplication.class, args);
	}

}