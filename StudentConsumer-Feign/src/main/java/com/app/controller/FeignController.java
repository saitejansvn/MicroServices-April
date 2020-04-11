package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.feign.Studinter;

@RestController
public class FeignController {

	@Autowired
	private Studinter inter;
	@GetMapping("/final")
	public String showfinal()
	{
		return "from consumer===="+inter.data();
	}
	
}
