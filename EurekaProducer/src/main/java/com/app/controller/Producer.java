package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {
@GetMapping("/show")
	public String showmsg()
	{
		return "From Producer";
	}
	
}
