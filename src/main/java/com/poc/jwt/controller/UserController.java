package com.poc.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.jwt.bean.User;
import com.poc.jwt.util.SecurityUtil;

@RestController
public class UserController {

	@Autowired
	SecurityUtil securityUtil;
	
	@PostMapping("user/login")
	public User login(@RequestParam("username") String username, @RequestParam("password") String password) {

		String token = securityUtil.getJWTToken(username);
		User user = new User();
		user.setUserName(username);
		user.setToken(token);		
		return user;
		
	}	
}
