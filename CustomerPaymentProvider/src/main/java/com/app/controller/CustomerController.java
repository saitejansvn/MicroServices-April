package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.FlipkartConsumer;

@RestController
public class CustomerController
{
@Autowired
	private FlipkartConsumer consumer;
	@GetMapping("/data")
public String sucess()
{
	return "Customer Payment the payment flipkart said :::::====>"+consumer.payment();
}

}
