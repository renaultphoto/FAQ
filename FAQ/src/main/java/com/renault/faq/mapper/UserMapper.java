package com.renault.faq.mapper;

import org.apache.ibatis.annotations.Param;

import com.renault.faq.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User getUserByAccount(@Param("username")String userName);
}