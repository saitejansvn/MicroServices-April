package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Cart;

@RestController
public class CartController {
	@Value("${server.port}")
	private String port;
@GetMapping("/getcart")
	public Cart getcart()
	{
return new Cart(10,"the port no is"+port,3.3);		
	}	


}
