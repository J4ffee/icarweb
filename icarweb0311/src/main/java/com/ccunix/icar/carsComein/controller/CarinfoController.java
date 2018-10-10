package com.ccunix.icar.carsComein.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.carsComein.domain.Carinfo;
import com.ccunix.icar.carsComein.sevice.Carinfo_Service_Iface;

@Controller
@RequestMapping("/carinfoController")
public class CarinfoController {

	@Resource
	Carinfo_Service_Iface carinfo_service_iface;
	
	@RequestMapping("/updateCarinfo")
	@ResponseBody
	public int updateCarinfo(Carinfo carinfo){
		try {
			System.out.println("updateCarinfo");
			carinfo_service_iface.updateCarinfo(carinfo);
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	@RequestMapping("/getVipInfo")
	@ResponseBody
	public List<Carinfo> getVipInfo(Carinfo carinfo){
		List<Carinfo> ls = null;
		try {
			ls =  carinfo_service_iface.getVipInfo(carinfo);
			return ls;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	
	
}
