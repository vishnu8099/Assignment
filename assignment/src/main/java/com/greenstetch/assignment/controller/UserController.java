package com.greenstetch.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greenstetch.assignment.entity.User;
import com.greenstetch.assignment.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String signUp(@RequestBody User user){
		return service.signUp(user);
	}
	
	@GetMapping("/login")
	public String login(@RequestParam("name") String name,@RequestParam("pass") String pass) {
		return service.login(name,pass);
	}
	

}
