package com.app.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class MessageStorage {
ArrayList<String> al=new  ArrayList<>();
	public void savemsgs(String messages)
	{
		al.add(messages);
		
	}
	public List<String> getall()
	{
		return al.stream().map(s->s.toString()).collect(Collectors.toList());		
	}
}
