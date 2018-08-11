package com.example.demo.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.userModel;

public interface UserRepo extends JpaRepository<userModel, Integer>{

	Optional<userModel> findById(Integer id);

	//Optional<userModel> findOne(Integer id);

	
	
	
}


