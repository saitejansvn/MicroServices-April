package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/msg")
	public String msg()
	{
		return "feign student example";
	}
	
}
