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
	<link rel="stylesheet" type="text/css" href="<%=basePath %>resources/js/dataTable/jquery.dataTables.min.css">
	<script type="text/javascript" src="<%=basePath %>resources/js/dataTable/jquery.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/js/dataTable/jquery.dataTables.min.js"></script>
</head>
<body>
	<table border="1px" width="100%" class="tablelist" id="example">
		<thead>
			<tr>
			
				<th>pwd</th>

				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.userpswlist }" var="entry">
				<tr>
				
					<td>${pageScope.entry.user_pwd }</td>
				
					<td>
						 <a href="<%=basePath %>/deleteUser?id=${pageScope.entry.user_id}">
						 	<input type="submit" value="删除" >
						 </a>
	        			
	        			 <a href="<%=basePath %>/upId?id=${pageScope.entry.user_id}">
	        				 <input type="submit" value="修改" >
	        			 </a>
					</td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
	<center>
		<form action="<%=basePath %>/deleteUser" method="post">
			<table border="1px" >
				<tr>   
					<td style="width:84px">id号：</td>
					<td><input type="text" name="id" style="width:220px; height:28px" placeholder="">
				
					<td><input type="submit" value="删除" 		></td>
				
				</tr>
			</table>
		</form>
	</center>
	<center>
			  <li class="dao"><a href="http://localhost:8080//register"><h1>返回注册</h1></a></li>
	</center>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#example").dataTable({
				 "bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示
				 "aLengthMenu" : [5, 10, 15, 20, 30, 50, 100], //更改显示记录数选项
				 "sPaginationType" : "full_numbers", //详细分页组，可以支持直接跳转到某页
				 "bAutoWidth" : true, //是否自适应宽度
				 //"bJQueryUI" : true,
				 "oLanguage": { //国际化配置  
		                "sProcessing" : "正在获取数据，请稍后...",    
		                "sLengthMenu" : "显示 _MENU_ 条",    
		                "sZeroRecords" : "没有您要搜索的内容",    
		                "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",    
		                "sInfoEmpty" : "记录数为0",    
		                "sInfoFiltered" : "(全部记录数 _MAX_ 条)",    
		                "sInfoPostFix" : "",    
		                "sSearch" : "搜索",    
		                "sUrl" : "",    
		                "oPaginate": {    
		                    "sFirst" : "第一页",    
		                    "sPrevious" : "上一页",    
		                    "sNext" : "下一页",    
		                    "sLast" : "最后一页"    
		                }  
		            },  
		    });
		});
	</script>
</body>
</html>