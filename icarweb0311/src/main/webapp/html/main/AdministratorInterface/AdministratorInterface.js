$(document).ready(function() {
	query();
	$("#new_usernamager").click(show_new_usermanager);
	$("#delete_systemuser").click(del_systemuser);
	$("#queryAA").focus(function() {
		$("#queryAA").val("");
	});
	$("#queryAA").blur(function() {
		if ($("#queryAA").val() == "") {
			$("#queryAA").val("请输入查询关键字......");
		}
	});
	$("#query_systemuser").click(query_systemuser);
	//加载分页
	$("#page").load("../../../html/admin/page/page.html");
});

function edit(id) {
	var parm = {
		title : "修改用户",
		html : "./UpdateCarInformation.jsp",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_system_user, exit ]
	};
	show_new_div(parm);
	// 查询回显示
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : "../../../QueryVIPInfo/queryAllVIPinfoById.action",
		data : obj,
		success : editShow
	});
}

function editShow(data) {
	var d = data[0];
	$("#username").val(d.username);
	$("#carid").val(d.carid);
	$("#type").val(d.type);
	$("#userphone").val(d.userphone);
	$("#id1").val(d.id);
}

function update_system_user() {
	var username = $("#username").val();
	var id = $("#id1").val();
	var carid = $("#carid").val();
	var type = $("#type").val();
	var userphone = $("#userphone").val();
	var obj = new Object();
	obj.username = username;
	obj.carid = carid;
	obj.type = type;
	obj.userphone = userphone;
	obj.id = id;
	$.ajax({
		url : "../../../QueryVIPInfo/updateVIPinfo.action",
		data : obj,
		type :"post",
		success : update_system_user_success,
		error : function(err) {
			query();
			exit();
		}
	});

}

function info(id) {
	alert("iiiiii");
}

function query() {
	var parm = {
		url : "../../../QueryVIPInfo/queryVIPInfo.action",
		data : null,
		table_obj : $("#datatable"),
//		 [ "登录名", "姓名", "角色", "创建时间" ]
		title : [ "车牌号", "车主", "车辆型号","车主电话","开始时间","结束时间"],
		data_column : [ "carid", "username","type", "userphone","starttime","endtime"],
		title_column_width : [ "10%", "10%","10%", "15%","20%","20%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

function query_by() {
	var obj = new Object();
	var value = $("#queryAA").val();
	obj.carid = value;
	obj.type = value;
	obj.username = value;
	obj.userphone = value;
	var parm = {
		url : "../../../QueryVIPInfo/queryChargeStandardBy.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "车牌号", "车主", "车辆型号","车主电话","开始时间","结束时间"],
		data_column : [ "carid", "username","type", "userphone","starttime","endtime"],
		title_column_width : [ "10%", "10%","10%", "15%","20%","20%" ],
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
	var querydata = $("#queryAA").val();
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
		url : "../../../QueryVIPInfo/deleteChargeStandard.action",
		success : del_systemuser_success,
		error : function(err) {
			alert(err)
			query();
			exit();
		}
	};
	delete_obj(parm);
}
function del_systemuser_success() {
	alert('删除成功');
	query();
	exit();
}

function add_system_user_success() {
	alert('增加成功');
	query();
	exit();
}
function update_system_user_success() {
	alert('修改成功');
	query();
	exit();
}
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}