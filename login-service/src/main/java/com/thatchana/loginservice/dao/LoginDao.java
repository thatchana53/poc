package com.thatchana.loginservice.dao;

import com.thatchana.loginservice.model.User;

/**
 * @author Thatchana
 * Dao interface for log process
 */
public interface LoginDao {

	boolean authenticate(User user);
}
