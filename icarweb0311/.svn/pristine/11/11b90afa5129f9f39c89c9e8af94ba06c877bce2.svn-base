package com.ccunix.icar.admin.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.admin.domain.AdminVIPInfo;
import com.ccunix.icar.admin.domain.ChargeStandardModel;
import com.ccunix.icar.admin.service.Admininfo_Service_Iface;
import com.ccunix.icar.base.domain.PageModel;
import com.ccunix.icar.base.service.PageServiceIface;
import com.ccunix.icar.base.util.UUID_Tools;

//控制层
@Controller
@RequestMapping("/QueryVIPInfo")
public class AdminController {
	@Resource
	Admininfo_Service_Iface admininfo_Service_Iface;
	@Resource
	PageServiceIface pageservice;
	
	@RequestMapping("/queryVIPInfo")
	@ResponseBody
	public List queryAllVIPinfo(HttpServletRequest request) {
		List ls = null;
		try {
			ls = admininfo_Service_Iface.queryAllVIPinfo();
			PageModel model = pageservice.setPageData(request, ls);
			return pageservice.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	 }
	
	@RequestMapping("/queryAllVIPinfoById")
	@ResponseBody
	public List queryAllVIPinfoById(HttpServletRequest request,AdminVIPInfo info) {
		List ls = null;
		try {
			ls = admininfo_Service_Iface.queryAllVIPinfoById(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	@RequestMapping("/updateVIPinfo")
	@ResponseBody
	public void updateVIPinfo(AdminVIPInfo userinfo){
		try {
			admininfo_Service_Iface.updateVIPinfo(userinfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("/queryChargeStandardBy")
	@ResponseBody
	public List queryChargeStandardBy(HttpServletRequest request,AdminVIPInfo userinfo) {
		List ls = null;
		try {
			ls = admininfo_Service_Iface.queryChargeStandardBy(userinfo);
			PageModel model = pageservice.setPageData(request, ls);
			return pageservice.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	@RequestMapping("/addVIPInfo")
	@ResponseBody
	public void addVIPInfo(AdminVIPInfo userinfo){
		String uuid=UUID_Tools.getUUID();
		userinfo.setId(uuid);
		System.out.println(userinfo.getCarid()+"***^^");
		try {
			admininfo_Service_Iface.addVIPInfo(userinfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/queryChargeStandard")
	@ResponseBody
	public List queryChargeStandard() {
		List ls = null;
		try {
			ls = admininfo_Service_Iface.queryChargeStandard();
			System.out.println(ls.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	 }
	@RequestMapping("/updateChargeStandard")
	@ResponseBody
	public void updateChargeStandard(ChargeStandardModel c){
		System.out.println("**"+c.getPerhour());
		try {
			admininfo_Service_Iface.updateChargeStandard(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/deleteChargeStandard")
	@ResponseBody
	public void deleteChargeStandard(AdminVIPInfo info ){
		try {
			String m=info.getId();
			String []a=m.split(",");
			for (int i = 0; i < a.length; i++) {
				info.setId(a[i]);
				
				admininfo_Service_Iface.deleteChargeStandard(info);
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
