package com.ccunix.icar.carsComein.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ccunix.icar.carsComein.util.ToolKit;

/**
 * 出入信息表模型
 * 
 * @author Administrator
 * 
 */
public class Accessinfo implements Serializable {

	/**
	 * 编号 主键不为空 自动生成
	 */
	private int id;
	/**
	 * 车牌号 不为空值
	 */
	private String carid;
	/**
	 * 进入时间不为空值,系统时间
	 */
	private Date intime;
	/**
	 * 进场时间 字符型 封装Date型intime
	 */
	private String inTimeStr;
	/**
	 * 出场时间
	 */
	private Date outtime;
	/**
	 * 进场时间 字符型 封装Date型outtime
	 */
	private String outTimeStr;
	/**
	 * 支付金额
	 */
	private double pay;
	/**
	 * 操作员编号
	 */
	private int staffid;
	/**
	 * 是/不是会员 1/0
	 */
	
	private int existismember;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public String getInTimeStr() {
		return inTimeStr;
	}
	public void setInTimeStr(String inTimeStr) {
		this.inTimeStr = inTimeStr;
	}
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
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
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public int getExistismember() {
		return existismember;
	}
	public void setExistismember(int existismember) {
		this.existismember = existismember;
	}

	

	
}
