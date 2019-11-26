package com.qi.erp.entity;

import java.io.Serializable;

/**
 * @author dlq96
 * 部门实体类
 *
 */
public class Dep implements Serializable{
	private Long uuid;//部门编号
	private String name;//部门名称
	private String tele;//部门电话
	
	public Long getUuid() {
		return uuid;
	}
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	
	
}
