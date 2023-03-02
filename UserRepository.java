package com.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);
	
	//@Query("select u from user u where u.username = : username")
	//public User getUserByUserName(@Param("username") String username );
}
