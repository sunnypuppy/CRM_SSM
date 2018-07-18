package com.itheima.crm.po;

public class BaseDict {
	private String dictId; // varchar(32) NOT NULL COMMENT '数据字典id(主键)',
	private String dictTypeCode; // varchar(10) NOT NULL COMMENT '数据字典类别代码',
	private String dictTypeName; // varchar(64) NOT NULL COMMENT '数据字典类别名称',
	private String dictItemName; // varchar(64) NOT NULL COMMENT '数据字典项目名称',
	private String dictItemCode; // varchar(10) DEFAULT NULL COMMENT '数据字典项目代码(可为空)',
	private Integer dictSort; // int(10) DEFAULT NULL COMMENT '排序字段',
	private String dictEnable; // char(1) NOT NULL COMMENT '1:使用 0:停用',
	private String dictMemo; // varchar(64) DEFAULT NULL COMMENT '备注',
	public String getDictId() {
		return dictId;
	}
	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	public String getDictTypeCode() {
		return dictTypeCode;
	}
	public void setDictTypeCode(String dictTypeCode) {
		this.dictTypeCode = dictTypeCode;
	}
	public String getDictTypeName() {
		return dictTypeName;
	}
	public void setDictTypeName(String dictTypeName) {
		this.dictTypeName = dictTypeName;
	}
	public String getDictItemName() {
		return dictItemName;
	}
	public void setDictItemName(String dictItemName) {
		this.dictItemName = dictItemName;
	}
	public String getDictItemCode() {
		return dictItemCode;
	}
	public void setDictItemCode(String dictItemCode) {
		this.dictItemCode = dictItemCode;
	}
	public Integer getDictSort() {
		return dictSort;
	}
	public void setDictSort(Integer dictSort) {
		this.dictSort = dictSort;
	}
	public String getDictEnable() {
		return dictEnable;
	}
	public void setDictEnable(String dictEnable) {
		this.dictEnable = dictEnable;
	}
	public String getDictMemo() {
		return dictMemo;
	}
	public void setDictMemo(String dictMemo) {
		this.dictMemo = dictMemo;
	}

	

}
