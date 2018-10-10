package com.ccunix.icar.employeeManage.dao;

import java.util.List;

import com.ccunix.icar.employeeManage.domain.employeeDomain;

public interface empManage_Dao {
   public void addEmp(employeeDomain emp) throws Exception;
   public List queryAllUserInfo() throws Exception;
   public List queryEmp_by(employeeDomain obj) throws Exception;
   public void editEmp(employeeDomain empDomain) throws Exception;
   public List queryEmp_by_id(employeeDomain obj) throws Exception;
   public void deleteEmp(employeeDomain empDomain) throws Exception;
   public List query_one(employeeDomain empDomain) throws Exception;
}
