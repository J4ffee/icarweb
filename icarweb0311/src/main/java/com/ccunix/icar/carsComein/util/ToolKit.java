package com.ccunix.icar.carsComein.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 * 
 * @author Administrator
 * 
 */
public class ToolKit {

	/**
	 * 两时间的相差小时数,不满一小时按一小时算
	 * 
	 * @param intime
	 * @param outtime
	 * @return 相差小时数
	 */
	public static long towDatesDelay(Date intime, Date outtime) {
		long DateDelay = outtime.getTime() - intime.getTime();

		if ((DateDelay % (1000 * 60 * 60)) == 0) {
			return DateDelay / (1000 * 60 * 60);
		} else {
			return DateDelay / (1000 * 60 * 60) + 1;
		}
	}

	/**
	 * 会员车 会员截止日期判断方法
	 * 
	 * @param 会员截止日期
	 * @return
	 */
	public static boolean equalsDates(Date endtime) {

		int row = endtime.compareTo(new Date());

		if (row >= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 办卡时间算法 车辆办卡 办理时间按月份计算 获取车辆办理月卡时间为 开始时间
	 * 
	 * @param intime
	 *            车辆办理时间
	 * @param mounth
	 *            车辆想要办理的月份
	 * @return Date 返回车辆月卡截止日期
	 */
	public static Date judgeDate(Date intime, int month) {

		// 获取进入时间的月数
		int inMonth = intime.getMonth();

		// 获取进入时间的年数
		int inYear = intime.getYear();

		// 办理月数加 开始时间
		int addMonth = 0;
		// 判断月数是否大于12
		if (month > 12) {
			int m1 = month / 12;
			int m2 = month % 12;
			addMonth = inMonth + m2;
			if (addMonth < 12) {
				inYear = inYear + 1 + m1;
				intime.setYear(inYear);
				intime.setMonth(addMonth);
			} else {
				inYear = inYear + 1 + m1;
				intime.setYear(inYear);
				addMonth = addMonth - 12;
				intime.setMonth(addMonth);
			}
		} else {
			addMonth = month + inMonth;
			if (addMonth < 12) {
				intime.setMonth(addMonth);
			} else {
				inYear = inYear + 1;
				intime.setYear(inYear);
				addMonth = addMonth - 12;
				intime.setMonth(addMonth);
			}
		}

		return intime;
	}

	public static void main(String[] args) {
		String d1 = "2018-8-28";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date intime = null;
		try {
			intime = sf.parse(d1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  String s = sf.format(ToolKit.judgeDate(intime, 17));
		  System.out.println(s);
		 

	}

}
