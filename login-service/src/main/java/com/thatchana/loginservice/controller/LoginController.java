package com.thatchana.loginservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.thatchana.loginservice.Util.Response;
import com.thatchana.loginservice.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	LoginService loginService;

	
	@RequestMapping("/about")
	ResponseEntity<String> aboutLoginService() {
		String response = "Login service poc app with TDD approach";
		return new ResponseEntity<String>(response, HttpStatus.OK);	
	}
	
	@RequestMapping("/authenticate")
	Response authenticate() {
		return null;		
	}
	
}
