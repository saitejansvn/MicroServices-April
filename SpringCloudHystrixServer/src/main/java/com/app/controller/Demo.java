package com.app.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
public class Demo {
@HystrixCommand(fallbackMethod = "showmsg")
@GetMapping("/msg")
public String getmsg() 
	{
		int num=0;
		Random r=new Random();
	if(num==r.nextInt())
	{
		System.out.println("from dummy");
		return num+"from dummy";
	}
	return "hello hystrix";	
	}
	
public String showmsg()
{
	System.out.println("from fallback");
	return "from fallback";
}
}
