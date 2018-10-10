$(document).ready(function() {
	$("#TjCarsNum").click(Give_Cars_Num);

	$("#Tjquery_carsid").click(query_carsid);

});


function Give_Cars_Num(){
	var obj = new Object();
	var carid = $("#carid").val();
	obj.carid = carid;
	$.ajax({
		url : "../../../carscomein/addcars.action",
		data : obj,
		type : "post",
		success : add_system_user_success,
		error : function(err) {
			alert("err");
		}
	});
}

function query_carsid() {
	var carid = $("#query_carsid").val();
	if(carid==""||carid==null||carid===""){
		alert('请输入车牌号');
	}else{
		query();
	}
}
function query() {
	var obj = new Object();
	var carid = $("#query_carsid").val();
	obj.carid = carid;
	var parm = {
		url : "../../../carscomein/querycars.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "车牌", "停车时间", "离开时间", "费用" , "是否为会员"],
		data_column : [ "carid", "inTimeStr", "outTimeStr", "pay" ,"existismember"],
		title_column_width : [ "15%", "15%", "15%", "15%" ,"15%" ],
		optr : [ "操作" ],
		optr_project : [ "结算" ],
		optr_callback : [ "edit" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

function add_system_user_success(data) {
	if(data==0){
		alert("月卡余额不足,请充值");
		var b =  confirm('是否充值?')
		if(b==true){
			update_carinfo();
		}else{
			exit();
		}
	}else if(data==1){
		alert("进入成功");
	}else{
		alert("err")
	}
}

function update_carinfo() {
	var parm = {
		title : "修改用户",
		html : "./update_userinfo.html",
		width : "40%",
		height : "40%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_car, exit ]
	};
	show_new_div(parm);
	
}
function update_car(){
	var carId =  $("#carid").val();
	var month =  $("#month").val();
	alert(carId);
	alert(month);
	var obj = new Object();
	obj.carId = carid;
	obj.month = month;

	$.ajax({
		type:"GET",
		url : "../../../carinfoController/updateCarinfo.action",
		data:{carId:carId,month:month},
		success:editShowcar,
		error: function(err){
			alert("err");
			alert(url);
		}
	})
}

function editShowcar(data) {
	alert(data,"fasdf")
	exit();
	var obj = new Object();
	var carId = $("#carid").val();
	alert(carid);
	var parm = {
		url : "../../../carinfoController/getVipInfo.action",
		data : {carId:carId},
		table_obj : $("#datatable"),
		title : [ "会员号码", "车牌", "开卡时间", "截止时间"],
		data_column : [  "id" , "carId", "startTime_str", "endTime_str"],
		title_column_width : [ "15%", "15%", "15%", "15%" ],
		optr : [ "操作" ],
		optr_project : [ "  " ],
		optr_callback : [ "edit" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}


function edit(){
	alert("结算成功");
}
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
