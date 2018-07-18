package com.itheima.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.crm.po.BaseDict;
import com.itheima.crm.po.Customer;
import com.itheima.crm.service.BaseDictService;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;
import com.itheima.crm.vo.QueryVo;

@Controller
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	/**
	 * 动态条件分页查询客户列表
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Model model, QueryVo queryVo){
		//根据不同的数据编号查询字典表
		List<BaseDict> fromType = baseDictService.queryBaseDictByTypeCode("002");
		List<BaseDict> industryType = baseDictService.queryBaseDictByTypeCode("001");
		List<BaseDict> levelType = baseDictService.queryBaseDictByTypeCode("006");
		
		//将数据放进Model中,进行数据的回想
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		//调用方法获取页面对象
		Page<Customer> page = customerService.queryUserByPage(queryVo);
		
		//将查询条件添加到域中,用于数据的回显
		model.addAttribute("queryVo", queryVo);
		
		model.addAttribute("page", page);
		return "customer";
	}
	
	
	/**
	 * 接受页面的ajax请求,返回客户信息
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/edit")
	@ResponseBody
	public Customer edit(Model model, @RequestParam("id") Long custId){
		
		//查询用户
		Customer customer = customerService.queryCustomerById(custId);
		//将结果放进域中
		model.addAttribute("customer", customer);
		
		//首次添加了一些内容
		System.out.println("首次添加的内容");
		
		return customer;
	}
	
	
	/**
	 * 保存修改
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public void update(Customer customer){
		customerService.updateCustomer(customer);
	}
	
	/**
	 * 删除用户
	 * @param model
	 * @param id
	 * @return
	 */
/*	@RequestMapping("/delcust")
	@ResponseBody
	public void update(@RequestParam("id") Long custId){
		customerService.deleteCustomerById(custId);
	}*/
	
	@RequestMapping("/delcust")
	@ResponseBody
	public Map<String, String> update(@RequestParam("id") Long custId){
		Map<String, String> result = new HashMap<>();
		
		try {
			customerService.deleteCustomerById(custId);
			result.put("success", "success");
			return result;
		} catch (Exception e) {
			result.put("failed", "failed");
			return result;
		}
	}
	
}
