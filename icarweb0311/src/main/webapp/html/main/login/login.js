$(document).ready(function() {
	$("#btn_login").click(login);
});
function login() {
 var loginName = $("#username").val();
 var password = $("#password").val();
 var obj = new Object();
 obj.loginName = loginName;
 obj.loginPassword = password;
 $.ajax({
	 url:"/maven_project/login/validate.action",
	 data:obj,
	 success:addInfo
	 
	
 });
 
    
}

function addInfo(data){
	if(data[0]!=null){
	var username = data[0].loginName;
	var password = data[0].loginPassword;
	var limits = data[0].limits;

	$.cookie('username', username,{ expires: 7 });
	 $.session.set('username', username)
	if(limits==0){
		$(window.parent.document).find("#left").attr("src" , "html/admin/main/left2.html");
	}else if(limits==1){
		$(window.parent.document).find("#left").attr("src" , "html/admin/main/left3.html");
	}
	location.href="../../admin/main/center.html";}else{alert("用户名或密码输入错误");}
	
}