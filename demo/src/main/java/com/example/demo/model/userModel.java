package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class userModel {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="user_id")
	private Integer id;
	 
	 @Column(name="first_name")
	private String first_name;
	 
	 @Column(name="last_name")
	private String last_name;
	
	


	public userModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public userModel(Integer id,String first_name, String last_name) {
		super();
		this.id=id;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	

}
