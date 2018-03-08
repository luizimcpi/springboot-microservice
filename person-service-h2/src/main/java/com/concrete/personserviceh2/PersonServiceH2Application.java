package com.concrete.personserviceh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersonServiceH2Application {

	public static void main(String[] args) {
		SpringApplication.run(PersonServiceH2Application.class, args);
	}
}
