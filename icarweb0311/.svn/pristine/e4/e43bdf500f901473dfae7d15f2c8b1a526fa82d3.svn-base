package com.ccunix.icar.admin.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdminVIPInfo implements Serializable{
private String id;
private String carid;//车牌号
private String type;//车类型
private String starttime;//开始时间
private String endtime;//离开时间
private int existismember;//是否会员
private String username; //车主姓名
private String userphone;//车主电话
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
public String getStarttime() {
	Calendar calendar=Calendar.getInstance();
	Date date =calendar.getTime();
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	return dateFormat.format(date);
}
public void setStarttime(String starttime) {
	this.starttime = starttime;
}
public int getExistismember() {
	return existismember;
}
public String getEndtime() {
	Calendar calendar=Calendar.getInstance();
	int month=calendar.get(Calendar.MONTH)+1;
	calendar.add(Calendar.MONTH, 1);
	Date date =calendar.getTime();
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	return dateFormat.format(date);
}
public void setEndtime(String endtime) {
	this.endtime = endtime;
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

}
