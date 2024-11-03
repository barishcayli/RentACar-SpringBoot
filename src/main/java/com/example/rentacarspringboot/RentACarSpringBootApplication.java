package com.example.rentacarspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.rentacarspringboot")

public class RentACarSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarSpringBootApplication.class, args);
	}


}
