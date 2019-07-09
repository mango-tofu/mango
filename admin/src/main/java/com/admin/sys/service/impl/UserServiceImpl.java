package com.admin.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.sys.entity.SystemOperator;
import com.admin.sys.entity.User;
import com.admin.sys.mapper.SystemOperatorMapper;
import com.admin.sys.mapper.UserMapper;
import com.admin.sys.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private SystemOperatorMapper systemOperatorMapper;

	@Transactional
	public int insertUser(String name, Integer age) {
		User u = new User();
		u.setAge(age);
		u.setName(name);
		int insertUserResult = userMapper.insert(u);
		
		int a = 1/age;
		return insertUserResult;
	}

	@Transactional
	public List<User> selectUsers() {
		return userMapper.selectUsers();
	}

	@Transactional
	@Override
	public List<SystemOperator> listWithPage(SystemOperator so) {
		return systemOperatorMapper.listWithPage(so);
	}

}
