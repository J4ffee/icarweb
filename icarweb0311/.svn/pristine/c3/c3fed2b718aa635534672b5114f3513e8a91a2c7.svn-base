package com.ccunix.icar.carsite.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ccunix.icar.carsite.dao.CarSite_DAO_Iface;
@Service
@Transactional
public class CarSite_Service_Impl implements CarSite_Service_Iface{
	@Resource
	CarSite_DAO_Iface cdi;
	public List queryAllCarSite(){
		List list = null;
		list=cdi.queryAllCarSite();
		return list;
	}
	
}
