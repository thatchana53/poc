package com.thatchana.loginservice.dao;

import org.springframework.stereotype.Repository;

import com.thatchana.loginservice.model.User;

/**
 * @author Thatchana
 * Dao implementation for login process
 */

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean authenticate(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
