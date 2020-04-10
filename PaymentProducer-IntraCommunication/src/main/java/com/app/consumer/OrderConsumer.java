package com.app.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderConsumer 
{

	@Autowired
	private DiscoveryClient client;
	
	public String getdata()
	{
		RestTemplate rt=new RestTemplate();
List<ServiceInstance> SiList=client.getInstances("OrderConsumer");
ServiceInstance si=SiList.get(0);
String url=si.getUri()+"/order";
String resp=rt.getForObject(url,String.class);	
return resp;	
	}
	
}
