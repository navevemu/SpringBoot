package com.themeleaf.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.themeleaf.app.model.User;

@Repository
public interface UserRegistrationDao extends JpaRepository<User,Integer>{

}
