package com.app.consumer;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@EnableJms
@Component
public class JmsConsumer 
{
    @JmsListener(destination = "saitest")
	public void read(String text)
	{
		 System.out.println("the msg from sai is "+text);
	}
}