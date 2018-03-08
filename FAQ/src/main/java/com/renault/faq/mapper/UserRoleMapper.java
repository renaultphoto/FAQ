package com.renault.faq.mapper;

import com.renault.faq.entity.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
    
    
}