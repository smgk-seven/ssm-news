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
			margin: 0px auto;
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
			color: rgba(248,87,92,0.9);
			
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
					<li class="">
						<i class="fa fa-star-o" style="font-size:40px;color:red"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span>99+</span>
					</li>
					<li class="">
						<i class="fa fa-thumbs-o-up" style="font-size: 40px;color:red"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span>99+</span>
					</li>
					<li class="">
						<i class="fa fa-commenting-o" style="font-size:40px;color:red"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span>99+</span>
					</li>
					<li class="">
						<i class="fa fa-reply" style="font-size:40px;color:red"></i>&nbsp;&nbsp;&nbsp;&nbsp;
						<span>转发</span>
					</li>
					
				</ul>
			</div>
			<div id="right">
				<div id="newsTitleDiv">
					<h4 id="newsTitleH4"></h4>
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
								<input type="text" class="form-control newsCommentInput" placeholder="请输入名称">
	          					<span class="input-group-addon newsCommentPL">评论一下</span>
          					</div>
						</form>
					</div>
				</div>
				
			
			</div>
		</div>
		<input type="hidden" id="newsIdValue" value="<%=request.getParameter("newsId") %>">
	</body>
	<script type="text/javascript">
		$(function(){
			getNews();
		})
		var newsId=$("#newsIdValue").val();
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
			document.getElementById("newsContentDiv").innerHTML=result.extend.news.newsContent;
			document.getElementById("newsAuthor").innerHTML=result.extend.news.user.nickName;
			document.getElementById("newsTime").innerHTML=result.extend.news.returnDate;
			document.getElementById("newsTime").innerHTML=result.extend.news.returnDate;
		}
	</script>
</html>
