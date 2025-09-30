package com.premsai.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class loginController {
	
	
	public loginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	private AuthenticationService authenticationService ;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String gotoWelcomPage(@RequestParam String name,
								 @RequestParam String password,
								 ModelMap model) {
		if(authenticationService.authenticate(name, password)) {
		
			model.put("name", name);
			model.put("password", password);
			//authentication
			//name= premsai 
			//password= dummy
			
			return "welcomelogin";
		}
		
		model.put("errorMessage", "Invalid Credentials! Please try again" );
		return "login";
		
	}
}
