package com.ccunix.icar.carsite.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ccunix.icar.carsite.domain.CarSite;
import com.ccunix.icar.carsite.service.CarSite_Service_Iface;

@Controller
@RequestMapping("/carsite")
public class CarSiteController {
	
	@Resource
	CarSite_Service_Iface csi;
	@RequestMapping("/queryAllCarSite")
	@ResponseBody
	public String queryAllCarSite(){
		String listStr="";
		System.out.println("carsitecontrol");
		List<CarSite> list=null;
		try {
			list = csi.queryAllCarSite();
			listStr = JSON.toJSONString(list);
			System.out.println(listStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("list.size="+list.size());
		return listStr;
	}
}
