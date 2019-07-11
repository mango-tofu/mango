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
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	public PageInfo<User> selectUsers(int page, int pageSize) {
		PageHelper.startPage(page, pageSize); // 底层实现原理采用改写语句
		List<User> listUser = userMapper.selectUsers();
		//	PageInfo<User> pageInfoUserList= userMapper.findUserList();
		// 返回给客户端展示
		PageInfo<User> pageInfoUserList = new PageInfo<User>(listUser);
		
		return pageInfoUserList;
	}

	@Transactional
	@Override
	public List<SystemOperator> listWithPage(SystemOperator so) {
		return systemOperatorMapper.listWithPage(so);
	}

}
