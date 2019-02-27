package com.spring.boot.app.beans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class ApplicationBean implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application Bean");
		
	}

}
