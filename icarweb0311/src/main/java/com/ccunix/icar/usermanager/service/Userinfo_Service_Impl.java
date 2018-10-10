package com.ccunix.icar.usermanager.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.usermanager.dao.Userinfo_Dao;
import com.ccunix.icar.usermanager.domain.Userinfo;

@Service
@Transactional
public class Userinfo_Service_Impl implements Userinfo_Service_Iface {

	@Resource
	Userinfo_Dao userinfo_Dao;

	@Override
	public void addUserinfo(Userinfo userinfo) throws Exception {
		userinfo_Dao.addUserinfo(userinfo);
	}

	@Override
	public List queryAllUserinfo(Userinfo userinfo) throws Exception {
		return userinfo_Dao.queryAllUserinfo(userinfo);
	}

	@Override
	public void delectUserinfo(String[] ids) throws Exception {
		for (int i = 0; i < ids.length; i++) {
			Userinfo userinfo = new Userinfo();
			userinfo.setId(ids[i]);
			userinfo_Dao.delUserinfo(userinfo);
		}
	}

	@Override
	public void updateUserinfo(Userinfo userinfo) throws Exception {
			userinfo_Dao.updateUserinfo(userinfo);
	}
}
