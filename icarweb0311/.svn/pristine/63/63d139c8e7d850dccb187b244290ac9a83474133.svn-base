package com.ccunix.icar.searchinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.searchinfo.domain.SearchInfo;
import com.ccunix.icar.searchinfo.service.SearchInfo_Service_Iface;

@Controller
@RequestMapping("/searchinfo")
public class SearchInfoController {
	@Resource
	SearchInfo_Service_Iface ssi;
	@ResponseBody
	@RequestMapping("/getsearchinfo")
	public List<SearchInfo> getSearchInfo(){
		System.out.println("这里是getsearchinfo");
		List<SearchInfo> list=null;
		list=ssi.getAllSearchInfo();
	
		return list;
		
	}
	@RequestMapping("/deletesearchinfo")
	@ResponseBody
	public boolean deleteSearchInfo(SearchInfo searchinfo){
		System.out.println("deleteSearchInfo+++");
		ssi.deleteSearchInfo( searchinfo);
		return true;
	}
	
}