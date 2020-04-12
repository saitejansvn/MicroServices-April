package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.feign.CartConsumer;
import com.app.model.Cart;

@RestController
public class PaymentController
{
@Autowired
	private CartConsumer consumer;
@GetMapping("/test")
	public Cart data()
	{
return  consumer.getdetails();
	}
	
}
