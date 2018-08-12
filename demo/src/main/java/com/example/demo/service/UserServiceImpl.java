package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.userModel;
import com.example.demo.repositorys.UserRepo;

@Service
public class UserServiceImpl implements userService{
	@Autowired
	private UserRepo userRepo;
	

	public void adduser(@Valid userModel user) {
		userRepo.save(user);
		
	
		
		
	}

	public List<userModel> getAllUsers() {
		// TODO Auto-generated method stub
	List<userModel> allUser=userRepo.findAll();
	return allUser;
	}

	@Override
	public Optional<userModel> findById(Integer id) {
		return userRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
	 userRepo.deleteById(id);
		
	}

	
	

	
	

}
