package com.ccunix.icar.admin.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ccunix.icar.admin.dao.AdminInfoDao_Iface;
import com.ccunix.icar.admin.domain.AdminVIPInfo;
import com.ccunix.icar.admin.domain.ChargeStandardModel;
//业务层
@Service
@Transactional
public class AdminInfo_Service_Impl implements Admininfo_Service_Iface{
	@Resource
	AdminInfoDao_Iface adminInfoDao_Iface; 
	public List queryAllVIPinfo() throws Exception {
		return adminInfoDao_Iface.queryAllAdminInfo();
	}
	@Override
	public void addVIPInfo(AdminVIPInfo info) throws Exception {
		adminInfoDao_Iface.addVIPInfo(info);
	}
	@Override
	public List queryChargeStandard() throws Exception {
		
		return adminInfoDao_Iface.queryChargeStandard();
	}
	@Override
	public void updateChargeStandard(ChargeStandardModel c) throws Exception {
		adminInfoDao_Iface.updateChargeStandard(c);
	}
	@Override
	public void deleteChargeStandard(AdminVIPInfo info) throws Exception {
		adminInfoDao_Iface.deleteChargeStandard(info);
		
	}
	@Override
	public List queryChargeStandardBy(AdminVIPInfo info) throws Exception {
		return adminInfoDao_Iface.queryChargeStandardBy(info);
	}
	@Override
	public void updateVIPinfo(AdminVIPInfo info) throws Exception {
		adminInfoDao_Iface.updateVIPinfo(info);
		
	}
	@Override
	public List queryAllVIPinfoById(AdminVIPInfo info) throws Exception {
		return adminInfoDao_Iface.queryAllVIPinfoById(info);
	}

}
