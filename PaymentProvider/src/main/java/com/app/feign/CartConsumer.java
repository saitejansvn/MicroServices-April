package com.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Cart;

@FeignClient(name="cartprovider")
public interface CartConsumer 
{
//define the methods
	@GetMapping("/getcart")
	public Cart getdetails();
}