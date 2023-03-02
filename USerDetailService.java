package com.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.confrigation.UserPrincipal;
import com.security.dao.UserRepository;
import com.security.entity.User;

@Service
public class USerDetailService implements UserDetailsService{

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user =  repository.findByUsername(username);
		if(user==null) {
			throw new  UsernameNotFoundException("user not found!");
			 
		}
		return new UserPrincipal(user);
	}
}
