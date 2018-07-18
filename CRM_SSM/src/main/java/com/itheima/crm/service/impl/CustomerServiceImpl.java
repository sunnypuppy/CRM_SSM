package com.itheima.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.crm.mapper.CustomerMapper;
import com.itheima.crm.po.Customer;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;
import com.itheima.crm.vo.QueryVo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Page<Customer> queryUserByPage(QueryVo queryVo) {
		//查询总的记录数
		Long count = customerMapper.queryCustomerCount(queryVo);
		
		//查询本页的记录数
		List<Customer> customers = customerMapper.queryCustomerDynamic(queryVo);
		
		//创建分页对象
		Page<Customer> page = new Page<>(count.intValue(), queryVo.getPage(), queryVo.getRows(), customers);
		
		return page;
	}

	@Override
	public Customer queryCustomerById(Long custId) {
		return customerMapper.queryCustomerById(custId);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateCustomer(customer);
	}

	@Override
	public void deleteCustomerById(Long custId) {
		customerMapper.deleteCustomerById(custId);
	}
	


}
