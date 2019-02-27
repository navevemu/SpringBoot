package com.servers.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController  {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		return "Hello welcome to our portal";
		
	}

}
