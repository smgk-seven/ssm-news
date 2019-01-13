<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("APP_PATH", request.getContextPath());
pageContext.setAttribute("LoginUserId",request.getSession().getAttribute("loginUser"));
%>

<!DOCTYPE html5">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>ssm-news[编辑文章]</title>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript"src="${APP_PATH }/ueditor/ueditor.config.js"></script> 
	<script type="text/javascript"src="${APP_PATH }/ueditor/ueditor.all.min.js"></script> 
    <script type="text/javascript" charset="utf-8" src="${APP_PATH }/ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	
    <style type="text/css">
    	*{
	       	margin:0;
	       	padding: 0;
       }
    	#big{
	       	width: 1002px;
	       	margin:0px auto;
	       	border:1px solid  red;
       }
       #bottom{
       		width:1002px;
       		height:600px;
       		margin:30px auto;
       		border:1px solid rgba(0,0,0,0.2);
       }
       #newsTitle{
       		height:80px;
       		margin-top: 10px;
       		font-size: 20px;
       }
       ::-webkit-input-placeholder { 
		  color: #999;
		  font-size: 22px;
		}
		#zy{
			width:1002px;
			height:100px;
			/* border:1px solid red; */
			contenteditable:true;
		}
		#selectImageDiv{
			width:200px;
			height: 100px;
			border:1px dashed rgba(0,0,0,0.2);
			float:left;
			contenteditable:false;
			cursor:pointer;
			margin-left:5px;
			
		}
		#selectImageDiv:hover{
			background: rgb(246,248,249);
		}
		#contentZy{
			width:670px;
			height: 100px;
			border:1px solid rgba(0,0,0,0.2);
			float:right;
			margin-right:10px;
			contenteditable:true;
			
		}
		#contentZy_input{
			height:100px;
			font-size: 21px;
		}
		#selectImgBig{
			width:600px;
			height:400px;
			border:1px solid rgba(0,0,0,0.2);
			overflow:auto
			
		}
		#selectImgBig ul li{
			width:180px;
			height:180px;
			border:1px solid rgba(0,0,0,0.2);
			float:left;
			list-style: none;
			margin-left:9px;
			overflow: hidden;
		}
		.newsShowImg{
			width:180px; 
			height:180px;
			transition: all 1s;
			cursor:pointer;
		}
		.newsShowImg:hover{
			width:200px;
			height:200px;
		}
		#selectNewsGenre{
			width:990px;
			height:40px;
			border:1px solid red; 
			margin:15px auto;
			font-size: 18px;
			padding-left: 10px;
		}
		#newsGenreSel{
			width:100px;
			height:30px;
			border:1px solid red; 
			background: rgb(245,245,245)
		}
		#selectNewsGenre button{
			background: rgb(132,180,220);
			color: white;
			font-size: 16px;
			
		}
		
    </style>
  </head>
  
  <body>
  <form action="addNews" method="post" id="newsForm">
    <div id="big">
    	<div>
		    <h1 style="text-align: center;">ssm-news文章编辑页面</h1>
			<input id="newsTitle" name="newsTitle" type="text" maxlength="30" class="form-control"  autocomplete="off" placeholder="在这里输入标题"><br/>
		   <!--  type="text/plain" -->
		    <textarea id="editor" name="newsContent" style="width:1000px;height:800px;">
				<p style="font-size:20px; color:rgb(159,161,159);">点击here 即可开始编写你的文章  最多可输入200字/10张图片</p>
			</textarea>
		</div>
		<div id="btns">
		    <div>
		        <button onclick="getContent()">获得内容</button>
		        <button onclick="hasContent()">判断是否有内容</button>
		        <!-- <button id="setHeight" onclick="UE.getEditor('editor').setHeight(300)">限定文本框高度</button> -->
		    </div>
		</div>
		  <div id="content">
		  </div>
    </div>
    
    <div id="bottom">
	  	<h4 style="line-height: 30px;">&nbsp;&nbsp;封面图片和文章摘要</h4>
	  	<div id="zy">
	  		<div id="selectImageDiv">
	  			<img id="selectImageDivImg" alt="" src="${APP_PATH }/static/images/extendImage.jpg">
	  		</div>
	  		<div id="contentZy">
	  			<textarea id="contentZy_input" name="newsSummary" class="form-control" maxlength="50" placeholder="文章摘要，最多可输入100字"></textarea>
	  		</div>
	  		<input type="hidden" name="newsUser" value="${LoginUserId.userId}">
	  	</div>
	  	<div id="selectNewsGenre">
			<div id="selectNewsGenreLeft" style="float:left">
				请选择文章类型：
		  		<select id="newsGenreSel" name="newsGenre">
				</select>
			</div>
			<input type="hidden" name="newsTopImg" id="newsTopImg">
			<div id="selectNewsGenreRight" style="float:right;">
				<button id="yLNewsBt" class="btn" type="button">预览一下正</button>
				&nbsp;&nbsp;&nbsp;
				<button id="addNewsBt" class="btn" type="submit">发布咯</button>&nbsp;
			</div>
	  	</div>
	  	<div id="YLContent" style="width:1000px;"></div>
	</div>
	
	</form>
	<!-- 选择文章头图片的模态框 -->
	<div class="modal fade" id="selectNewsImgModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">请点击你要设置的封面的图片</h4>
	            </div>
	            
	            <div id="selectImgBig">
	            	<ul id="selectImgBigUL">
	            	</ul>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">确定</button>
	                
	            </div>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>
	<div id="contentWEN"></div>
