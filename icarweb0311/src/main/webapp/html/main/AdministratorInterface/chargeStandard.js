$(document).ready(function() {
	query();
	$("#new_usernamager").click(show_new_usermanager);
	$("#delete_systemuser").click(del_systemuser);
	$("#querydata").focus(function() {
		$("#querydata").val("");
	});
	$("#querydata").blur(function() {
		if ($("#querydata").val() == "") {
			$("#querydata").val("请输入查询关键字......");
		}
	});
	$("#query_systemuser").click(query_systemuser);
	//加载分页
	$("#page").load("../../../html/admin/page/page.html");
});

function edit(id) {
	var parm = {
		title : "修改费用标准",
		html : "./updateChargeStandard.jsp",
		width : "50%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_system_user, exit ]
	};
	show_new_div(parm);
	// 查询回显示
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : "../../../QueryVIPInfo/queryChargeStandard.action",
		data : obj,
		success : editShow
	});
}

function editShow(data) {
	var d = data[0];
	$("#perhour").val(d.perhour);
	$("#permonth").val(d.permonth);
}

function update_system_user() {
	var perhour = $("#perhour").val();
	var permonth = $("#permonth").val();
	var obj = new Object();
	obj.perhour = perhour;
	obj.permonth = permonth;
	$.ajax({
		url : "../../../QueryVIPInfo/updateChargeStandard.action",
		data : obj,
		type :"post",
		success : update_system_user_success,
		error : function(err) {
			alert("err");
			exit();
		}
	});

}

function info(id) {
	alert("iiiiii");
}

function query() {
	var parm = {
		url : "../../../QueryVIPInfo/queryChargeStandard.action",
		data : null,
		table_obj : $("#datatable"),
//		 [ "登录名", "姓名", "角色", "创建时间" ]
		title : [ "临时停车", "一个月停车"],
		data_column : [ "perhour", "permonth"],
		title_column_width : [ "25%", "25%"],
		optr : [ "操作" ],
		optr_project : [ "编辑"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

function query_by() {
	var obj = new Object();
	var value = $("#querydata").val();
	obj.login_name = value;
	obj.name = value;
	var parm = {
		url : "../../../System_User/querySystem_User_by.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "登录名", "姓名", "角色", "创建时间" ],
		data_column : [ "login_name", "name", "role", "createtime_str" ],
		title_column_width : [ "25%", "15%", "25%", "15%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
	
}

function show_new_usermanager() {
	var parm = {
		title : "新增用户",
		html : "./AddCarInformation.jsp",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_system_user, exit ]
	};
	show_new_div(parm);
}

function query_systemuser() {
	var querydata = $("#querydata").val();
	if (querydata == "请输入查询关键字......") {
		query();
	} else {
		query_by();
	}
}

function add_system_user() {
	var username = $("#username").val();
	var carid = $("#carid").val();
	var type = $("#type").val();
	var userphone = $("#phone").val();
	var system_user = new Object();
	system_user.username = username;
	system_user.carid = carid;
	system_user.type = type;
	system_user.userphone = userphone;
	$.ajax({
		url : "../../../QueryVIPInfo/addVIPInfo.action",
		data : system_user,
		type : "post",
		success : add_system_user_success,
		error : function(err) {
			alert("err");
		}
	});
}
//
function del_systemuser() {
	var parm = {
		url : "../../../System_User/deleteSystem_User.action",
		success : del_systemuser_success
	};
	
	
	delete_obj(parm);
}
function del_systemuser_success() {
	query();
	exit();
}

function add_system_user_success() {
	query();
	exit();
}
function update_system_user_success() {
	alert("修改成功");
	query();
	exit();
}
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}