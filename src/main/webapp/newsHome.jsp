<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("APP_PATH", request.getContextPath());
pageContext.setAttribute("LoginUser",request.getSession().getAttribute("loginUser"));
%>
<!DOCTYPE html5>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'newsHome.jsp' starting page</title>
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
	<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
	<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
  	<!-- <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script> -->
  	<script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
  	<script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
  	<style type="text/css">
  		*{
  			padding: 0px;
  			margin: 0px;
  		}
  		.carousel-inner img {
		      width: 100%;
		      height: 100%;
		  }
  		#big{
  			width:100%;
  			height:auto;
  			border:0.3px dotted black;
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
			/* background: white; */
			 font-size: 16px;		
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
  		#newsBody{
  			width:1200px;
  			height:auto;
			margin:10px auto;
  		}
  		#newsMenu{
  			width:167px;
  			height:auto;
			float:left;
			border:1px solid black;
			/* position: fixed; */
  		}
  		#newsMenu ul li{
  			width:120px;
  			height:40px;
			/* border:1px solid black; */
			list-style: none;
			text-align:center;
			line-height:40px;
			font-size: 17px;
			margin:0px auto;
			border-radius:5px;
			transform:all 0.5s;
			cursor: pointer;
  		}
  		.newsMenuLi{
  			background:white;
  			color:black;
  			transform:all 1.5s;
  		}
  		
  		.newsMenuLi:hover{
  			color: white;
  			background: red;
  		}
  		#bodyRight{
  			width:1010px;
  			height:auto;
			float:right;
			border:1px solid black;
  		}
  		#newsContent{
  			width:660px;
  			height:auto;
			float:left;
			/* border:1px solid red; */
			
  		}
  		#newsImgLB{
  			width:658px;
  			height:358px;
			border:1px solid red;
			overflow: hidden; 
  		}
  		#newsList{
  			margin-top:10px;
  			width:658px;
  			height:auto;
			border:1px solid red; 
  		}
  		#newsContent ul li{
  			list-style:none;
  			width:658px;
  			height:120px;
  			border-top:1px solid rgba(50,50,50,0.6);
  		}
  		.newsImg{
  			width:150px;
  			height:120px;
  			
  			float:left;
  		}
  		.newsTitle{
  			width:500px;
  			height:120px;
  			/* border:1px solid red; */
  			float:right;
  			padding:10px
  		}
  		.newsTitle span{
  			font-size: 21px;
  		}
  		#newsData{
  			width:340px;
  			height:auto;
			float:right;
			border:0.3px solid black;
			/* position: fixed;
			margin-left: 665px; */
  		}
		#newsSearchDiv{
			width:335px;
  			height:60px;
  			border:0.3px solid black;
		}
		.newsSearchInput{
			padding-left:5px;
			width:267px;
  			height:50px;
  			border:1px solid rgb(34,142,218);
  			background: rgba(241,243,244,0.7);
  			border-radius:4px;
  			font-size: 17px;
		}
		.newsSearchSO{
			border-radius:5px;
			width:65px;
  			height:50px;
  			cursor: pointer;
  			color:white;
  			font-size:22px;
  			line-height:35px;
  			border:0.3px solid rgb(34,142,218);
  			border-radius:5px;
			background: rgb(50,152,228);
  			
		}
		.newsSearchSO:hover{
  			background: rgb(34,142,218);
		}
		#newsLoginDiv{
			width:335px;
  			height:300px;
  			background: rgb(241,243,244);
  			margin:10px auto;
  			padding-top: 10px;
		}
		#newsLoginUser{
			width:315px;
  			height:241px;
  			background: white;
  			margin:0px auto;
  			padding:5px;
		}
  		#newsLoginUser h5{
  			text-align: center;
  		}
  		#newsLoginUser button {
			width: 200px;
			height:40px;
			border-radius: 10px;
			font-size:16px;
			margin: 5px auto;
		}
		.loginBt,.exit{
			background: red;
			color: white;
		}
		.register{
			color: white;
			background: rgb(34,142,218);
		}
		#newsLoginUser ul li{
			
			list-style: none;
			margin: 5px auto;
			/* border: 1px solid red; */
			text-align:center;
		}
		#userTopImg{
			width:70px;
			height:70px;
			/* border:1px dotted rgb(200,200,200); */
			border-radius:50px;
			margin:20px auto;
			background:url(${APP_PATH}/static/images/userTop/userTop1.jpg);
			background-size: 100% 100%;
		}
		#userNickName{
			width:100px;
			height:30px;
			/* //border:1px dotted rgb(200,200,200); */
			
		}
		#loginCollect,#loginComment{
			font-style:italic;
			color: red;
			font-size: 19px;
		}
		#newsTJ{
			width:335px;
			height:360px;
			background: rgb(241,241,241);
			padding: 6px;
			
		}
		#newsTJ h4{
			font-size: 19px;
		}
		#newsTJ ul li{
			width:325px;
			height:80px;
			border-bottom: 1px solid rgba(45,45,45,0.3);
			list-style: none;
		}
		.newsTJImg{
			width:70px;
			height:78px;
			
			float: left;
		}
		.newsTJTitle{
			width:230px;
			height:78px;
			padding-top:10px;
			float: right;
		}
		.newsTJTitle span{
			font-size: 15px;
			
		}
		#newsFYDiv{
			width:658px;
			height:70px;
			border:1px solid black;
		}
		#newsFYInfo{
			width:200px;
			height:60px;
			border:1px solid black;
			float:left;
		}
		#newsFYT{
			width:353px;
			height:60px;
			border:1px solid black;
			float:right;
		}
		.newsImg{
			overflow: hidden;
		}
		.newsListImg:hover{
			width:145px;
			height: 120px;
		}
		.newsListImg{
			width:140px;
			height: 114px;
			transition:all 0.5s;
		}
  	</style>
  </head>
  
  <body>
    <div id="big">
    	<div id="head">
			<div id="headContent">
				<div id="newsWeather">
					<!-- <span>广东-佛山：<span><em>10</em>°&nbsp;/&nbsp;<em>10</em>°</span> -->
					<iframe scrolling="no" src="https://tianqiapi.com/api.php?city=茂名&skin=pitaya&color=ffff&fontsize=16&paddingtop=10" frameborder="0" width="200" height="35" allowtransparency="true"></iframe>
    				
    			</div>
				<div id="newsHeadMenu">
					<span>投诉侵权</span>
					&nbsp;&nbsp;&nbsp;;&nbsp;
					<span>联系客服</span>
				</div>
			</div>
		</div>
		<div id="newsBody">
			<div id="newsMenu">
				<ul id="newsMenuUl">
					
				</ul>
			</div>
			<div id="bodyRight">
				<div id="newsContent">
					<div id="newsImgLB">
						<div id="demo" class="carousel slide" data-ride="carousel">
							  <!-- 指示符 -->
							  <ul class="carousel-indicators">
							    <li data-target="#demo" data-slide-to="0" class="active" style="width:28px;height: 5px;"></li>
							    <li data-target="#demo" data-slide-to="1" style="width:28px;height: 5px;"></li>
							    <li data-target="#demo" data-slide-to="2" style="width:28px;height: 5px;"></li>
							  </ul>
							 
							  <!-- 轮播图片 -->
							  <div class="carousel-inner">
							    <div class="carousel-item active">
							      <img src="http://static.runoob.com/images/mix/img_fjords_wide.jpg">
							    </div>
							    <div class="carousel-item">
							      <img src="http://static.runoob.com/images/mix/img_nature_wide.jpg">
							    </div>
							    <div class="carousel-item">
							      <img src="http://static.runoob.com/images/mix/img_mountains_wide.jpg">
							    </div>
							  </div>
							 
							  <!-- 左右切换按钮 -->
							  <a class="carousel-control-prev" href="#demo" data-slide="prev">
							    <span class="carousel-control-prev-icon"></span>
							  </a>
							  <a class="carousel-control-next" href="#demo" data-slide="next">
							    <span class="carousel-control-next-icon"></span>
							  </a>
							 
							</div>
					</div>
					<div id="newsList">
						<ul id=newsListUl>
							<%-- <li>
								<div class='newsImg'>
									<img id="newsImgImg" alt="" src="${APP_PATH}/static/images/newsIMg/201901/1546818383619058263.jpg" width="140"height="114">
								</div>
								<div class='newsTitleSp'>
									<span id="newsTitleSp">何洁发文亲证已处在新感情中 知情人证实已生三胎：是刁磊的孩子</span>
								</div>
							</li> --%>
						</ul>
					</div>
					<div id="newsFYDiv">
						<div id="newsFYInfo"></div>
						<div id="newsFYT"></div>
					</div>
				</div>
				<div id="newsData">
					<div id="newsSearchDiv">
						<div class="input-group">
							<input type="text" class="newsSearchInput" placeholder="搜索内容">
          					<span class="input-group-addon newsSearchSO">搜索</span>
         				</div>
					</div>
					<div id="newsLoginDiv">
						<div id="newsLoginUser">
							<!-- <h5 id="newsLoginUserH51">登录后可以保存您的浏览喜好、评论、收藏，</h5>
							<h5 id="newsLoginUserH52">并与APP同步更可以发布微头条</h5>
							<div align="center">
								<button class="btn loginBt" >登录</button>
								<button class="btn register">注册</button>
							</div> -->
							<!-- <ul>
								<li id="userTopImg"></li>
								<li id="userNickName">smgk-seven</li>
								<li><button class="btn exit" >退出登录</button></li>
								<li>收藏：<span id="loginCollect">80</span> 评论：<span id="loginComment">50</span></li>
							</ul> -->
						</div>
					</div>
					<div id="newsTJ">
						<h4>24小时热闻</h4>
						<ul>
							<li>
								<div class='newsTJImg'>
									<img alt="" src="${APP_PATH}/static/images/newsIMg/201901/1546818383619058263.jpg" width="75"height="75">
								</div>
								<div class='newsTJTitle'>
									<span>何洁发文亲证已处在新感情中 知情人证实已生三胎：是刁磊的孩子</span>
								
								</div>
							</li>
							<li>
								<div class='newsTJImg'>
									<img alt="" src="${APP_PATH}/static/images/newsIMg/201901/1546818383619058263.jpg" width="75"height="75">
								</div>
								<div class='newsTJTitle'>
									<span>何洁发文亲证已处在新感情中 知情人证实已生三胎：是刁磊的孩子</span>
								
								</div>
							</li>
							<li>
								<div class='newsTJImg'>
									<img alt="" src="${APP_PATH}/static/images/newsIMg/201901/1546818383619058263.jpg" width="75"height="75">
								</div>
								<div class='newsTJTitle'>
									<span>何洁发文亲证已处在新感情中 知情人证实已生三胎：是刁磊的孩子</span>
								
								</div>
							</li>
							<li>
								<div class='newsTJImg'>
									<img alt="" src="${APP_PATH}/static/images/newsIMg/201901/1546818383619058263.jpg" width="75"height="75">
								</div>
								<div class='newsTJTitle'>
									<span>何洁发文亲证已处在新感情中 知情人证实已生三胎：是刁磊的孩子</span>
								
								</div>
							</li>
						</ul>
					</div>
					<div id="newsZX">
						
					</div>
				</div>
			</div>
			
		</div>
    </div>
    <input type="hidden" id="loginUserId" value="${LoginUser.userId}" >
  </body>
	<script type="text/javascript">
		var loginUserId=$("#loginUserId").val()
		var showNewsType="";
		var showNewsKeyword="";
		$(function(){
			addNewsGenre();
			addLoginUserInfo(loginUserId);
			getNews(1,showNewsType,showNewsKeyword);
		})
		
		$(document).on("click",".loginBt",function(){
			window.location='${APP_PATH}/login.jsp';
		})
					
		$(document).on("click",".register",function(){
			window.location='${APP_PATH}/login.jsp';
		})
					
		
		//获取新闻类别 
	function addNewsGenre(){
		$.ajax({
			url:"${APP_PATH }/getNewsGenre",
			type:"POST",
			success:function(result){
				setNewsGenre(result)
			} 
	 	})
	}
	//把新闻 内容添加到li
	function setNewsGenre(result){
		$("#newsMenuUl").empty();
		$("#newsMenuUl").append("<li class='newsHome' style='width:140px; font-size: 20px; color: red'>SSM-NEWS</li>")
		$.each(result.extend.genres,function(index,item){
			$("#newsMenuUl").append("<li class='newsMenuLi'>"+item.genreName+"</li>")
		})
	}

		function addLoginUserInfo(loginUserId){
			$("#newsLoginUser").empty();
			//sloginUserId=null;
			if(loginUserId==""){
				$("#newsLoginUser").append($("<h5>登录后可以保存您的浏览喜好、评论、收藏，</h5>"));
				$("#newsLoginUser").append($("<h5>并与APP同步更可以发布微头条</h5>"));
				$("#newsLoginUser").append($("<div align='center'><button class='btn loginBt' >登录</button><button class='btn register'>注册</button></div>"))
				console.log("进入第一个if")			
			}else if(loginUserId!=""){
				//console.log(loginUserId);
				$.ajax({
					url:"${APP_PATH }/getUser",
					type:"POST",
					data:"userId="+loginUserId,
					success:function(result){
						addUserToDiv(result);
					} 
				})
			}
		}
		//把user信息添加到div
		function addUserToDiv(result){
			var ul=$("<ul></ul>");
			ul.append($("<a href='loginAction?username="+result.extend.user.nickName+"'><li id='userTopImg'></li></a>"));
			ul.append($("<li id='userNickName'>"+result.extend.user.nickName+"</li>"));
			//<a href="exit"><button type="button">退出登录</button></a>
			ul.append($("<li><button class='btn exit' >退出登录</button></li>"));
			ul.append($("<li>收藏：<span id='loginCollect'>80</span> 评论：<span id='loginComment'>50</span></li>"));
			$("#newsLoginUser").append(ul);
			console.log("进入第二个if")
		}
	
		//获取新闻 
		function getNews(newsPageNum){
	  		$.ajax({
				url:"${APP_PATH }/getNews",
				type:"POST",
				data:"newsPageNum="+newsPageNum+"&showNewsType="+showNewsType+"&showNewsKeyword="+showNewsKeyword,
				success:function(result){
					addNews(result);
					addNewsFYInfo(result);
					addNewsFyt(result);
					
				} 
		 	})
	  	}
		
		//把新闻 添加到div
		//target='_blank'
		function addNews(result){
			var ii=0
			$("#newsListUl").empty();
			$.each(result.extend.allNews.list,function(index,item){//width='140'height='114'
				ii++;
				var newsImgDiv=$("<div class='newsImg'><a href='showNews.jsp?newsId="+item.newsId+"' target='_blank'><img class='newsListImg' src='"+item.newsTopImg+"'></a></div>");
				var newsTitleDiv=$("<div class='newsTitle'><span id='newsTitleSp'>"+item.newsTitle+"</span></div>");
				$("<li><li>").append(newsImgDiv).append(newsTitleDiv).appendTo("#newsListUl")
				console.log(ii)
			
			})
		}
		//把新闻 列表的分页添加到div
		function addNewsFYInfo(result){
	  		$("#newsFYInfo").empty()
	  		$("#newsFYInfo").append("总记录【"+result.extend.allNews.total+"】 当面页【"+result.extend.allNews.pageNum+"】");
	  		//pageNum=result.extend.allStus.pageNum;
	  		//pages=result.extend.allStus.pages;
	  	}
		//把新闻列表的分布条添加到div
		function addNewsFyt(result){
	  		$("#newsFYT").empty();
	  		var ul=$("<ul></ul>").addClass("pagination");
	  		
	  		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
	  		var prePageLi = $("<li></li>").append($("<a></a>").append("《"));
	  		//判断如果没有上一页，就设置为不可点击 
	  		if(result.extend.allNews.hasPreviousPage==false){
	  			firstPageLi.addClass("disabled");
	  			prePageLi.addClass("disabled");
	  		}else{
				//为元素添加点击翻页的事件
				firstPageLi.click(function(){
					getNews(1);
				});
				prePageLi.click(function(){
					getNews(result.extend.allNews.pageNum -1);
				});
			}
	  		var nextPageLi = $("<li></li>").append($("<a></a>").append("》"));
	  		var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页"));
	  		
	  		//判断如果没有上一页，就设置为不可点击 
	  		if(result.extend.allNews.hasNextPage==false){
	  			nextPageLi.addClass("disabled");
	  			lastPageLi.addClass("disabled");
	  		}else{
				nextPageLi.click(function(){
					getNews(result.extend.allNews.pageNum +1);
				});
				lastPageLi.click(function(){
					getNews(result.extend.allNews.pages);
				});
			}
	  		ul.append(firstPageLi).append(prePageLi);
	  		//遍历 出 页数导航条--》 navigatepageNums
	  		$.each(result.extend.allNews.navigatepageNums,function(index,item){
	  			var numLi = $("<li></li>").append($("<a></a>").append(item));
	  			if(result.extend.allNews.pageNum==item){
	  				numLi.addClass("active");
	  			}
	  			numLi.click(function(){
	  				getNews(item);
	  			})
	  			ul.append(numLi);
	  		})
	  		ul.append(nextPageLi).append(lastPageLi);
	  		var navEle=$("<nav></nav>").append(ul);
	  		navEle.appendTo("#newsFYT");
	  	}
		
		//设置搜索文章内容
		$(".newsSearchSO").click(function(){
			showNewsKeyword=$(".newsSearchInput").val();
			showNewsType="";
			getNews(1,showNewsType,showNewsKeyword);
		})
		
		$(document).on("click", ".newsMenuLi", function(){
			showNewsType=$(this).html();
			showNewsKeyword="";
			console.log(showNewsType)
			getNews(1,showNewsType,showNewsKeyword);
		})
		$(document).on("click", ".newsHome", function(){
			showNewsType="";
			showNewsKeyword="";
			
			getNews(1,showNewsType,showNewsKeyword);
		})
		
		
		//退出登录
		$(document).on("click",".exit",function(){
			alert("退出登录")
			$("#loginUserId").val("");
			loginUserId=null;
			window.location='exit';
		})
		
	</script>
</html>
