package com.test.web.services;

import org.springframework.stereotype.Component;

import com.test.web.domains.User;
@Component
public interface UserService {
	public User findPersonForAccess(User user);
}