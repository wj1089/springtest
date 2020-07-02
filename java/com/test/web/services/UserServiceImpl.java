package com.test.web.services;

import java.sql.Date;

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
	@Autowired User user;

	@Override
	public User findPersonForAccess(User user) {
		logger.info(user.toString());
			return userMapper.selectOneFromPersons(user);
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#save()
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findOne()
	 */
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findAll()
	 */
	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#count()
	 */
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByEmailOrUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByCreatedAtBetween(java.sql.Date, java.sql.Date)
	 */
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByAgeGraterThanEqual(int)
	 */
	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByNameLike(java.lang.String)
	 */
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByAccessCodeIsNull()
	 */
	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByGenerLike(java.lang.String)
	 */
	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByEmailOrderByNameAsc(java.lang.String)
	 */
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.test.web.services.UserService#findByUseridandPassword(com.test.web.domains.User)
	 */
	@Override
	public User findByUseridAndPassword(User param) {
		// TODO Auto-generated method stub
		return userMapper.selectByUseridAndPassword(param);
	}

	
}
 