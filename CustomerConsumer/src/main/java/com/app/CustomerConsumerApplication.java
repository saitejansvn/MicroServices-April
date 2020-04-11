package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerConsumerApplication {

	public static void main(String[] args) {
		System.out.println("hiii");
		SpringApplication.run(CustomerConsumerApplication.class, args);
	}

}
