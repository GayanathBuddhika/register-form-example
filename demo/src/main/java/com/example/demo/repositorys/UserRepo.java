package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.userModel;

public interface UserRepo extends JpaRepository<userModel, Integer>{
	
	
}


