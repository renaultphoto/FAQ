package com.renault.faq.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.renault.faq.mapper.RoleMapper;
import com.renault.faq.service.RoleService;

public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleMapper roleMapper;
	@Override
	public Set<String> findRoleByUserId(Integer userId) {
		return roleMapper.findRoleByUserId(userId);
	}

}
