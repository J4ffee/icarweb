package com.ccunix.icar.carsComein.sevice;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.carsComein.dao.Accessinfo_DAO_Iface;
import com.ccunix.icar.carsComein.dao.Carinfo_DAO_Iface;
import com.ccunix.icar.carsComein.domain.Accessinfo;
import com.ccunix.icar.carsComein.domain.Carinfo;

@Service
@Transactional
public class Accessinfo_Service_Impl implements Accessinfo_Service_Iface{

	@Resource
	Accessinfo_DAO_Iface accessinfo_DAO_Iface;
	
	@Resource
	Carinfo_DAO_Iface carinfo_DAO_Iface;
	
	
	@Override
	public int addAccessinfo(Accessinfo access) throws Exception {
		Carinfo carinfo = new Carinfo();
		carinfo.setCarId(access.getCarid());
		List<Carinfo> ls =  carinfo_DAO_Iface.getVipInfo(carinfo);
		Carinfo carinfo2 = null;
		if(ls.size()>0){
			for(int i= 0;i<ls.size();i++){
				carinfo2 = ls.get(i);
				System.out.println(carinfo2.getEndTime());
				boolean b = carinfo2.getEndTime().after(new Date());
				if(b){
					//会员截止时间大于当前时间, 可以通过
					accessinfo_DAO_Iface.addAccessinfo2(access);
					return 1;
				}else{
					//会员时间小于当前时间,请充值
					return 0;
				}
			}
		}else{
			//不是会员
			accessinfo_DAO_Iface.addAccessinfo1(access);
			return 1;
		}
		return 2;
	}
	@Override
	public int addOutAccessinfo(Accessinfo access) throws Exception {
		Carinfo carinfo = new Carinfo();
		List<Carinfo> list = carinfo_DAO_Iface.getVipInfo(carinfo);
		if(list.size()==0){
			
			accessinfo_DAO_Iface.addOutAccessinfo1(access);
		}else{
			
			accessinfo_DAO_Iface.addOutAccessinfo2(access);
		}
		return 1;
	}
	@Override
	public List<Accessinfo> getAccessinfo(Accessinfo access) throws Exception {
		List<Accessinfo> list = null;
		list = accessinfo_DAO_Iface.getAccessinfo(access);
		return list;
	}
	/*@Override
	public CarSite addCarSpace(Accessinfo access) {
		//List<CarSite> list = c.queryFreeSpace();
		CarSite c1 = new CarSite();
		c1.setId(list.get(0).getId());
		c1.setCarId(access.getCarid());
		c.addCarId(c1);
		
		return list.get(0);
		
		return null;
	}
	*/
	
/*	@Override
	public Accessinfo queryAccessinfo(String carid) throws Exception {
		System.out.println("查询车辆 service...............");
		//1从车 表中查询 看是否包月
		Accessinfo accessinfo = accessinfo_DAO_Iface.queryAccessinfo(carid);
		//2
		//不包月  
		System.out.println(accessinfo.getExistismember());
		System.out.println(accessinfo.getCarid());
		if(accessinfo.getExistismember()==0){
			accessinfo.setPay(30.00*(ToolKit.towDatesDelay(accessinfo.getIntime(), accessinfo.getOuttime())));
		}
		return accessinfo;
	}*/

}
