package com.themeleaf.app.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.themeleaf.app.dao.UserRegistrationDao;
import com.themeleaf.app.model.User;



@Service
public class UserRegistrationService {
	@Autowired
	private UserRegistrationDao userRegistrationDao;
	public List<User> getAllUsers() {		
		return userRegistrationDao.findAll();
	}

	public void addUser(@Valid User user) {
		
		userRegistrationDao.save(user);
		
	}

}
