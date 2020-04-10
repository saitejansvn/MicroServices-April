package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.consumer.OrderConsumer;

@RestController
public class PaymentController {

	@Autowired
	private OrderConsumer consumer;
	@GetMapping("/payment")
	public String getfromorder()
	{
		return consumer.getdata();
	}
}
