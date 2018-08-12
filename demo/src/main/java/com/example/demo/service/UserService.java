package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.demo.model.userModel;

public interface userService {
	
	public void adduser(userModel user);
	public List<userModel> getAllUsers();
	public Optional<userModel> findById(Integer id);
	public void deleteById(Integer id);
	public void updateUser(@Valid userModel updateUser);
	

}
