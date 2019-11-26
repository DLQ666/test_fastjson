package com.qi.erp.biz.impl;

import java.util.List;

import com.qi.erp.biz.IDepBiz;
import com.qi.erp.dao.IDepDao;
import com.qi.erp.entity.Dep;

/**
 * 业务逻辑类
 * @author dlq96
 */
public class DepBiz implements IDepBiz {

	private IDepDao depDao;

	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
	}

	/**
	 * 查询全部列表
	 */
	public List<Dep> getList() {
		return depDao.getList();
	}

	/**
	 * 分页
	 * @param dep1
	 */
	public List<Dep> getList(Dep dep1, Dep dep2, Object param, int firstResult, int maxResults) {
		return depDao.getList(dep1, dep2, param, firstResult, maxResults);
	}

	@Override
	public long getCount(Dep dep1, Dep dep2, Object param) {
		return depDao.getCount(dep1,dep2,param);
	}

}
