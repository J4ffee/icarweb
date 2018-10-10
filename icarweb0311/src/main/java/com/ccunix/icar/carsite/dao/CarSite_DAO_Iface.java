package com.ccunix.icar.carsite.dao;

import java.util.List;

import com.ccunix.icar.carsComein.domain.Accessinfo;
import com.ccunix.icar.carsite.domain.CarSite;

public interface CarSite_DAO_Iface {
	public List queryAllCarSite();
	//查询空余车位
	public List<CarSite> queryFreeSpace();
	//插入车位
	public void addCarId(CarSite c);
	public void moveCarSite(CarSite c);
	public void addCarSite(CarSite c);
}
