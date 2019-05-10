<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>QQ注册</title>
	<style>
		tr>td:first-child {
			width:50px;
		}
	</style>
</head>
<body>

	<center>
		<form action="<%=basePath %>/registerQQ" method="post">
			<table border="1px" width="600px">
				<tr>
					<td>名字：</td>
					<td><input type="text" name="nick"  placeholder="请输入4-10位字符"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="pwd" placeholder="输入6-16位数字、字母与下划线组合"></td>
				</tr>
				<tr>	
					<td>电话：</td>
					<td><input type="text" name="phone"  placeholder="请输入正确的手机格式"></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><input type="email" name="email"  placeholder="输入正确的邮箱格式"></td>
				</tr>
				<tr>
					<td>年龄：</td>
					<td><input type="text" name="age"  placeholder="年龄范围为1~150岁之间"></td>
				</tr>
				<tr>
					<td><input type="submit" vlaue="注册"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>