package com.ccunix.icar.usermanager.dao;

import java.util.List;

import com.ccunix.icar.usermanager.domain.Userinfo;

public interface Userinfo_Dao {
	
	public void addUserinfo(Userinfo userinfo) throws Exception ;
	
	public List queryAllUserinfo(Userinfo userinfo) throws Exception ;
	
	public void delUserinfo(Userinfo userinfo) throws Exception ;
	
	public void  updateUserinfo(Userinfo userinfo) throws Exception ;

}
