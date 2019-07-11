package com.admin.sys.service;

import java.util.List;

import com.admin.sys.entity.SystemOperator;
import com.admin.sys.entity.User;
import com.github.pagehelper.PageInfo;

public interface IUserService {
	
	public int insertUser(String name, Integer age);

	public PageInfo<User>  selectUsers(int page, int pageSize);
	
	public List<SystemOperator> listWithPage(SystemOperator so);
}
