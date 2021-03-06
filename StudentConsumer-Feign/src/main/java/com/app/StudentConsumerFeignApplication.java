package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentConsumerFeignApplication.class, args);
	}

}
