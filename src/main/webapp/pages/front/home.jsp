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
		  <h1>Hello World</h1>
	
		   <input type="button" onclick='location.href=("http://localhost:8080/pages/front/login.jsp")' value="登入">
		   <input type="button" onclick='location.href=("http://localhost:8080//register")' value="注册">
	</center> 

</body>
</html>