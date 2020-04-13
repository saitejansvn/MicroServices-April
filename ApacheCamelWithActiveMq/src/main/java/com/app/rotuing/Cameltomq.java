package com.app.rotuing;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;
@Component
public class Cameltomq extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
	from("file:C:/camel/misc.txt").to("jms:queue:saiqueue");	
	}

}
