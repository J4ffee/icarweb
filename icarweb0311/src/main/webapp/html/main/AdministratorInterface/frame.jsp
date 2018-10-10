<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="../../../css/employeeManage.css" rel="stylesheet">
<link href="../../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../../../css/base.css" rel="stylesheet">
<script src="../../../js/jquery.js"></script>
<script src="../../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../../js/base_table.js"></script>
<script type="text/javascript" src="./usermanager.js"></script>
<script type="text/javascript" src="../../../html/admin/page/page.js"></script>
</head>
<body>
<div id="nav" class="btn-group">
		<span class="label label-default">系统管理>>>员工管理</span>
	</div>
<div id="fun" class="btn-group" data-toggle="buttons-checkbox">
		<button class="btn btn-primary" id="delete_systemuser">删除</button>
		<button class="btn btn-primary" id="new_usernamager">新增</button>
		<button class="btn btn-primary" id="query_systemuser"
			style="float: left">查询</button>
		<input id="querydata" type="text" size="2" class="form-control"
			style="width: 30%" value="请输入查询关键字......">
	</div>
</body>
</html>