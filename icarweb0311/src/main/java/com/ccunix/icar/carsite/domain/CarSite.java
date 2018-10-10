package com.ccunix.icar.carsite.domain;

import java.io.Serializable;
import java.util.Date;

public class CarSite implements Serializable{
	private int id;
	private String carId;
	private Date intime;
	private int existismember;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public int getExistismember() {
		return existismember;
	}
	public void setExistismember(int existismember) {
		this.existismember = existismember;
	}
	
	
}
