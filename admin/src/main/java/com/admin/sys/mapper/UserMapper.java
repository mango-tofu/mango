package com.admin.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.admin.sys.entity.User;


/*@Repository
@Mapper*/
public interface UserMapper {
	// 查询语句
	List<User> selectUsers();

	// 添加
	int insert(User u);
}
