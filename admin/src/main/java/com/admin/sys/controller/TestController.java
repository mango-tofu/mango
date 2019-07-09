package com.admin.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.sys.entity.User;
import com.admin.sys.service.IUserService;

@RestController
public class TestController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/insert")
	public Integer insertUserTest1(String name, Integer age) {
		return userService.insertUser(name, age);
	}
	
	@RequestMapping("/a")
	public String a(String name, Integer age) {
		return "dddafdsa";
	}
	
	
	@RequestMapping("/b")
	public List<User> b(String name, Integer age) {
		return userService.selectUsers();
	}

}
