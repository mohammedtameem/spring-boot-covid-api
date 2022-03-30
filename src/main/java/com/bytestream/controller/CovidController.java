package com.bytestream.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CovidController 
{
	
	@GetMapping("/mark")
	public String getHelloWorld()
	{
		return "Hello world!";
	}
	
	@GetMapping("/goodbye")
	public String getGoodBye()
	{
		return "Good Bye Springboot Application !";
	}


}
