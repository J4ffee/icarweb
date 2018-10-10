package com.ccunix.icar.carsComein.sevice;

import java.util.List;

import com.ccunix.icar.carsComein.domain.Carinfo;

public interface Carinfo_Service_Iface {

	public List<Carinfo> getVipInfo(Carinfo carinfo) throws Exception;
	
	public void updateCarinfo(Carinfo carinfo) throws Exception;
}
