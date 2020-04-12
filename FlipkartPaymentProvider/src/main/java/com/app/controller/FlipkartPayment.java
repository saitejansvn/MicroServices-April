package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlipkartPayment {
@GetMapping("/pay")
	public String dopayment() {
		return "payment is done succesfully";
	}
	
	
}

