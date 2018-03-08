package com.renault.faq.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.renault.faq.mapper.PermissionMapper;
import com.renault.faq.service.PermissionService;

public class PermissionServiceImpl implements PermissionService {

	@Autowired
	PermissionMapper permissionMapper;
	@Override
	public Set<String> findPermissionByUserId(Integer userId) {
		return permissionMapper.findPermissionByUserId(userId);
	}

}
