package com.security.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "login")
public class User { 
	  
 	@Id
 	@GeneratedValue(strategy = GenerationType.AUTO)
 	private String username;
 	private String password;
 	
 	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter_setter
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//constructure
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
 	
	
	
	
 	
 	
}
