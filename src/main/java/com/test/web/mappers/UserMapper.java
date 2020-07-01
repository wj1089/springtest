package com.test.web.mappers;

import java.util.HashMap;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.test.web.domains.User;
@Repository
public interface UserMapper {
	public void insertOneIntoPersons(User user);
	public User selectOneFromPersons(User user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncatePerson(HashMap<String, String> paramMap);
	
}