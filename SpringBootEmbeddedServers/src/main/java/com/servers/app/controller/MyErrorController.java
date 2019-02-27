package com.servers.app.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController{

	
	private static final String PATH="/error";
	
	@RequestMapping(value=PATH)
	public String errorMsg() {
		
		return "Sorry Webpage Not found 404";
	}
	
	@Override
	public String getErrorPath() {
		
		return PATH;
	}
	
	

}
