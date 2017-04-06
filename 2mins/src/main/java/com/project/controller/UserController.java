package com.project.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.UserService;


@RestController
@RequestMapping(value="/login")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping (value="/user",method=RequestMethod.GET)
	public Map<String, Object> getUser(HttpServletRequest req) {

		Map<String, Object> map = userService.getUser();
		
		return map;
		
		
		
	}

	

}
