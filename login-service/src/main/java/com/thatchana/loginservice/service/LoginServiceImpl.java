package com.thatchana.loginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thatchana.loginservice.dao.LoginDao;
import com.thatchana.loginservice.model.User;

/**
 * @author Thatchana
 * Service implementation of login process
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public boolean authenticate(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}