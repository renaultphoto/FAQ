package com.renault.faq.entity;

import java.io.Serializable;
/**
 * 角色实体类
 * @author ccid
 *
 */
public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer roleId;
	
	private String roleName;
	
	private String roleDescription;
	
	private Integer roleStatus;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public Integer getRoleStatus() {
		return roleStatus;
	}
	public void setRoleStatus(Integer roleStatus) {
		this.roleStatus = roleStatus;
	}
	
	
}
