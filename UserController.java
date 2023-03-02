package com.security.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	UserDetailsService userDetailsService;

	@GetMapping("/login")
	public String welcome() {
		/* System.out.println("welcome"); */
		return "index";
	}
	
	@PostMapping("/loginprocess")
	public String dashboard(@RequestParam String username, @RequestParam String password) {
		System.out.println("login");
		String usern = userDetailsService.loadUserByUsername(username).getUsername();
		String pass = userDetailsService.loadUserByUsername(username).getPassword();
		
		if(username == usern &&  password == pass) {
			return "welcom_page";
		}
		return "index";
		
	}
	

}
