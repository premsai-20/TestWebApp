package com.premsai.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUsername=username.equalsIgnoreCase("premsai");
		boolean isValidPassword=password.equalsIgnoreCase("dummy");
		return isValidUsername && isValidPassword;
	}
	
}
