package com.test.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.web.domains.User;
import com.test.web.mappers.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired UserMapper userMapper;

	@Override
	public User findPersonForAccess(User user) {
		logger.info(user.toString());
			return userMapper.selectOneFromPersons(user);
	}
}
 