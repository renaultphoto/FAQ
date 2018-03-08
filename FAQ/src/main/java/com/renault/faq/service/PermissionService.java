package com.renault.faq.service;

import java.util.Set;

public interface PermissionService {

	//根据用户ID查询权限（permission），放入到Authorization里。
		Set<String> findPermissionByUserId(Integer userId);
}
