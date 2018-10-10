package com.ccunix.icar.usermanager.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.ParseException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.base.domain.PageModel;
import com.ccunix.icar.base.service.PageServiceIface;
import com.ccunix.icar.base.util.UUID_Tools;
import com.ccunix.icar.usermanager.domain.Userinfo;
import com.ccunix.icar.usermanager.service.Userinfo_Service_Iface;

@Controller
@RequestMapping("/tobemember")
public class UserManagerController {

	@Resource
	Userinfo_Service_Iface userinfo_Service_Iface;

	@Resource
	PageServiceIface pageService;

	@RequestMapping("/adduser")
	@ResponseBody
	public void addUser(Userinfo userinfo) {
		try {
			String uuid = UUID_Tools.getUUID();
			userinfo.setId(uuid);

			int i = userinfo.getDuration();
			Calendar c = Calendar.getInstance();
			String str_start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
					.format(c.getTime());
			c.add(Calendar.MONTH, i);
			String str_end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
					.format(c.getTime());
			try {
				Date date_start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.parse(str_start);
				Date date_end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
						.parse(str_end);
				userinfo.setStarttime(date_start);
				userinfo.setEndtime(date_end);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			userinfo_Service_Iface.addUserinfo(userinfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/queryAllUserinfo")
	@ResponseBody
	public List queryAllUserinfo(Userinfo userinfo, HttpServletRequest request) {

		try {
			List ls = userinfo_Service_Iface.queryAllUserinfo(userinfo);
			PageModel model = pageService.setPageData(request, ls);
			return pageService.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("/deluserinfo")
	@ResponseBody
	public int delUserinfo(Userinfo userinfo) {
		int r = 0;
		System.out.println(userinfo.getId());

		String[] ids = userinfo.getId().split(",");
		try {
			userinfo_Service_Iface.delectUserinfo(ids);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 1;
	}

	@RequestMapping("/updateUserinfo")
	@ResponseBody
	public int updateUsrinfo(Userinfo userinfo) {
		int r = 0;
		int i = userinfo.getDuration();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String end = userinfo.getEndtime_str();
		Date end_time = null;
		try {
			end_time = sdf.parse(end);// 初始日期
			c.setTime(end_time);// 设置日历时间
			c.add(Calendar.MONTH, i);// 在日历的月份上增加6个月
			String str_end = sdf.format(c.getTime());// 得到6个月后的日期
			Date date_end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str_end);
			userinfo.setEndtime(date_end);

			userinfo_Service_Iface.updateUserinfo(userinfo);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return r;
	}

}
