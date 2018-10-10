package com.ccunix.icar.login.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.icar.login.dao.StaffInfo_DAO_Iface;
import com.ccunix.icar.login.domain.StaffInfo;

@Service
public class StaffInfo_Service_Impl implements StaffInfo_Service_Iface{
	@Resource
	StaffInfo_DAO_Iface sdi;
	@Override
	public List<StaffInfo> loginValidate(StaffInfo staffinfo) {
		
		return sdi.loginValidate(staffinfo);
		
	}

}
