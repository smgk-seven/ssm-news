<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("LoginUserId",request.getSession().getAttribute("loginUser"));
pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE html5">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<style type="text/css">
		*{
			padding:0;
			margin:0;
		} 
		#head{
  			width:100%;
  			height:45px;
			background: black;  			
  		}
  		#headContent{
  			width:1200px;
  			height:48px;
			border: 0.3px solid white;
			margin:0px auto;  			
  		}
  		#newsWeather{
  			width:200px;
  			height:48px;
			border: 0.3px solid white;
			float:left; 			
  		}
  		#newsHeadMenu{
  			width:200px;
  			height:48px;
			border: 0.3px solid white;
			float:right; 			
  		}
  		#newsHeadMenu span,#newsWeather span{
  			font-size: 17px;
  			color: white;
  			text-align: center;
  			line-height: 50px;
  			cursor: pointer;
  		}
		#big{
			width:1208px;
			
			border:1px solid red;
			margin: 10px auto;
		}
		#left{
			width:200px;
			height:400px;
			border:0.3px solid black;
			
			float :left;
		}
		#right{
			width:1000px;
			height:auto;
			border:0.3px solid black;
			float:right;
		}
		#newsTitleDiv{
			width:1000px;
			height:50px;
			border:0.3px solid black;
			margin: 15px auto;
		}
		#newsTitleDiv h4{
			padding-left:15px;
			font-size: 23px;
			
		}
		#newsContentDiv{
			width:1000px;
			border:0.3px solid black;
			margin: 30px auto;
			padding-left:15px;
		}
		
		#newsDataDiv{
			width:1000px;
			height:37px;
			border:0.3px solid black;
			margin: 20px auto;
			padding-left: 5px;
		}
		#newsDataLeft{
			float:left;
		}
		#newsDataLeft ul li{
			float:left;
			width:100px;
			height:30px;
			border:0.3px solid black;
			margin: 0px auto;
			list-style: none;
			color: rgba(70,70,70,0.8);
		}
		#newsDianZhang{
			float:right;
			width:100px;
			height:37px;
			border:0.3px solid black;
		}
		#newsDianZhang i{
			cursor: pointer;
			transition:all 1s;
		}
		.fa-thumbs-o-up:hover{
			font-size: 29px;
		}
		#newsCommentDiv{
			width:1000px;
			height:auto;
			border:0.3px solid black;
		}
		#newsInputDiv{
			width:1000px;
			height:60;
			border:0.3px solid red;
		}
		.newsCommentInput{
			width:800px;
			height: 50px;
			border:0.5px solid black;
			font-size: 19px;
		}
		.newsCommentPL{
			background: black;
			color: white;
			border:1px solid black;
			border-radius: 10px;
			cursor: pointer;
			font-size: 17px;
		}
		#left ul li{
			width:120px;
			height: 50px;
			border:1px solid red;
			list-style: none;
			margin:2px auto;
			
		}
		#left ul li i{
			cursor: pointer;
		}
		#left ul li span{
			font-size:20px;
			font-style:italic;
			color: black;
			
		}
		#newsAllCommentDiv{
			width:1000px;
			height: auto;
			/* border:1px solid blue; */
			margin:10px auto;
		}
		#newsAllCommentDiv ul li{
			width:990px;
			height: auto;
			border-top:1px solid rgba(45,45,45,0.2);
			list-style: none;
			margin:2px auto;
		}
		.CommentUserInfo{
			width:990px;
			height: 35px;
			
			
		}
		.CommentUserInfo span{
			line-height: 30px;
		}
		.CommentTop{
			width:30px;
			height: 30px;
			cursor: pointer;
			border-radius:50px;
			background:url(${APP_PATH}/static/images/userTop/userTop1.jpg);
			background-size: 100% 100%;
			float:left;
		}
		.CommentNickname{
			color: blue;
			margin-left: 10px;
			cursor: pointer;
		}
		.CommentContent{
			width:990px;
			height: auto;
			padding-left: 40px;
			font-size: 20px;
		}
		.CommentTime{
			margin-left: 10px;
		}
		#newsAuthorSpan{
			margin-left: 20px;
		}
		
	</style>

	</head>
		
	<body>
		<div id="head">
			<div id="headContent">
				<div id="newsWeather">
					<span>广东-佛山：<span><em>10</em>°&nbsp;/&nbsp;<em>10</em>°
    				</span></span>
    				
    			</div>
				<div id="newsHeadMenu">
					<span>投诉侵权</span>
					&nbsp;&nbsp;&nbsp;;&nbsp;
					<span>联系客服</span>
				</div>
			</div>
		</div>
		<div id="big">
			<div id="left">
				<ul>
					<li>
						<i class="fa fa-star-o CollectI" style="font-size:40px;"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span id="newsSCSpan">99+</span>
					</li>
					<li>
						<i class="fa fa-thumbs-o-up GivegoodI" style="font-size: 40px;"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span id="newsDZSpan">99+</span>
					</li>
					<li>
						<i class="fa fa-commenting-o" style="font-size:40px;color:rgba(249,204,154,0.9);"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span id="newsPLSpan">99+</span>
					</li>
					<li>
						<i class="fa fa-eye" style="font-size:40px;color:green;"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span id="newsCKSpan">91</span>
					</li>
					
				</ul>
			</div>
			<div id="right">
				<div id="newsTitleDiv">
					<h4 id="newsTitleH4"></h4>
					<span id="newsAuthorSpan">ladmin</span>&nbsp;&nbsp;
					<span id="newsTitleSpan">1998-7-14</span>
				</div>
				<div id="newsContentDiv">
				</div>
				<!-- <div id="newsDataDiv">
					<div id="newsDataLeft">
						<ul>
							<li style="width:130px;">作者：<span id="newsAuthor"></span></li>
							<li style="width:185px">发表于：<span id="newsTime" ></span></li>
							<li>评论:<span id="newsCommentCount"></span></li>
							<li>点赞：<span id="newsGetGoodCount"></span></li>
							<li>收藏：<span id="newsGetCollectCount"></span></li>
							<li>浏览：<span id="newsGetShowCount"></span></li>
						</ul>
					</div>
					<div id="newsDianZhang">
					<span><i class="fa fa-thumbs-o-up" style="font-size: 27px"></i></span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<span><i class="fa fa-heart-o" style="font-size:24px"></i></span>
					</div>
				</div> -->
				<div id="newsCommentDiv">
					<div id="newsInputDiv" >
						<form action="#" method="post">
							<div class="input-group">
								<input type="text" name="" class="form-control newsCommentInput" placeholder="请输入名称">
	          					<span class="input-group-addon newsCommentPL">评论一下</span>
          					</div>
						</form>
					</div>
				</div>
				<div id="newsAllCommentDiv">
					<ul id="newsAllCommentUl">
					</ul>
				</div>
			</div>
		</div>
		<input type="hidden" id="newsIdValue" value="<%=request.getParameter("newsId") %>">
		<input type="hidden" id="userIdInput" value="${LoginUserId.userId}">
	</body>
	<script type="text/javascript">
		var userId=$("#userIdInput").val()
		var newsId=$("#newsIdValue").val();
		
		$(function(){
			getNews();
			getComments();
			getNewsData();
			getNewsSFGivegood();
			getNewsSFCollect();
		})
		
		function getNews(){
			$.ajax({
		    	url:"${APP_PATH }/showNewsContent",
		    	data:"newsId="+newsId,
		    	type:"POST",
		    	success:function(result){
		    		addCetentTo(result);
		    	}
		    })
		}
		function addCetentTo(result){
			//$("#newsContentDiv").empty();
			$("#newsTitleH4").empty();
			//$("#newsContentDiv").empty();
			$("#newsTitleH4").append(result.extend.news.newsTitle)
			newsId=result.extend.news.newsId;
			document.getElementById("newsContentDiv").innerHTML=result.extend.news.newsContent;
			document.getElementById("newsAuthorSpan").innerHTML=result.extend.news.user.nickName;
			document.getElementById("newsTitleSpan").innerHTML=result.extend.news.returnDate;
		}
		//判断是否点赞
		function getNewsSFGivegood(){
			$.ajax({
		    	url:"${APP_PATH }/newsSFGivegood",
		    	data:"newsId="+newsId+"&userId="+userId,
		    	type:"POST",
		    	success:function(result){
		    		actionDZIco(result.extend.message);
		    		
		    	}
		    })
		}
		//判断是否收藏 
		function getNewsSFCollect(){
			$.ajax({
		    	url:"${APP_PATH }/newsSFCollect",
		    	data:"newsId="+newsId+"&userId="+userId,
		    	type:"POST",
		    	success:function(result){
		    		actionSCIco(result.extend.message);
		    		
		    	}
		    })
		}
		//处理点赞图标
		function actionDZIco(str){
			if(str=="0"){
    			$(".GivegoodI").css("color","rgba(140,140,140,0.9)");
    		}else if(str=="1"){
    			$(".GivegoodI").css("color","red")
    		}
		}
		//处理收藏 图标
		function actionSCIco(str){
			if(str=="0"){
    			$(".CollectI").css("color","rgba(140,140,140,0.9)");
    		}else if(str=="1"){
    			$(".CollectI").css("color","red")
    		}
		}
		
		//获取评论
		function getComments(){
			$.ajax({
		    	url:"${APP_PATH }/getNewsComment",
		    	type:"POST",
		    	data:"newsId="+newsId,
		    	success:function(result){
		    		addCommentsTo(result);
		    	}
		    })
		}
		
		//把评论添加到div
		function addCommentsTo(result){
			$("#newsAllCommentUl").empty();
			$.each(result.extend.allNewsComments,function(index,item){
				var userTop=$("<div class='CommentTop'></div>");
				var userNickname=$("<span class='CommentNickname'>"+item.user.nickName+"</span>")
				var CommentsTime=$("<span class='CommentTime'>"+item.commentTimeStr+"</span>");
				var commentContent=$("<div class='CommentContent'>"+item.commentsContent+"</div>");
				var userInfoDiv=$("<div class='CommentUserInfo'></div>").append(userTop).append(userNickname).append(CommentsTime)
				$("<li></li>").append(userInfoDiv).append(commentContent).appendTo("#newsAllCommentUl")
			})
		}
		//处理评论
		$(".newsCommentPL").click(function(){
			var CommentContent=$(".newsCommentInput").val()
			if(userId==null||userId==""){
				alert("请登录后再评论")
				window.location='${APP_PATH}/login.jsp';
			}else{
				if(CommentContent==""||CommentContent==null){
					alert("评论内容不能为空")
				}else{
					$.ajax({
				    	url:"${APP_PATH }/addComment",
				    	data:"newsId="+newsId+"&userId="+userId+"&CommentContent="+CommentContent,
				    	type:"POST",
				    	success:function(result){
				    		alert(result.msg)
				    		$(".newsCommentInput").val("")
				    		getComments();
				    		getNewsData();
				    	}
				    })
				}
			}
		})
		
		//获取取点赞/收藏 /评论数
		function getNewsData(){
			$.ajax({
		    	url:"${APP_PATH }/getNewsData",
		    	data:"newsId="+newsId,
		    	type:"POST",
		    	success:function(result){
		    		document.getElementById("newsSCSpan").innerHTML=result.extend.newsData.newsCollectNum;
		    		document.getElementById("newsDZSpan").innerHTML=result.extend.newsData.newsGivegood;
		    		document.getElementById("newsPLSpan").innerHTML=result.extend.newsData.newsCommentsNum;
		    		
		    	}
		    })
		}
		
		//点赞功能
		$(".GivegoodI").click(function(){
			if(userId==null||userId==""){
				alert("请注册/登录后再点赞");
				window.location='${APP_PATH}/login.jsp';
			}else{
				$.ajax({
			    	url:"${APP_PATH }/addGivegood",
			    	data:"newsId="+newsId+"&userId="+userId,
			    	type:"POST",
			    	success:function(result){
			    		actionDZIco(result.extend.message);
			    		getNewsData();
			    		
			    	}
			    })
			}
		})
		//收藏功能
		$(".CollectI").click(function(){
			if(userId==null||userId==""){
				alert("请注册/登录后再收藏 ");
				window.location='${APP_PATH}/login.jsp';
			}else{
				$.ajax({
			    	url:"${APP_PATH }/addCollect",
			    	data:"newsId="+newsId+"&userId="+userId,
			    	type:"POST",
			    	success:function(result){
			    		actionSCIco(result.extend.message);
			    		getNewsData();
			    		
			    	}
			    })
			}
		})
		
	</script>
</html>
