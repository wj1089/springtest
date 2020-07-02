package com.test.web.services;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.test.web.domains.User;
@Component
public interface UserService {
	public void save();
	 public void update();
	 public void findOne();
	 public void findAll();	
	 public void count();
	 public void delete();
	 public User findPersonForAccess(User user);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByAccessCodeIsNull();
	 public void findByGenerLike(String gender);
	 public void findByEmailOrderByNameAsc(String email);
	 public User findByUseridAndPassword(User user);
}