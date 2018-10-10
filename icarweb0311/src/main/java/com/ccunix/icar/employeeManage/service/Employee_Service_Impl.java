package com.ccunix.icar.employeeManage.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ccunix.icar.employeeManage.dao.empManage_Dao;
import com.ccunix.icar.employeeManage.domain.employeeDomain;
@Service
@Transactional
public class Employee_Service_Impl implements Employee_Service_iface{
    @Resource
	empManage_Dao dao;

	@Override
	public void addEmp(employeeDomain emp) throws Exception {
		System.out.println("2222=2=2=2=2=2");
		dao.addEmp(emp);
	}

	@Override
	public List queryAllUserInfo() throws Exception {
		
		return dao.queryAllUserInfo();
	}

	@Override
	public List queryEmp_by(employeeDomain obj) throws Exception {
		return dao.queryEmp_by(obj);
	}

	@Override
	public void editEmp(employeeDomain empDomain) throws Exception {
		dao.editEmp(empDomain);
	}

	@Override
	public List queryEmp_by_id(employeeDomain obj) throws Exception {
		
		return dao.queryEmp_by_id(obj);
	}

	@Override
	public void deleteEmp(employeeDomain empDomain) throws Exception {
		dao.deleteEmp(empDomain);
		
	}

	@Override
	public List query_one(employeeDomain emp) throws Exception {
		// TODO Auto-generated method stub
		return dao.query_one(emp);
	}

}
