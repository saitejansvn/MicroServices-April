package com.app.provider;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class JmsProvider  implements CommandLineRunner
{
@Autowired
	private  JmsTemplate jms;
@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
    jms.send("saitest",s->s.createTextMessage("hiiiiiiii"));
    System.out.println("message sent");
	} 
	}