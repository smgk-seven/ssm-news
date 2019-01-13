<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testUeditor.jsp' starting page</title>
    
	<script type="text/javascript"src="${APP_PATH }/ueditor/ueditor.config.js"></script> 
	<script type="text/javascript"src="${APP_PATH }/ueditor/ueditor.all.js"></script> 

  </head>
  
  <body>
<h1>UEditor简单功能</h1>
<div id></div>
<!--style给定宽度可以影响编辑器的最终宽度-->
<script type="text/plain" id="myEditor">
<p>点击here 即可开始编写你的文章</p>
</script>
<script type="text/javascript">
// UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;

UE.getEditor('myEditor',{
//这里可以选择自己需要的工具按钮名称,此处仅选择如下五个
//toolbars:[['FullScreen','simpleupload','Source', 'Undo', 'Redo','Bold','test']],
//focus时自动清空初始化时的内容
autoClearinitialContent:true,
//关闭字数统计
wordCount:false,
//关闭elementPath
elementPathEnabled:false,
//默认的编辑区域高度
initialFrameHeight:300
//更多其他参数，请参考ueditor.config.js中的配置项
});



</script>

</body>
</html>
