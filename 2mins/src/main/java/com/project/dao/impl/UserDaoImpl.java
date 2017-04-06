package com.project.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.UserDao;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Map<String, Object> getUser() {
		
		Map<String,Object> map = new HashMap<String, Object>();
		Session session = sessionFactory.getCurrentSession();
		
		
		String hql = "FROM UserEntity";
		Query query = session.createQuery(hql);
		
		map.put("users", query.list());
		
		return map;
		
	}

	
	
}
