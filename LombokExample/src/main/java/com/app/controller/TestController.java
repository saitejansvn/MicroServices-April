package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

@RestController
@RequestMapping("/test")
public class TestController {
@GetMapping("/data")
	public Student studentdata()
	{
return new Student(10,"lombok example",3.3);		
	}
}
