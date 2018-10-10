var id1;
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

var obj;
function edit(id) {
	var parm = {
		title : "修改用户",
		html : "./update_usermanager.html",
		width : "50%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_system_user, exit ]
	};
	show_new_div(parm);
	// 查询回显示
	obj = new Object();
	obj.id = id;
	$.ajax({
		url : "../../../empmanage/queryEmployee_by_id.action",
		data : obj,
		success : editShow
	});
}

function editShow(data) {
	var d = data[0];
	$("#login_name").val(d.login_name);
	$("#name").val(d.name);
	$("#role").val(d.role);
	$("#idcard").val(d.idcard);
	$("#phone").val(d.phone);
	$("#update_id").val(d.id);
}

function update_system_user() {
	alert("id");
	var login_name = $("#login_name").val();
	var name = $("#name").val();
	var role = $("#role").val();
	var idcard = $("#idcard").val();
	var phone = $("#phone").val();
	var id = $("#update_id").val();
	var obj = new Object();
	obj.id = id;
	obj.login_name = login_name;
	obj.name = name;
	obj.role = role;
	obj.idcard = idcard;
	obj.phone = phone;
	$.ajax({
		url : "../../../empmanage/edit.action",
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
		url : "../../../empmanage/queryEmployee.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "登录名", "姓名", "角色","身份证号","联系电话"],
		data_column : [ "login_name", "name","role","idcard","phone"],
		title_column_width : [ "10%", "10%", "10%","20%","20%"],
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
	obj.role = value;
	obj.idcard = value;
	obj.phone = value;
	var parm = {
		url : "../../../empmanage/queryEmployee_by.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "登录名", "姓名", "角色","身份证号","联系电话" ],
		data_column : [ "login_name", "name", "role", "idcard","phone" ],
		title_column_width : [ "10%", "10%", "10%","20%","20%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
	
}

function show_new_usermanager() {
	var parm = {
		title : "新增员工",
		html : "./add_employee.html",
		width : "50%",
		height : "70%",
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
	var login_name = $("#login_name").val();
	var name = $("#name").val();
	var login_pass = $("#login_pass").val();
	var role = $("#role").val();
	var idcard = $("#idcard").val();
	var phone = $("#phone").val();
	var system_user = new Object();
	system_user.login_name = login_name;
	system_user.name = name;
	system_user.login_pass = login_pass;
	system_user.role = role;
	system_user.idcard = idcard;
	system_user.phone = phone;
	$.ajax({
		url : "../../../empmanage/add.action",
		data : system_user,
		type : "post",
		success : add_system_user_success,
		error : function(err) {
			query();
			exit();
		}
	});
}
//
function del_systemuser() {
	var parm = {
		url : "../../../empmanage/deleteEmps.action",
		success : del_systemuser_success,
		error : function(err) {
			query();
			
		}
	};
	delete_obj(parm);
}
function del_systemuser_success() {
	query();
}


function add_system_user_success() {
	query();
	exit();
}
function update_system_user_success() {
	exit();
	query();
	
}
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}