package com.test.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.domains.User;
import com.test.web.enums.Messenger;
import com.test.web.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@PostMapping("/users")
	public Messenger join(@RequestBody User user) {
		System.out.println("넘어온 회원 정보 "+user.toString());
		return Messenger.SUCCESS; 
	}
}
