package com.ccunix.icar.searchinfo.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SearchInfo implements Serializable{
	private int id;
	private String carId;
	private Date inTime;
	private String inTimeStr;
	private Date outTime;
	private String outTimeStr;
	private double pay;
	private String staffId;
	private int existIsMember;
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
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public String getInTimeStr() {
		return inTimeStr;
	}
	public void setInTimeStr(String inTimeStr) {
		this.inTimeStr = inTimeStr;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public String getOutTimeStr() {
		return outTimeStr;
	}
	public void setOutTimeStr(String outTimeStr) {
		this.outTimeStr = outTimeStr;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public int getExistIsMember() {
		return existIsMember;
	}
	public void setExistIsMember(int existIsMember) {
		this.existIsMember = existIsMember;
	}
	
	
	
}
