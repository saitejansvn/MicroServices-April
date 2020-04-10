package com.app.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer 
{
	@Autowired
	private DiscoveryClient client;
@GetMapping("/consumer")	
	public String getdata()
	{
		RestTemplate rt=new RestTemplate();
List<ServiceInstance>silist=client.getInstances("Producer");
ServiceInstance si=silist.get(0);	
String url=si.getUri()+"/show";
String respmsg=rt.getForObject(url,String.class);
return respmsg;
	}

}
