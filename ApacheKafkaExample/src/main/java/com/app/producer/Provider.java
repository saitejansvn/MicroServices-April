package com.app.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
public class Provider {
@Autowired
	private KafkaTemplate<String,String> template;
@Value("${my.app.topicname}")
private String topic;
public void send(String Message)
{
template.send(topic,Message);	
System.out.println("message from provider Snet----");
}
}
