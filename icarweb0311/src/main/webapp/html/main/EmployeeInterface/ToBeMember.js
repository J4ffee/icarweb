$(document).ready(function() {
	$("#new_user").click(show_new_user);
	$("#delete_user").click(del_user);

	$("#query_userinfo").click(query_userinfo);
	// 加载分页
	$("#page").load("../../../html/admin/page/page.html");
});

function edit(date) {
	var parm = {
		title : "修改用户",
		html : "./update_userinfo.html",
		width : "40%",
		height : "40%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_user, exit ]
	};
	show_new_div(parm);
	var obj = new Object();
	obj.id = date;
	$.ajax({
		url : "../../../tobemember/queryAllUserinfo.action",
		data : obj,
		success : editShow
	});
}

function editShow(data) {
	var d = data[0];
	$("#_id").val(d.id);
	$("#_username").val(d.username);
	$("#_userphone").val(d.userphone);
	$("#_endtime").val(d.endtime_str);

}

function update_user() {
	var obj = new Object();
	obj.id = $("#_id").val();
	obj.username = $("#_username").val();
	obj.userphone = $("#_userphone").val();
	obj.endtime_str = $("#_endtime").val();
	obj.duration = $("#_duration").val();
	if (Checkreg1()) {
		$.ajax({
			url : "../../../tobemember/updateUserinfo.action",
			data : obj,
			type : "post",
			success : update_userinfo_success
		});
	}
}


function query_userinfo() {
	var obj = new Object();
	var value = $("#querydata").val();
	obj.username = value;
	var parm = {
		url : "../../../tobemember/queryAllUserinfo.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "id", "车牌号", "车型", "车主姓名", "车主电话号", "办理时间", "截止时间", "是否为会员" ],
		data_column : [ "id", "carid", "type", "username", "userphone",
				"starttime_str", "endtime_str", "existismember" ],
		title_column_width : [ "5%", "10%", "10%", "10%", "15%", "15%", "15%",
				"5%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_callback : [ "edit", "delete_one" ],
		optr_column_width : [ "10%" ]
	};
	showTable(parm);

}

function delete_one(data) {
	if (confirm("确定要删除此用户吗")) {
		var obj = new Object;
		obj.id = data;
		$.ajax({
			url : "../../../tobemember/deluserinfo.action",
			data : obj,
			success : update_userinfo_success
		});

	}
}

function show_new_user() {
	var parm = {
		title : "添加包月用户",
		html : "./add_userinfo.html",
		width : "65%",
		height : "65%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_user, exit ]
	};
	show_new_div(parm);
}

function add_user() {
	var carid = $("#carid").val();
	var type = $("#type").val();
	var username = $("#username").val();
	var userphone = $("#userphone").val();
	var starttime = $("#starttime").val();
	var endtime = $("#endtime").val();
	var duration = $("#duration").val();
	var existismember = $("#existismember").val();
	var userinfo = new Object();
	userinfo.carid = carid;
	userinfo.type = type;
	userinfo.username = username;
	userinfo.userphone = userphone;
	userinfo.starttime_str = starttime;
	userinfo.endtime_str = endtime;
	userinfo.duration = duration;
	userinfo.existismember = existismember;

	if (isVehicleNumber() && Checkreg()) {
		$.ajax({
			url : "../../../tobemember/adduser.action",
			data : userinfo,
			type : "post",
			success : add_user_success,
			error : function(err) {
				alert("添加失败");
			}
		});
	}

}

function del_user() {
	var parm = {
		url : "../../../tobemember/deluserinfo.action",
		success : del_user_success
	};
	delete_obj(parm);
}

function isVehicleNumber() {
	var vehicleNumber = document.getElementById("carid").value;
	var result = false;
	if (vehicleNumber.length == 7) {
		var express = /^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$/;
		result = express.test(vehicleNumber);
	} else {
		alert("请输入正确车牌号(例如：吉A*****)");
	}
	return result;
}

function Checkreg() {
	var txt = document.getElementById("userphone").value;
	var result = false;
	if (txt.length == 11) {
		var express = /^[1][3,4,5,7,8][0-9]{9}$/;
		result = express.test(txt);
	} else {
		alert('对不起，您输入的手机号有误');
	}
	return result;
}
function Checkreg1() {
	var txt = document.getElementById("_userphone").value;
	var result = false;
	if (txt.length == 11) {
		var express = /^[1][3,4,5,7,8][0-9]{9}$/;
		result = express.test(txt);
	} else {
		alert('对不起，您输入的手机号有误');
	}
	return result;
}

function del_user_success() {
	query_userinfo();
	exit();
}

function add_user_success() {
	alert("添加成功");
	query_userinfo();
	exit();
}
function update_userinfo_success() {
	alert("修改成功");
	query_userinfo();
	exit();
}
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}