package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonOrder
{
	@Value("${server.port}")
private String port;
	@GetMapping("/details")
	public String orderdeatails()
	{
		return "order recived in port"+port;
	}
}
