package com.admin.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.sys.service.IUserService;

@Controller
public class FirstController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/first")
	public String  first() {
		return "index";
	}

}
