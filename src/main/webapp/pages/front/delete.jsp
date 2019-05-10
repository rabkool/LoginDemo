<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>删除</title>
	<style>

	</style>
</head>
<body>

	<center>
		<form action="<%=basePath %>/deleteUser" method="post">
			<table border="1px" width="290px">
				<tr>   
					<td>id号：</td>
					<td><input type="text" name="id" style="width:220px; height:28px" placeholder=""></td>
				</tr>
					<td><input type="submit" vlaue="注册"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>