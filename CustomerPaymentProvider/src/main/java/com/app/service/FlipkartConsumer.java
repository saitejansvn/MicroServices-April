package com.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="flipkartprovider")
public interface FlipkartConsumer {
	@GetMapping("/pay")
public String payment();
}