</body>
  <script type="text/javascript">
	var newesContent="";
	var newsTitle="";
	var newsSummary="";
	var newsTopImg="";
	var newsAuthor=${LoginUserId.userId};
	var newsGenre;
	var newsArr;
	
    var ue = UE.getEditor('editor',{autoClearinitialContent:true});
	var content=document.getElementById("content");
	var selectImageDivImg=document.getElementById('selectImageDivImg');
	
	$(function(){
		getNewsGenre();
		//console.log(${LoginUserId.userId})
	})
	
	//获取文本框的内容
	function getContent() {
        var arr = [];
        arr.push("");
        arr.push(UE.getEditor('editor').getContent());
        newesContent=arr.join("\n")
        getImgSrc(arr.join("\n"));
    }
    //判断 文本框是否为空
    function hasContent() {
        var arr = [];
        arr.push("");
        arr.push(UE.getEditor('editor').hasContents());
        alert(arr.join("\n"));
    }
	//从内容中获取图片的src
	function getImgSrc(str){
		$("#selectImgBigUL").empty();
		var li;
		var img;
		var p=/<img[^<>]+>/g;
		var src=""
		var m=str.match(p);
		for (var i=0; i<m.length; i++ )
		{
		/*  img+=m[i]; */
			src=m[i].substr(10, 84);
			src=src.replace('"', '');
			li=$("<li class='imgli img"+i+"'><img src='"+src+"' class='newsShowImg' /></li>");
			li.appendTo("#selectImgBigUL");
		}
	}
	//处理选择封面图片
	//弹出模态框
	//$("#selectImageDiv").click(function(){
	//处理设置文章图标	
	$(document).on("click","#selectImageDiv",function(){
		getContent();
		$("#selectNewsImgModal").modal(function(){
			backdrop:'static';
		});
		newsArr=$("#selectImgBig ul li img")
		console.log(newsArr.length)
	})
	
	//设置文章封面图片
	$(document).on("click","#selectImgBig ul li img",function(){
		/* console.log(this.src); */
		selectImageDivImg.src=this.src;
		newsTopImg=selectImageDivImg.src;
		$("#newsTopImg").val(selectImageDivImg.src)
		selectImageDivImg.width=200;
		selectImageDivImg.height=100;
		
	})
	//获取新闻类别 
	function getNewsGenre(){
		$("#newsGenreSel").empty();
		$.ajax({
			url:"${APP_PATH }/getNewsGenre",
			type:"POST",
			success:function(result){
				$.each(result.extend.genres,function(index,item){
					$("#newsGenreSel").append($("<option value='"+item.genreId+"'>"+item.genreName+"</option>"))
				})
			} 
	 	})
	}
	
	//处理要发布的文章
	/* $("#addNewsBt").click(function(){
	    newsTitle=$("#newsTitle").val()
	    newsSummary=$("#contentZy_input").val()
	    newsGenre=$("#newsGenreSel").val();
	    console.log(newesContent)
	    console.log(newsTitle)
	    console.log(newsSummary)
	    console.log(newsTopImg)
	    console.log(newsAuthor)
	    console.log(newsGenre)
	    $.ajax({
	    	url:"${APP_PATH }/addNews",
	    	data:"newesContent="+newesContent+"&newsTitle="+newsTitle+"&newsSummary="+newsSummary+"&newsTopImg="+newsTopImg+"&newsAuthor="+newsAuthor+"&newsGenre="+newsGenre,
	    	type:"POST",
	    	success:function(result){
	    		alert(result.msg)
	    		window.location.reload();
	    	}
	    })
	}) */
	
	$("#addNewsBt").click(function(){
		var arr = [];
        arr.push("");
        arr.push(UE.getEditor('editor').getContent());
        document.getElementById("contentWEN").innerHTML=arr.join("")
        getImgSrc(arr.join("\n"));
		console.log($("form").serialize())
		$("#newsForm").submit(); 
		return false
	}) 
   
</script>
</html>
