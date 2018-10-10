package com.ccunix.icar.login.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.login.domain.StaffInfo;
import com.ccunix.icar.login.service.StaffInfo_Service_Iface;

@Controller
@RequestMapping("/login")
public class StaffInfoController {
	@Resource
	StaffInfo_Service_Iface ssi;
	
	@ResponseBody
	@RequestMapping("/validate")
	public List<StaffInfo> loginValidate(StaffInfo staffinfo){
		System.out.println("loginvalidate");
		System.out.println(staffinfo.getLoginName());
		System.out.println(staffinfo.getLoginPassword());
		List<StaffInfo> list;
		list=ssi.loginValidate(staffinfo);
		System.out.println(list.size());
		return list;
	}
}
