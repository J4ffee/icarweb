package com.ccunix.icar.usermanager.service;

import java.util.List;

import com.ccunix.icar.usermanager.domain.Userinfo;

public interface Userinfo_Service_Iface {
	
	public void addUserinfo(Userinfo userinfo) throws Exception ;
	
	public List queryAllUserinfo(Userinfo userinfo) throws Exception ;
	
	public void delectUserinfo(String[] ids) throws Exception ;
	
	public void updateUserinfo (Userinfo userinfo) throws Exception ;

}
