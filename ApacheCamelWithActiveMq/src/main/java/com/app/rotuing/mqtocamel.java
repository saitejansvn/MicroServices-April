package com.app.rotuing;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class mqtocamel extends RouteBuilder
{

	@Override
	public void configure() throws Exception {
		from("jms:queue:saiqueue").to("file:C:/camel");
		
	}

	
}
