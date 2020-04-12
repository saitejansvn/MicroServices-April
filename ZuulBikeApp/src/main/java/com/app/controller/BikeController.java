package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bike")
public class BikeController 
{
	@Value("${server.port}")
	private String port;
@GetMapping("/name")
	public String bikename()
	{
		return "yahama bike is good running on";
	}
	
}
