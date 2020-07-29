package com.thatchana.loginservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class LoginController {

	
	@RequestMapping("/about")
	String aboutLoginService() {
		String response = "Login service poc app with TDD service";
		return response;		
	}
	
}
