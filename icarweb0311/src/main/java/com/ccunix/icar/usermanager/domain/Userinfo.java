package com.ccunix.icar.usermanager.domain;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Userinfo implements Serializable {
	private String id;
	private String carid;
	private String type;
	private Date starttime;
	private Date endtime;
	/*private String starttime;
	private String endtime;*/
	private int existismember;
	private String username;
	private String userphone;
	private int duration;
	private String starttime_str;
	private String endtime_str;
	private int month;
	
	/*public String getStarttime() {
		Calendar calendar=Calendar.getInstance();
		Date date =calendar.getTime();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	public String getEndtime(int duration) {
		Calendar calendar=Calendar.getInstance();
		int month=calendar.get(Calendar.MONTH)+duration;
		calendar.add(Calendar.MONTH, duration);
		Date date =calendar.getTime();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}*/
	/*private String start;
	private String end;
*/
	/*private String starttime_str;
	private String endtime_str;*/
	

	
	public Userinfo() {

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	/*public Date getEndtime(int duration) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, duration);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
		//-----------------------------------------------------------
		  Calendar c = Calendar.getInstance();
	        c.add(Calendar.MONTH, duration);
	        System.out.println("�ϸ����ǣ�"+new SimpleDateFormat("yyyy��MM��").format(c.getTime()));
		Calendar calendar=Calendar.getInstance();
		int month=calendar.get(Calendar.MONTH)+duration;
		calendar.add(Calendar.MONTH, duration);
		Date date =calendar.getTime();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 dateFormat.format(date);
		return endtime;
	}*/

	/*public void setEndtime(int duration) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
		c.add(Calendar.MONTH, duration);
		String str_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str_date);
			this.endtime = date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}*/

	
	public int getExistismember() {
		return existismember;
	}

	public void setExistismember(int existismember) {
		this.existismember = existismember;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	


public String getStarttime_str() {
		return starttime_str;
	}

	public void setStarttime_str(String starttime_str) {
		this.starttime_str = starttime_str;
	}

	public String getEndtime_str() {
		return endtime_str;
	}

	public void setEndtime_str(String endtime_str) {
		this.endtime_str = endtime_str;
	}

	/*	public String getStarttime_str() {
		return starttime_str;
	}

	public void setStarttime_str(String starttime_str) {
		this.starttime_str = starttime_str;
	}

	public String getEndtime_str() {
		return endtime_str;
	}

	public void setEndtime_str(String endtime_str) {
		this.endtime_str = endtime_str;
	}
*/
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

/*	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}*/

	public String getEnd(int duration) {
		Calendar calendar=Calendar.getInstance();
		int month=calendar.get(Calendar.MONTH)+1;
		calendar.add(Calendar.MONTH, 1);
		Date date =calendar.getTime();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
/*
	public void setEnd(String end) {
		this.end = end;
	}
	*/

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	
	
}
