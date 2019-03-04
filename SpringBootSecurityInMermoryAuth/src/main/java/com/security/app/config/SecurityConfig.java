package com.security.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/myapp/message").hasAnyRole("user","admin").and().formLogin();
		http.authorizeRequests().antMatchers("/myapp/info").hasAnyRole("admin").and().formLogin();
	}
	
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

		auth.inMemoryAuthentication().withUser("bob").password(encoder.encode("welcome")).roles("user");
		auth.inMemoryAuthentication().withUser("allen").password(encoder.encode("welcome")).roles("admin","user");
	}

}
