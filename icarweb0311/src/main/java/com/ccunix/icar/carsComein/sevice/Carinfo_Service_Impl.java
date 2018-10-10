package com.ccunix.icar.carsComein.sevice;

import java.util.Date;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.carsComein.dao.Carinfo_DAO_Iface;
import com.ccunix.icar.carsComein.domain.Carinfo;
import com.ccunix.icar.carsComein.util.ToolKit;


@Service
@Transactional
public class Carinfo_Service_Impl implements Carinfo_Service_Iface {

	@Resource
	Carinfo_DAO_Iface carinfo_dao_iface;
	@Override
	public void updateCarinfo(Carinfo carinfo) throws Exception {
		System.out.println(carinfo.getCarId()+"++"+carinfo.getMonth());
		List<Carinfo> ls = carinfo_dao_iface.getVipInfo(carinfo);
		System.out.println(ls.size());
		Carinfo carinfo2 = null;
		for(int i=0;i<ls.size();i++){
			carinfo2 = ls.get(i);
			System.out.println(carinfo2.getStartTime_str()+"++"+carinfo2.getEndTime_str());
			Date d =  ToolKit.judgeDate(new Date(), Integer.parseInt(carinfo.getMonth()));
			carinfo2.setEndTime(d);
			System.out.println(carinfo2.getEndTime());
			carinfo_dao_iface.updateCarinfo(carinfo2);
		}
	}
	
	@Override
	public List<Carinfo> getVipInfo(Carinfo carinfo) throws Exception {
		List<Carinfo> ls =  carinfo_dao_iface.getVipInfo(carinfo);
		return ls;
	}
	
	

}
