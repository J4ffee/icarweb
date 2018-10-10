$(document).ready(function() {
	query();
	//加载分页
	$("#page").load("../../../html/admin/page/page.html");
});



function query() {
	var parm = {
		url : "../../../searchinfo/getsearchinfo.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "车牌号", "进入时间", "离开时间","费用"],
		data_column : [ "carId", "inTimeStr", "outTimeStr", "pay" ],
		title_column_width : [ "20%", "15%", "30%", "15%"],
		optr : [ "" ],
		optr_project : [ "删除"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
function edit(id){
	var obj = new Object();
	obj.id=id;
	$.ajax({
		url : "../../../searchinfo/deletesearchinfo.action",
		data : obj,
		type : "post",
		success : query
	});
	
}