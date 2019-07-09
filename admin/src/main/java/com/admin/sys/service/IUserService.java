package com.admin.sys.service;

import java.util.List;

import com.admin.sys.entity.SystemOperator;
import com.admin.sys.entity.User;

public interface IUserService {
	
	public int insertUser(String name, Integer age);

	public List<User> selectUsers();
	
	public List<SystemOperator> listWithPage(SystemOperator so);
}
