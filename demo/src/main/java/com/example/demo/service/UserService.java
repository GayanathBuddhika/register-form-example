package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.demo.model.userModel;

@Service
public class UserService {
	private List<userModel> userlist=new ArrayList<>();

	public void adduser(@Valid userModel user) {
		
		userlist.add(user);
		
		
	}

	public List<userModel> getAllUsers() {
		// TODO Auto-generated method stub
		return userlist;
	}
	
	

}
