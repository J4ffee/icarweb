package com.ccunix.icar.searchinfo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.icar.searchinfo.dao.SearchInfo_DAO_Iface;
import com.ccunix.icar.searchinfo.domain.SearchInfo;
@Service
public class SearchInfo_Service_Impl implements SearchInfo_Service_Iface{
	@Resource
	SearchInfo_DAO_Iface sdi;
	@Override
	public List<SearchInfo> getAllSearchInfo() {
		List<SearchInfo> list=null;
		list = sdi.getAllSearchInfo();
		return list;
	}
	@Override
	public void deleteSearchInfo(SearchInfo searchinfo) {
		sdi.deleteSearchInfo(searchinfo);
		
	}
	
	
}
