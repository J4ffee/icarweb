<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 车辆进入，开始结算 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>车辆进入</title>
<link href="../../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../../../css/base.css" rel="stylesheet">
<link href="../../../css/admin.css" rel="stylesheet">
<script src="../../../js/jquery.js"></script>
<script src="../../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../../js/base_table.js"></script>
<script type="text/javascript" src="../../../html/admin/page/page.js"></script>
<script type="text/javascript" src="../../../html/main/EmployeeInterface/checkoutAndCarsComeIn.js"></script>
</head>
<body>
	<div id="nav" class="btn-group">
		<span class="label label-default">员工界面>>车辆进入</span>
	</div>

	<div id="content">
		<br>
		<font>请输入车牌号码</font><input type="text" id="carid">
		<button id="TjCarsNum">提交</button>
		<table id="datatable" border="1" class="table table-striped"
			style="width: 100%">

		</table>
	</div>

	<div id="new_div"></div>
	<div id="backdiv"></div>
</body>
</html>