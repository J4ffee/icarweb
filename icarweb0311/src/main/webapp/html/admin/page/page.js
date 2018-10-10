var global_pagesize = 10;





function initPageScreen(global_pageinfo)
{	//读取屏幕分辨率，设置表格行size（pagesize）
	//服务器端有默认值，不调用这个方法，pagesize为服务器默认值
	global_pagesize = global_pageinfo["pagesize"];
	var obj = new Object();
	obj.pagesize = global_pagesize;
	$.ajax({
		url : "../../../PageController/initPageScreen.action",
		data : obj
	});
}
$(document).ready(function(){
	initPageScreen({pagesize:15});
});


function initPage() {
	$.ajax({
		url : "../../../PageController/getPageModel.action",
		type : "post",
		success : initPageSuccess
	});
}

function initPageSuccess(data) {
	var pagination = $("#pagination");
	pagination.html("");
	var first = $("<li><a href='#'>&laquo;</a></li>");
	pagination.append(first);
	for (var i = 0; i < data.maxpage; i++) {
		var li = $("<li onclick='changeToPage(" + (i + 1) + ")'>");
		var a = $("<a>");
		a.text(i + 1);
		li.append(a);
		pagination.append(li);
	}
	var last = $("<li><a href='#'>&raquo;</a></li>");
	pagination.append(last);
	//共x页  共条数据
	var total_count = data.total_count;
	var maxpage = data.maxpage;
	var pagesize = data.pagesize;
	var nowpage = data.nowpage;
	var text = $("<label>").text("共"+total_count+"条记录,共"+maxpage+"页,每页"+pagesize+"条记录,当前第"+nowpage+"页");
	pagination.append(text);
	
	
	
}
var pageTableParam = {};
function changeToPage(nowpage) {
	var obj = new Object();
	obj.nowpage = nowpage;
	pageTableParam.url = "../../../PageController/getNowPageData.action";
	pageTableParam.data =obj;
	showTable(pageTableParam);
}
function changeToPageSuccess(data) {
	alert(data.length);
}
