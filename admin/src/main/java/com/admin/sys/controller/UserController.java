package com.admin.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.sys.entity.SystemOperator;
import com.admin.sys.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping("/list")
	public List<SystemOperator> insertUserTest1(SystemOperator so) {
		return userService.listWithPage(so);
	}

}
