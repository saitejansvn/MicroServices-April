package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.producer.Provider;
import com.app.storage.MessageStorage;

@Controller
@RequestMapping("/kafka")
public class KafkaController {
@Autowired
	private Provider provider;
@RequestMapping("/send")
public void sendmessage(@RequestParam String message)
{
	provider.send(message);
}
//to get all messages--Autowire consumer
@Autowired
private MessageStorage s;
@RequestMapping("/view")
public String getallmessages()
{
	String finalmsg=null;
List<String> msg=s.getall();

for(String msgs:msg)
{
	finalmsg=msgs;
	System.out.println(msgs.toString());
}
return finalmsg;
}
}
