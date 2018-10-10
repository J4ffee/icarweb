package com.ccunix.icar.carsComein.sevice;


import java.util.List;
import com.ccunix.icar.carsComein.domain.Accessinfo;


public interface Accessinfo_Service_Iface {

	public int addAccessinfo(Accessinfo access) throws Exception;
	public int addOutAccessinfo(Accessinfo access) throws Exception;
	public List<Accessinfo> getAccessinfo(Accessinfo access)throws Exception;
	//public CarSite addCarSpace(Accessinfo access);
 
}
