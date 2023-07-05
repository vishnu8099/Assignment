package com.greenstetch.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenstetch.assignment.entity.ResponseStructure;
import com.greenstetch.assignment.entity.User;
import com.greenstetch.assignment.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository repository;
	
	public String signUp(User user){
		repository.save(user);
		
		return "you have been signedup and now please login"; 
	}
	public String login(String name,String  pass) {
		User dataByNamePass = repository.getDataByNamePass(name,pass);
		if(name.equals(dataByNamePass.getUsername())&&pass.equals(dataByNamePass.getPassword())) {
			return "Welcome to the Home page";
		}
		
		return "your login credentials are incorrect";
	}
}
