package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.po.BaseDict;

public interface BaseDictService {
	
	/**
	 * 根据数据类型编号查询字典表
	 * @param typeCode
	 * @return
	 */
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}	
