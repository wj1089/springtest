package com.test.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.test.web.domains.User;
import com.test.web.enums.Messenger;
import com.test.web.services.UserService;
@RestController
@RequestMapping("/user")
@SessionAttributes({"sessoin"})
public class UserController {
	@Autowired UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@PostMapping("/users")
	public Messenger join(@RequestBody User user) {
		System.out.println("넘어온 회원 정보 "+user.toString());
		return Messenger.SUCCESS; 
	}
	@PostMapping("/member")
	public User login(HttpSession session, @RequestBody User user) {
		User returnUser = userService.findByUseridAndPassword(user);
		session.setAttribute("session",returnUser);
		return returnUser;
	}
}
