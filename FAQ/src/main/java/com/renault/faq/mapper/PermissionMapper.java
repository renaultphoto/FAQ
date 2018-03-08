package com.renault.faq.mapper;

import java.util.Set;

import com.renault.faq.entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    
  //根据用户ID获取权限的Set集合
  	Set<String> findPermissionByUserId(Integer userId);
}