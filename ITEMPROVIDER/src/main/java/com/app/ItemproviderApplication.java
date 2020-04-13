package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ItemproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemproviderApplication.class, args);
	}

}
