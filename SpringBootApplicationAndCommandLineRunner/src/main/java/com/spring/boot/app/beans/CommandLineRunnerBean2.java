package com.spring.boot.app.beans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean2 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunnerBean2");
		
	}



}
