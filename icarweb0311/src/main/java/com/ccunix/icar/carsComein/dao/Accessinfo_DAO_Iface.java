package com.ccunix.icar.carsComein.dao;

import java.util.List;

import com.ccunix.icar.carsComein.domain.Accessinfo;
import com.ccunix.icar.carsite.domain.CarSite;

/**
 * Accessinfo 出入信息表 数据层
 * @author Administrator
 *
 */
public interface Accessinfo_DAO_Iface {

	/**
	 * 进入 车辆插入数据库
	 * @param accessinfo
	 * @throws Exception
	 */
	public int addAccessinfo1(Accessinfo access) throws Exception;
	
	public int addAccessinfo2(Accessinfo access) throws Exception;

	/**
	 * 离开停车场查询 
	 * @param carid 车牌号
	 * @return Accessinfo 出入信息表模型
	 * @throws Exception
	 */
	/*public Accessinfo queryAccessinfo(String carid) throws Exception;*/

	public void addOutAccessinfo1(Accessinfo access);
	public void addOutAccessinfo2(Accessinfo access);
	public List<Accessinfo> getAccessinfo(Accessinfo access);
	public List<Accessinfo> getMaxInfo(Accessinfo access);
	
	
	
 }
