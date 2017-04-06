package com.project.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public Map<String, Object> getUser() {
	
		Map<String, Object> map = userDao.getUser();
		
		return map;
		
	}

	
	
	
	
	
	
}
