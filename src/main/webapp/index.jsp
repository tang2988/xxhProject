<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>


	<div>
		<table>
			<tr>
				<td>概览</td>
				<td>数据</td>
				<td>评级</td>
				<td>工商/备案</td>
				<td>点评</td>
				<td>咨询</td>
				<td>社区</td>
				<td>问答</td>
				<td>信披专区</td>
				<td>视频</td>
			</tr>

		</table>

	</div>
</body>
</html>
