package com.security.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class MessageGenContoller {
	
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "Hi";
	}
	
	@GetMapping("/info")
	public String getProjectInfo() {
		return "Hi this is spirng boot security Project"	;
	}
	

}
