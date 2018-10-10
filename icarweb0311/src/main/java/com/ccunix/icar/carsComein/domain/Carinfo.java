package com.ccunix.icar.carsComein.domain;

import java.io.Serializable;
import java.util.Date;

public class Carinfo implements Serializable{
	private int id;
	private String carId;
	private String type;
	private Date startTime;
	private String startTime_str;
	private Date endTime;
	private String endTime_str;
	private int existIsMember;
	
	private String month;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStartTime_str() {
		return startTime_str;
	}

	public void setStartTime_str(String startTime_str) {
		this.startTime_str = startTime_str;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEndTime_str() {
		return endTime_str;
	}

	public void setEndTime_str(String endTime_str) {
		this.endTime_str = endTime_str;
	}

	public int getExistIsMember() {
		return existIsMember;
	}

	public void setExistIsMember(int existIsMember) {
		this.existIsMember = existIsMember;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	
	
	
}
