package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class Itemcontroller {

@Value("${server.port}")	
	private String serverport;
@GetMapping("/data")
	public String getdata()
	{
		return "the data from provide ruuning on"+serverport;
	}
	
}

