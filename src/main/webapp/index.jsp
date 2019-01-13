<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE html5>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ssm-newsHOME</title>
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    
   <form action="testimageupload" id="fileForm" name="fileForm" method="post" enctype="multipart/form-data">
			<input type="file" id="file"    name = "pictureFile" /><br>
			<input type = "submit" id="submit" value = "提交">
	</form>
    
  </body>
  <script type="text/javascript">
  	var fileBt=document.getElementById('file');
  	var submitBt=document.getElementById('submit');
  	var fileFormBt=document.getElementById('fileForm');
  	submitBt.onclick=function(){
  		if(fileBt.value==''){
  			alert("请选择文件夹")
  		}else{
  			fileForm.submit();
  		}
  		return false;
  	}
  	
  </script>
</html>
