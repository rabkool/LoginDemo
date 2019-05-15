<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>注册</title>
	<style>
		tr>td:first-child {
			width:50px;
			height:28px;
		}
	</style>
</head>
<body>

	<center>
		<form action="<%=basePath %>/register" method="post">
			<table border="1px" width="290px">
				<tr>   
					<td>名字：</td>
					<td><input type="text" name="nick" style="width:220px; height:28px" value="${errorMap.nick==null?user.nick:'' }" placeholder=${errorMap.nick==null?"":errorMap.nick }></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="pwd" style="width:220px; height:28px" value="${errorMap.pwd==null?user.pwd:'' }" placeholder=${errorMap.pwd==null?"":errorMap.pwd }></td>
				</tr>
				<tr>	
					<td>电话：</td>
					<td><input type="text" name="phone" style="width:220px; height:28px" value="${errorMap.phone==null?user.phone:'' }" placeholder=${errorMap.phone==null?"":errorMap.phone }></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><input type="email" name="email" style="width:220px; height:28px" value="${errorMap.email==null?user.email:'' }" placeholder=${errorMap.email==null?"":errorMap.email }></td>
				</tr>
				<tr>
					<td>年龄：</td>
					<td><input type="text" name="age"style="width:220px; height:28px" value="${errorMap.age==null?user.age:'' }"  placeholder=${errorMap.age==null?"":errorMap.age }></td>
				</tr>
				<tr>
					<td><input type="submit" value="注册"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>  
		<center>
			  <li class="dao"><a href="http://localhost:8080/home"><h1>返回主页</h1></a></li>
	</center>

</body>
</html>