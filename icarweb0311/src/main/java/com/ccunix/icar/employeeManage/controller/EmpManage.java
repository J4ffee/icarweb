package com.ccunix.icar.employeeManage.controller;



import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.base.domain.PageModel;
import com.ccunix.icar.base.service.PageServiceIface;
import com.ccunix.icar.base.util.UUID_Tools;
import com.ccunix.icar.employeeManage.domain.employeeDomain;
import com.ccunix.icar.employeeManage.service.Employee_Service_Impl;
import com.ccunix.icar.employeeManage.service.Employee_Service_iface;

@Controller
@RequestMapping("/empmanage")
public class EmpManage {
	@Resource
	Employee_Service_iface service_iface;
	@Resource
	PageServiceIface pageServiceIface;
	@RequestMapping("/add")
    public void addemp(employeeDomain empDomain){
	  System.out.println(empDomain.getLogin_name()+"==="+empDomain.getLogin_pass());
	  try {
		  String uuid = UUID_Tools.getUUID();
		  empDomain.setId(uuid);
		service_iface.addEmp(empDomain);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	@RequestMapping("/queryEmployee")
	@ResponseBody
	public List queryEmp(HttpServletRequest request){
		List ls = null;
		try {
			ls = service_iface.queryAllUserInfo();
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	@RequestMapping("/queryEmployee_by")
	@ResponseBody
	public List queryEmp_by(employeeDomain obj,HttpServletRequest request){
		List ls = null;
		try {
			ls = service_iface.queryEmp_by(obj);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	@RequestMapping("/queryEmployee_by_id")
	@ResponseBody
	public List queryEmp_by_id(employeeDomain obj){
		List ls = null;
		try {
			ls = service_iface.queryEmp_by_id(obj);
			System.out.println(ls);
			System.out.println("==========");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	@RequestMapping("/query_one")
	@ResponseBody
	public List query_one(employeeDomain obj){
		System.out.println("query_one"+obj.getLogin_name());
		List ls = null;
		try {
			ls = service_iface.query_one(obj);
			System.out.println(ls);
			System.out.println("==========");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	
	
	
	@RequestMapping("/edit")
    public void editEmp(employeeDomain empDomain){
	  try {
		  System.out.println(empDomain.getId()+"=="+empDomain.getLogin_name());
		service_iface.editEmp(empDomain);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	@RequestMapping("/deleteEmps")
	public void deleteEmp(employeeDomain empDomain){
	  try {
		String str = empDomain.getId();
		String[] str_id = str.split(",");
		for(int i=0;i<str_id.length;i++){
			empDomain.setId(str_id[i]);
			service_iface.deleteEmp(empDomain);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}
