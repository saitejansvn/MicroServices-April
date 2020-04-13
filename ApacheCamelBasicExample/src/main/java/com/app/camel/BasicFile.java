package com.app.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class BasicFile extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
	//Basic Example 1
		/*from("file:C:\\camel?noop=true").to("file:D:\\camel");
		System.out.println("files Copied");*/
	//Basic Example 2 
	
		from("file:c:\\camel?noop=true").process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				// TODO Auto-generated method stub
				//read the data
Message message=exchange.getIn();
//perform modifications
String body=message.getBody(String.class);
//do processing	
body="body modified"+body;
//Write data 
Message msg=exchange.getOut();

msg.setBody(msg);			
			}
		}).to("file:D:\\camel");	
	}
}
