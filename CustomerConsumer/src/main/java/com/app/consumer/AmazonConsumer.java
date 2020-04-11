package com.app.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AmazonConsumer {
@Autowired
	private LoadBalancerClient client;

public String getdatafromamazonserver()
{
String url="/details";
ServiceInstance instance=client.choose("AmazonOrder");
String url1=instance.getUri().toString();
RestTemplate rt=new RestTemplate();
String resp=rt.getForObject(url1+url,String.class);
return  resp;
}
}