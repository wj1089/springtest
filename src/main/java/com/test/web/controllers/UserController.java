package com.test.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired UserService userService;
	
	
	
	
	
}
