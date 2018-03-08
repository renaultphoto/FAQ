package com.renault.faq.mapper;

import java.util.Set;

import com.renault.faq.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    //通过用户ID获取角色
    Set<String> findRoleByUserId(Integer userId);
}