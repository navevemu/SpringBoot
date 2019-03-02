package com.themeleaf.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.themeleaf.app.model.User;
import com.themeleaf.app.service.UserRegistrationService;

@Controller

public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@GetMapping("/createUser")
	public ModelAndView getRegistrationForm() {
		ModelAndView mv=new ModelAndView("userform");
		mv.addObject("user", new User());
		
		
		return mv;
		
	}
	
	@PostMapping("/createUser")
	public ModelAndView registerUser(@Valid User user,BindingResult br) {
		
		ModelAndView mv=new ModelAndView();
		if(br.hasErrors()) {
			mv.setViewName("userform");
			mv.addObject("user", new User());
			return mv;			
		}
		
		userRegistrationService.addUser(user);
		mv.setViewName("userInfo");
		mv.addObject("allUsers",userRegistrationService.getAllUsers() );
		return mv;
		
		
		
	}

}
