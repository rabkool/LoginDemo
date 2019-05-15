<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
	<style>
	
	</style>
</head>
<body>

	<center>
		
		<h1>密码错误</h1>
		
		<a href="http://localhost:8080/pages/front/login.jsp"><h1>重新登入</h1></a>
		
	</center> 

</body>
</html>