package com.itheima.crm.service;

import com.itheima.crm.po.Customer;
import com.itheima.crm.utils.Page;
import com.itheima.crm.vo.QueryVo;

public interface CustomerService {

	/**
	 * 动态条件分页查询客户
	 * @param queryVo
	 * @return
	 */
	Page<Customer> queryUserByPage(QueryVo queryVo);
	
	/**
	 * 根据用户id查询用户
	 * @param custId
	 * @return
	 */
	Customer queryCustomerById(Long custId);
	
	
	/**
	 * 保存修改用户的方法
	 * @param customer
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 删除客户的方法
	 * @param custId
	 */
	void deleteCustomerById(Long custId);
}
