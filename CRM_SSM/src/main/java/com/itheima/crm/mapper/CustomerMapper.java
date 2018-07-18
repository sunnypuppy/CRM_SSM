package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.po.Customer;
import com.itheima.crm.vo.QueryVo;

public interface CustomerMapper {
	
	/**
	 * 动态条件分页查询客户
	 * @param queryVo
	 * @return
	 */
	List<Customer> queryCustomerDynamic(QueryVo queryVo);
	
	/**
	 * 动态条件查询记录数
	 * @param queryVo
	 * @return
	 */
	Long queryCustomerCount(QueryVo queryVo);
	
	/**
	 * 根据用户id查询客户
	 * @param custId
	 * @return
	 */
	Customer queryCustomerById(Long custId);
	
	/**
	 * 保存修改客户的方法
	 * @param customer
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 删除客户的方法
	 * @param custId
	 */
	void deleteCustomerById(Long custId);
}
