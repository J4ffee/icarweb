package com.ccunix.icar.carsComein.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.carsComein.domain.Accessinfo;
import com.ccunix.icar.carsComein.sevice.Accessinfo_Service_Iface;
import com.ccunix.icar.carsite.domain.CarSite;

/**
 * Accessinfo 出入信息表 控制层
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/carscomein")
public class AccessinfoController {
	//车辆刚进入，录入车牌
	@Resource
	Accessinfo_Service_Iface accessinfo_Service_Iface;
	@RequestMapping("/addcars")
	@ResponseBody
	public int addCars(Accessinfo access){
		try {
			//accessinfo_Service_Iface.addCarSpace(access);
			return accessinfo_Service_Iface.addAccessinfo(access);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 2;
	}
	@RequestMapping("/querycars")
	@ResponseBody
	public List<Accessinfo> querycars(Accessinfo access){
		List<Accessinfo> list = null;
		try {
			accessinfo_Service_Iface.addOutAccessinfo(access);
			list = accessinfo_Service_Iface.getAccessinfo(access);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
}
