package com.ccunix.icar.carsComein.dao;

import java.util.List;

import com.ccunix.icar.carsComein.domain.Carinfo;


public interface Carinfo_DAO_Iface {
	public List<Carinfo> getVipInfo(Carinfo carinfo) throws Exception;
	
	public void  updateCarinfo(Carinfo carinfo) throws Exception;
}
