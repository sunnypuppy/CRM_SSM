package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.po.BaseDict;

public interface BaseDictMapper {
	
	/**
	 * 根据数据类型编号查询字典表
	 * @param typeCode
	 * @return
	 */
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}
