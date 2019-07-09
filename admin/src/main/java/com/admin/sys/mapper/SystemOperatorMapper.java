package com.admin.sys.mapper;

import java.util.List;

import com.admin.sys.entity.SystemOperator;

public interface SystemOperatorMapper {
    int deleteByPrimaryKey(String operatorId);

    int insert(SystemOperator record);

    int insertSelective(SystemOperator record);

    SystemOperator selectByPrimaryKey(String operatorId);

    int updateByPrimaryKeySelective(SystemOperator record);

    int updateByPrimaryKey(SystemOperator record);
    
    List<SystemOperator> listWithPage(SystemOperator record);
}