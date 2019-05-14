<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录</title>
	<style>
	
	</style>
</head>
<body>

	<center>
		<form action="<%=basePath %>/login" method="post">
			<table border="1px" width="290px">
			<tr>   
					<td>id：</td>
					<td><input type="text" name="id" style="width:220px; height:28px" value="${errorMap.id==null?user.id:'' }" placeholder=${errorMap.nick==null?"":errorMap.id }></td>
				</tr>

				<tr>
					<td>密码：</td>
					<td><input type="password" name="pwd" style="width:220px; height:28px" value="${errorMap.pwd==null?user.pwd:'' }" placeholder=${errorMap.pwd==null?"":errorMap.pwd }></td>
				</tr>

				<tr>
					<td><input type="submit" value="登录"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>
		<center>
			  <li class="dao"><a href="http://localhost:8080/pages/admin/listUser.jsp"><h1>返回主页</h1></a></li>
	</center>


</body>
</html>