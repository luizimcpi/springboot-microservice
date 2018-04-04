package com.concrete.gatewayzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayZuulServerApplication.class, args);
	}
}
