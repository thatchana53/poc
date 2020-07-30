package com.thatchana.loginservice.service;

import com.thatchana.loginservice.model.User;

/**
 * @author Thatchana
 * Service interface of login process
 */

public interface LoginService {

	boolean authenticate(User user);

}
