$(document).ready(function() {
	$("#temp_login_button").click(loginStart);
});
function loginStart(){
	var parm = {
			title : "登陆",
			html : "../../../main/login/login.html",
			width : "50%",
			height : "50%",
			div_obj : $("#new_div"),
			buttons : [ "登陆", "退出" ],
			buttons_callback : [ addLoginInfo, exit ]
		};
		show_new_div(parm);
	
}
function addLoginInfo(){
	var obj = new Object();
	obj.loginName = $("#login_name").val();
	obj.loginPassword = $("#password").val();
	obj.role=$("#roleId").val();
	$.ajax({
		url : "../../../login/validate.action",
		data : obj,
		success : alter("success")
	});
}

