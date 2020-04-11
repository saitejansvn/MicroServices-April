package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.consumer.AmazonConsumer;

@RestController
public class CustomerController {
@Autowired
	private AmazonConsumer con;
@GetMapping("/data")
	public String getdata()
	{
		return con.getdatafromamazonserver()+"from consumer done";
	}
}
