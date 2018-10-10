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
</head>
<body>
	<div id="nav" class="btn-group">
		<span class="label label-default">员工界面>>查询进出记录</span>
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
		<p style="font-size: 17px; text-align: center; font-weight: bold;">进出记录</p>
		<p style="text-align: right;">
			<font style="font-size: 15px; text-align: center; font-weight: bold;">按时间查询：</font>
			<select>
				<option>今天</option>
				<option>最近三天</option>
				<option>最近一周</option>
			</select> <input type="submit" value="查询" />
		</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th align="center">车牌号</th>
					<th align="center">进入时间</th>
					<th align="center">离开时间</th>
					<th align="center">停车时间</th>
					<th align="center">费用</th>
					<th align="center">是否持卡</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>吉H7789</td>
					<td>2018-8-9 12：00</td>
					<td>2018-8-9 19：00</td>
					<td>3</td>
					<td>10元</td>
					<td>否</td>
				</tr>
				<tr>
					<td>吉H7789</td>
					<td>2018-8-9 12：00</td>
					<td>2018-8-9 19：00</td>
					<td>3</td>
					<td>10元</td>
					<td>否</td>
				</tr>
				<tr>
					<td>吉H7789</td>
					<td>2018-8-9 12：00</td>
					<td>2018-8-9 19：00</td>
					<td>3</td>
					<td>10元</td>
					<td>否</td>
				</tr>
				<tr>
					<td>吉H7789</td>
					<td>2018-8-9 12：00</td>
					<td>2018-8-9 19：00</td>
					<td>3</td>
					<td>10元</td>
					<td>否</td>
				</tr>
				<tr>
					<td>吉H7789</td>
					<td>2018-8-9 12：00</td>
					<td>2018-8-9 19：00</td>
					<td>3</td>
					<td>10元</td>
					<td>否</td>
				</tr>
				<tr>
					<td>吉H7789</td>
					<td>2018-8-9 12：00</td>
					<td>2018-8-9 19：00</td>
					<td>3</td>
					<td>10元</td>
					<td>否</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div id="page"></div>

	<div id="new_div"></div>
	<div id="backdiv"></div>
</body>
</html>