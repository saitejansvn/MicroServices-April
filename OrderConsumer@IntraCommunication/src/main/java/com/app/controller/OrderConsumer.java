package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderConsumer 
{
@GetMapping("/order")
public String consumer()
	{
		return "From order Consumer";
	}
	
	
}
