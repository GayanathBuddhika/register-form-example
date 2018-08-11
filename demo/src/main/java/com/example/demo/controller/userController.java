package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.userModel;
import com.example.demo.repositorys.UserRepo;
import com.example.demo.service.userService;

@Controller
@RequestMapping(value="/user")
public class userController {
	@Autowired
	private userService userService; 
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping(value="/createUser")
	public ModelAndView createUserview() {
		ModelAndView mv=new ModelAndView("createUser");
		mv.addObject("user", new userModel());
		return mv;
	}
	
	@PostMapping(value="/createUser")
	public ModelAndView createUser(@Valid userModel user , BindingResult result) {
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("createUser");
			mv.addObject("user", user);
			return mv;
			
		}
		userService.adduser(user);
		mv.addObject("allUsers", userService.getAllUsers());
		mv.setViewName("userInfo");
		return mv;
		}
	//search user
	@GetMapping(value="searchUser")
	public ModelAndView searchUserView() {
		ModelAndView mv=new ModelAndView("searchUser");
		mv.addObject("user", new userModel());
		return mv;
		
	}
	
	@PostMapping(value="/searchUser")
	public ModelAndView searchUser(@Valid userModel user , BindingResult result) {
		System.out.println("return again");
		Integer id = user.getId();
		System.out.println("This is" + id);
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("searchUser");
			mv.addObject("user", user);
			System.out.println("return again");
			return mv;
			
		}
		System.out.println("return again1");
		Optional<userModel> user2 = userService.findById(id);
		mv.addObject("oneUser", user2.get());
		System.out.println("return again2");
		mv.setViewName("userData");
		return mv;
		}
		
	
	
	

}
