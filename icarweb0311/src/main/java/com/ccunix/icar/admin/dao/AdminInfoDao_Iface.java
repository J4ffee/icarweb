package com.ccunix.icar.admin.dao;

import java.util.List;

import com.ccunix.icar.admin.domain.AdminVIPInfo;
import com.ccunix.icar.admin.domain.ChargeStandardModel;

public interface AdminInfoDao_Iface {
	public List queryAllAdminInfo() throws Exception;
	public boolean addVIPInfo(AdminVIPInfo info) throws Exception;
	public void updateVIPinfo(AdminVIPInfo info) throws Exception;
	public List queryChargeStandard() throws Exception;
	public List queryChargeStandardBy(AdminVIPInfo info) throws Exception;
	public void updateChargeStandard(ChargeStandardModel c) throws Exception;
	public void deleteChargeStandard(AdminVIPInfo info) throws Exception;
	public List queryAllVIPinfoById(AdminVIPInfo info) throws Exception;

	
}
