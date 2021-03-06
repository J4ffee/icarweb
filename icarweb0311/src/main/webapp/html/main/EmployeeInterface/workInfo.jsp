<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>工作日志</title>
<link href="../../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../../../css/base.css" rel="stylesheet">
<script src="../../../js/jquery.js"></script>
<script src="../../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../../js/base_table.js"></script>
<script type="text/javascript" src="../../../html/admin/page/page.js"></script>
</head>
<body>

	<div id="nav" class="btn-group">
		<span class="label label-default">系统管理>>>工作日志</span>
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
		<p>
			<font style="font-size: 15px; text-align: center; font-weight: bold;">按时间查询：</font>
			<select>
				<option>今天</option>
				<option>最近三天</option>
				<option>最近一周</option>
			</select>   <button type="button" class="btn btn-default">查询</button>
		</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>工号</th>
					<th>日期</th>
					<th>上班时间</th>
					<th>下班时间</th>
					<th>是否迟到</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>...</td>
					<td>....</td>
					<td>.....</td>
					<td>.....</td>
					<td>.....</td>
				</tr>
				<tr>
					<td>...</td>
					<td>....</td>
					<td>.....</td>
					<td>.....</td>
					<td>.....</td>
				</tr>
				<tr>
					<td>...</td>
					<td>....</td>
					<td>.....</td>
					<td>.....</td>
					<td>.....</td>
				</tr>
			</tbody>
		</table>
	</div>
 
	<div id="page"></div>

	<div id="new_div"></div>
	<div id="backdiv"></div>

</body>
</html>