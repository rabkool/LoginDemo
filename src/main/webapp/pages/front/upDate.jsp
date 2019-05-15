<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>遍历所有数据</title>
	
</head>
<body>
<center>
		<form action="<%=basePath %>/upId" method="post">
			<table border="1px" width="290px">
			<tr>   
					<td>id：</td>
					<td><input type="text" name="id" style="width:220px; height:28px" readonly="readonly" value="${errorMap.id==null?user.id:'' }" placeholder=${errorMap.id==null?"":errorMap.id }></td>
				</tr>
				<tr>   
					<td>名字：</td>
					<td><input type="text" name="nick" style="width:220px; height:28px" value="${errorMap.nick==null?user.nick:'' }" placeholder=${errorMap.nick==null?"":errorMap.nick }></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="text" name="pwd" style="width:220px; height:28px" value="${errorMap.pwd==null?user.pwd:'' }" placeholder=${errorMap.pwd==null?"":errorMap.pwd }></td>
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
					<td><input type="submit" value="修改"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>
	

	    
</body>
</html>