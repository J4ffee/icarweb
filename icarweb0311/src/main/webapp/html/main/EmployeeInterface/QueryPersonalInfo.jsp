<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 查询个人信息 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询个人信息</title>
<link href="../../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../../../css/base.css" rel="stylesheet">
<script src="../../../js/jquery.js"></script>
<script src="../../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../../js/base_table.js"></script>
<script type="text/javascript" src="../../../html/admin/page/page.js"></script>
</head>
<body>

	<div id="nav" class="btn-group">
		<span class="label label-default">员工界面>>>查询个人信息</span>
	</div>
	<div id="fun" class="btn-group" data-toggle="buttons-checkbox">
		<button class="btn btn-primary" id="delete_systemuser">删除</button>
		<button class="btn btn-primary" id="new_usernamager">新增</button>
		<button class="btn btn-primary" id="query_systemuser"
			style="float: left">查询</button>
		<input id="querydata" type="text" size="2" class="form-control"
			style="width: 30%" value="请输入查询关键字......">
	</div>
	<div id="content">
		<h2>个人信息</h2>
			<p>工    号：<input type="text" style="margin-left: 20px;"></p>
			<p>手机号：<input type="text" style="margin-left: 10px;"></p>
			<p>真实姓名：<input type="text" ></p>
			<p>身份证号：<input type="text" ></p>
	</div>
	<div id="page"></div>

	<div id="new_div"></div>
	<div id="backdiv"></div>

</body>
</html>