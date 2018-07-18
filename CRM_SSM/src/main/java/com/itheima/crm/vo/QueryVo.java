package com.itheima.crm.vo;

/**
 * @author Lrg
 * 封装页面传递的分页以及其他的条件数据
 */
public class QueryVo {
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	private Integer start = 0;
	private Integer page = 1;
	private Integer rows = 20;
	
	public Integer getStart() {
		start = (page - 1) * rows;
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
}	
