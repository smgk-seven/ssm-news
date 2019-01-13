<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("APP_PATH", request.getContextPath());

%>

<!DOCTYPE html5">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ssm-news管理员界面</title>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
	<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
	<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<style>
		*{
			padding: 0;
			margin: 0;
		}
		#big{
			width:100%;
			height:1700px;
			border:1px solid red;
			background: rgb(245,245,245);
		}
		#head{
			width:100%;
			height:50px;
			border:1px solid black;
			background: black;
		}
		#headContent{
			width:1000px;
			height:48px;
			/* border:0.5px solid red; */
			margin:0px auto;
		}
		#menu{
			width:790;
			height:48px;
			float:left
		}
		#menu ul li{
			color:white;
			width:70;
			height:45px;
			/* border:0.5px solid white; */
			text-align:center;
			float:left;
			font-size: 20px;
			list-style: none;
			line-height:45px;
			transform:all 1.5s;
		}
		#menu ul li:hover{
			font-size: 22px;
		}
		#menu ul li a{
			text-decoration: none;
			color:white;
		}
		#userTomImg{
			float:left;
			width:45px;
			height:45px;
			border-radius:50px;
			border:1px dotted rgb(200,200,200);
			margin:0px auto;
			background:url(${APP_PATH}/static/images/userTop/userTop1.jpg);
			background-size: 100% 100%;
			cursor:pointer;
			
		}
		#userNickNameDiv{
			float:left;
			width:80px;
			height:45px;
			color:white;
			font-size: 17px;
			line-height: 45px;
			margin-left:10px;
			
		}
		#userTopImgDiv h4{
			text-align: center;
			line-height: 0px;
			color: red
		}
		#userDataDiv{
			width:200px;
			height:48px;
			border:0.5px solid red;
			float:left;
			position: relative;
		}
		
		#body{
			width:1000px;
			height:1650px;
			border:0.5px solid red;
			margin:0px auto
		}
		#left{
			width:248px;
			height:990px;
			margin:0px auto;
			float: left;
			background: white;
		}
		#userDataLeft{
			width:240px;
			height:251px;
			margin:10px auto;
			/* border:1px solid black; */
		}
		#userDataLeft ul li{
			width:237px;
			height:50px;
			margin:0px auto;
			 border-bottom:0.3px solid black;
			list-style: none;
		}
		#userDataLeft ul li #topImg{
			width:45px;
			height:45px;
			border-radius:50px;
			border:1px dotted rgb(200,200,200);
			background:url(${APP_PATH}/static/images/userTop/userTop1.jpg);
			background-size: 100% 100%;
			margin:0px auto;
		}
		.dataTitle{
			width:70px;
			height:47px;
			margin:3px auto;
		/* 	border:0.3px solid red; */
			float:left;
			font-size: 20px;
			text-align: center;
			line-height: 40px;
			
		}
		.dataContent{
			width:160px;
			height:47px;
			margin:3px auto;
			/* border:0.3px solid red; */
			float:right;
			font-size: 20px;
			line-height: 40px;
			color:red;
		}
		.exitLi a{
			text-decoration:none;
			font-size: 19px;
			line-height: 29px;
			color:red;
			text-align: center;
		}
		.exitLi{
			text-align: center;
		}
		.exitLi button{
			width:100px;
			height:40px;
		}
		#right{
			width:747px;
			height:1650px;
			margin:0px auto;
			float: right;
			border:1px solid red;
			
		}
		#rightTitle{
			width:740px;
			height:50px;
			margin:10px auto;
			background: white;
		}
		#rightTitleH3{
			line-height: 50px;
			text-align: center;
		}
		#userDiv{
			width:740px;
			height:570px;
			margin:0px auto;
			background: white;
			padding: 8px;
		}
		#allUserData{
			width:730px;
			height:200px;
			margin:0px auto;
			background: white;
			border:1px solid red;
		}
		#allUserTitle,#newsDivTitle{
			width:730px;
			height:45px;
			margin:0px auto;
			background: white;
			border:1px solid red;
		}
		#allUserTitleH4,#newsDivTitleH4{
			line-height: 20px;
			font-weight: bold;
			
		}
		#allUserDataCentent{
			width:730px;
			height:150px;
			margin:0px auto;
			background: white;
			border:1px solid red;
		}
		#allUserDataCentent ul li{
			float:left;
			width:145px;
			height: 145px;
			list-style: none;
			border:0.5px solid rgb(240,240,240);
			margin-left: 25px;
		}
		.allUserDataH4{
			text-align: center;
			font-size: 22px;
			line-height: 0px;
		}
		.allUserNumC{
			width:85px;
			height: 30px;
			line-height:40px;
			/* border:1px solid red; */
			text-align: center;
			font-size:30;
			margin:30px auto;
		}
		#userFY{
			width:730px;
			height:50px;
			margin:10px auto;
			border:1px solid red;
		}
		#userFYInfo{
			width:240px;
			height:48px;
			float: left;
			border:1px solid red;
			color: rgb(100,100,100);
			font-size:16px;
			line-height:40px;
			position: relative;
		}
		#userFYT{
			width:305px;
			height:48px;
			float: right;
			border:1px solid red;
			position: absolute;
			margin-top: -13px;
			margin-left: 403px;
		}
		.userBtStyle{
			background: rgba(51,122,183,0.8)
		}
		#userDiv .btn{
			color: black;
			transition:all 0.3s;
		}
		#userDiv .btn:hover{
			font-size: 16px;
		}
		#newsDiv{
			width:740px;
			height:800px;
			margin:10px auto;
			background: white;
			padding: 8px;
		}
		#newsGenre{
			width:730px;
			height:50px;
			border: 1px solid red;
		}
		#newsGenre ul li{
			list-style: none;
			float:left;
			width:71px;
			height:45px;
			margin-left:1px;
			border: 0.3px solid rgb(240,240,240);
			text-align: center;
			line-height: 45px;
			font-size: 18px;
			cursor: pointer;
			
		}
		#newsGenre ul li:HOVER {
			color: white;
			background: black;
		}
		#newsTable{
			width:730px;
			height:500px;
			margin:5px auto;
			border:1px solid red;
		}
		
		
	</style>
  </head>
    <%-- ${sessionScope.loginUser}
     ${sessionScope.loginUser.nickName} --%>
	<input type="hidden" id="loginUserId" value="${sessionScope.loginUser.userId}">
	<body>
		<div id="big">
			<div id="head">
				<div id="headContent">
					<div id="menu">
						<ul>
							<li><a href="#">首页</a></li>
							<li><a href="#">国际</a></li>
							<li><a href="#">视频</a></li>
							<li><a href="#">心情</a></li>
							<li><a href="#">鸡汤</a></li>
							<li><a href="#">摄影</a></li>
							<li><a href="#">娱乐</a></li>
							<li><a href="#">科技</a></li>
							<li><a href="#">时尚</a></li>
							<li><a href="#">财经</a></li>
							<li><a href="#">更多</a></li>
						</ul>
					</div>
					<div id="userDataDiv">
						<div id="userTomImg"></div>
						<div id="userNickNameDiv">
							<i class="fa fa-mercury"></i>&nbsp; ${sessionScope.loginUser.nickName}
						</div>
					</div>
				</div>
			</div>
			<div id="body">
				<div id="left">
					<div id="userDataLeft">
						<ul>
							<li>
								<div id="topImg"></div>
							</li>
							<li>
								<div class="dataTitle">ID：</div>
								<div class="dataContent">${sessionScope.loginUser.userId}</div>
							</li>
							<li>
								<div class="dataTitle">昵称：</div>
								<div class="dataContent">${sessionScope.loginUser.nickName}</div>
							</li>
							<li>
								<div class="dataTitle">邮箱：</div>
								<div class="dataContent">${sessionScope.loginUser.email}</div>
							</li>
							<li class="exitLi">
								<a href="exit"><button type="button">退出登录</button></a>
							</li>
						</ul>
					</div>
				</div>
				<div id="right">
					<div id='rightTitle'>
						<h3 id="rightTitleH3">SMGK-NEWS 后台管理</h3>
					</div>
					<div id="userDiv">
						<div id="allUserData">
							<div id="allUserTitle">
								<h4 id="allUserTitleH4">用户管理模块</h4>
							</div>
							<div id="allUserDataCentent">
								<ul>
									<li>
										<div id="allUserNum" class="allUserNumC"></div>
										<h4 class="allUserDataH4">所有用户</h4>
									</li>
									<li>
										<div id="allBTUserNum" class="allUserNumC"></div>
										<h4 class="allUserDataH4">普通用户</h4>
									</li>
									<li>
										<div id="allVipUserNum" class="allUserNumC"></div>
										<h4 class="allUserDataH4">vip用户</h4>
									</li>
									<li>
										<div id="allManUserNum" class="allUserNumC"></div>
										<h4 class="allUserDataH4">系统管理员</h4>
									</li>
									
								</ul>
							</div>
						</div>
						<table class="table">
							<!-- <caption style="color: black; font-size: 18px">所有用户 </caption> -->
							<caption>
								<button  class="btn" id="getAllUserBt">所有用户</button><!-- 空 或者3全部 0普通  1vip 2系统管理 -->
								<button class="btn" id="getBTUserBt">普通用户</button>
								<button class="btn" id="getVipUserBt">vip用户</button>
								<button class="btn" id="getManUserBt">系统管理员</button>
							</caption>
							<tr>
								<th>id</th>
								<th>昵称</th>
								<th>email</th>
								<th>类型</th>
								<th>爱好</th>
								<th>操作</th>
								<th> </th>
							</tr>
							<tbody id="userTbody">
								
							</tbody>
						</table>
						<div id="userFY">
							<div id="userFYInfo"></div>
							<div id="userFYT"></div>
						</div>
						<div id="userInfoDiv">
							
						</div>
					</div>
					
					<div id="newsDiv">
						<div id="newsDivTitle">
							<h4 id="newsDivTitleH4">文章管理模块</h4>
						</div>
						<div id="newsGenre">
							<ul id="newsGenreUl">
							</ul>
						</div>
						<div id="newsTable">
							<table class="table">
								<!-- <caption style="color: black; font-size: 18px">所有用户 </caption> -->
								<!-- <caption>
									<button  class="btn" id="getAllUserBt">所有用户</button>空 或者3全部 0普通  1vip 2系统管理
									<button class="btn" id="getBTUserBt">普通用户</button>
									<button class="btn" id="getVipUserBt">vip用户</button>
									<button class="btn" id="getManUserBt">系统管理员</button>
								</caption> -->
								<tr>
									<th>新闻Id</th>
									<th>新闻标题</th>
									<th>新闻作者</th>
									<th>发布时间</th>
									<th>类别</th>
									<th>查看</th>
									
								</tr>
								<tbody id="newsTbody">
									
								</tbody>
							</table>
						</div>
					</div>
					
				</div>
			</div>
		</div>
		
		<div class="modal fade" id="user" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">注册账号</h4>
		            </div>
		            <div class="modal-body">
		            </div>
		            <div class="modal-footer">
		                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		                <button type="button" class="btn btn-primary" id="user_save_btn">注册</button>
		            </div>
		        </div><!-- /.modal-content -->
		    </div><!-- /.modal -->
		</div>
	</body>
	<script type="text/javascript">
		var pageNum=1;
	  	var pages=0;
	  	var stuPageNum=0;
	  	var stuPages=0;
	  	var getUserType="";
		$(function(){
			getUsers(1);
			addNewsGenre();
			getNews(1);
		})
		
		//获取用户的方法和请求
		function getUsers(pageNum){
			console.log(getUserType)
	  		$.ajax({
				url:"${APP_PATH }/getAllUser",
				type:"POST",
				data:"pageNum="+pageNum+"&getUserType="+getUserType,
				success:function(result){
					addUserInfo(result);
					addUserFYInfo(result);
					addUserFyt(result);
					addUserData();
				} 
		 	})
	  	}
	  	//把用户信息添加到表格
	  	function addUserInfo(result){
	  		$("#userTbody").empty();
	  		var addVipTd;
	  		var removeVipTd;
	  		$.each(result.extend.allStus.list,function(index,item){
	  			//console.log(item.likeGenre.genreName)
				var userGenre;
				if(item.userGenre=='0'){
					userGenre='普通用户'
					addVipTd=$("<button type='button' class='btn btn-default addVipBt'>升vip</button>").attr("USERID",item.userId);
				}else if(item.userGenre=='1'){
					userGenre='vip用户'
					removeVipTd=$("<button type='button' class='btn btn-default removeVipBt'>降级</button>").attr("USERID",item.userId);
				}else if(item.userGenre=='2'){
					userGenre='管理员'
				} 
	  			var userIdTd=$("<td>"+item.userId+"</td>");
	  			var userNickNameTd=$("<td>"+item.nickName+"</td>");
	  			var userEmailTd=$("<td>"+item.email+"</td>");
	  			var userGenreTd=$("<td>"+userGenre+"</td>");
	  			var likeGenre=$("<td>"+item.likeGenre.genreName+"</td>");
	  			var userAction=$("<button type='button' class='btn btn-default delUserBt'>删除</button>").attr("USERID",item.userId);
	  			var userTr=$("<tr></tr>").append(userIdTd).append(userNickNameTd).append(userEmailTd).append(userGenreTd).append(likeGenre).append(userAction)
	  			if(addVipTd!=null){
	  				userTr.append(addVipTd)
	  			}
	  			if(removeVipTd!=null){
	  				userTr.append(removeVipTd)
	  			}
	  			userTr.appendTo("#userTbody");
	  			addVipTd=null;
	  			removeVipTd=null;
	  		})
	  	}
	  
		//处理用户分页信息
	  	function addUserFYInfo(result){
	  		$("#userFYInfo").empty()
	  		$("#userFYInfo").append("总记录【"+result.extend.allStus.total+"】 当面页【"+result.extend.allStus.pageNum+"】");
	  		pageNum=result.extend.allStus.pageNum;
	  		pages=result.extend.allStus.pages;
	  	}
	  	//用户信息分页
	  	function addUserFyt(result){
	  		$("#userFYT").empty();
	  		var ul=$("<ul></ul>").addClass("pagination");
	  		
	  		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
	  		var prePageLi = $("<li></li>").append($("<a></a>").append("《"));
	  		//判断如果没有上一页，就设置为不可点击 
	  		if(result.extend.allStus.hasPreviousPage==false){
	  			firstPageLi.addClass("disabled");
	  			prePageLi.addClass("disabled");
	  		}else{
				//为元素添加点击翻页的事件
				firstPageLi.click(function(){
					getUsers(1);
				});
				prePageLi.click(function(){
					getUsers(result.extend.allStus.pageNum -1);
				});
			}
	  		var nextPageLi = $("<li></li>").append($("<a></a>").append("》"));
	  		var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页"));
	  		
	  		//判断如果没有上一页，就设置为不可点击 
	  		if(result.extend.allStus.hasNextPage==false){
	  			nextPageLi.addClass("disabled");
	  			lastPageLi.addClass("disabled");
	  		}else{
				nextPageLi.click(function(){
					getUsers(result.extend.allStus.pageNum +1);
				});
				lastPageLi.click(function(){
					getUsers(result.extend.allStus.pages);
				});
			}
	  		ul.append(firstPageLi).append(prePageLi);
	  		//遍历 出 页数导航条--》 navigatepageNums
	  		$.each(result.extend.allStus.navigatepageNums,function(index,item){
	  			
	  			var numLi = $("<li></li>").append($("<a></a>").append(item));
	  			if(result.extend.allStus.pageNum==item){
	  				numLi.addClass("active");
	  			}
	  			numLi.click(function(){
	  				getUsers(item);
	  			})
	  			ul.append(numLi);
	  		})
	  		ul.append(nextPageLi).append(lastPageLi);
	  		var navEle=$("<nav></nav>").append(ul);
	  		navEle.appendTo("#userFYT");
	  	}
		
		//处理 用户的数据，总数之类 要发ajax
		function addUserData(){
			$("#allUserDataCentent div").empty();
			$.ajax({
				url:"${APP_PATH }/getUserData",
				type:"POST",
				success:function(result){
					/* console.log(result.extend.allUsserData) */
					$("#allUserNum").append(result.extend.allUsserData.allUserCount);
					$("#allBTUserNum").append(result.extend.allUsserData.btuserCount);
					$("#allVipUserNum").append(result.extend.allUsserData.vipUserCount);
					$("#allManUserNum").append(result.extend.allUsserData.managerUserCount)				
				} 
		 	})
		}
		//删除用户
		$(document).on("click",".delUserBt",function(){
	  		var userNickname=$(this).parents("tr").find("td:eq(1)").text();
	  		var userId=$(this).parents("tr").find("td:eq(0)").text();
	  		if(confirm("是否删除【"+userNickname+"】")){
	  			$.ajax({
					url:"${APP_PATH }/delUser",
					type:"POST",
					data:"userId="+userId,
					success:function(result){
						alert(result.extend.Message)
			 			//getBooks(pageNum);
			 			getUsers(pageNum);
					} 
			 	})
	  		} 
	  	})
	  	//升级vip 
	  	$(document).on("click",".addVipBt",function(){
	  		var userNickname=$(this).parents("tr").find("td:eq(1)").text();
	  		var userId=$(this).parents("tr").find("td:eq(0)").text();
	  		if(confirm("是否把【"+userNickname+"】升级为vip?")){
	  			$.ajax({
					url:"${APP_PATH }/addVipUser",
					type:"POST",
					data:"userId="+userId,
					success:function(result){
						alert(result.extend.Message)
			 			//getBooks(pageNum);
			 			getUsers(pageNum);
					} 
			 	})
	  		} 
	  	})
	  	//升级vip 
	  	$(document).on("click",".removeVipBt",function(){
	  		var userNickname=$(this).parents("tr").find("td:eq(1)").text();
	  		var userId=$(this).parents("tr").find("td:eq(0)").text();
	  		if(confirm("是否把【"+userNickname+"】移除vip身份，降回普通用户?")){
	  			$.ajax({
					url:"${APP_PATH }/removeVipUser",
					type:"POST",
					data:"userId="+userId,
					success:function(result){
						alert(result.extend.Message)
			 			//getBooks(pageNum);
			 			getUsers(pageNum);
					} 
			 	})
	  		} 
	  	})
		
		//新闻 模块的操作了
		//填写新闻类别
		function addNewsGenre(){
		$("#newsGenreUl").empty();
			$.ajax({
				url:"${APP_PATH }/getNewsGenre",
				type:"POST",
				success:function(result){
					$.each(result.extend.genres,function(index,item){
						$("#newsGenreUl").append($("<li genreId='"+item.genreId+"'>"+item.genreName+"</li>"))
					})
					$("#newsGenreUl").append($("<li id='addNewsBt'>添加</li>"))
				} 
		 	})
		}
		//添加文章
		$(document).on("click","#addNewsBt",function(){
			window.location='${APP_PATH}/editNews.jsp';
		})
		
		//获取 文章文章
		function getNews(newsPageNum){
	  		$.ajax({
				url:"${APP_PATH }/getAllNews",
				type:"POST",
				data:"newsPageNum="+newsPageNum,
				success:function(result){
					addNews(result);
					
				} 
		 	})
	  	}
		//把新闻 添加到表格
		function addNews(result){
			$("#newsTbody").empty();
			$.each(result.extend.allNews.list,function(index,item){
				//alert(item.newsId)
				var newsTitle=item.newsTitle;
				if(newsTitle.length>6){
					newsTitle=newsTitle.slice(0, 7)+"……";
				}
				var newsIdTd=$("<td>"+item.newsId+"</td>");
				var newsTitleTd=$("<td>"+newsTitle+"</td>");
				var newsAuthorTd=$("<td>"+item.user.nickName+"</td>");
				var newsTimeTd=$("<td>"+item.returnDate+"</td>");
				var newsGenreTd=$("<td>"+item.genre.genreName+"</td>");
				var newsShowTd=$("<td newsId='"+item.newsId+"'><button class='btn newsShowTd'>查看</button></td>");
				var newsEditTd=$("<td newsId='"+item.newsId+"'><button class='btn newsDetailTd'>详情</button></td>");
				$("<tr></tr>").append(newsIdTd).append(newsTitleTd).append(newsAuthorTd).append(newsTimeTd).append(newsGenreTd).append(newsShowTd).append(newsEditTd).appendTo("#newsTbody")
				
			})
		}
		
		$(document).on("click",".newsShowTd",function(){
			var newsId=$(this).parents("tr").find("td:eq(0)").text();
			window.location='${APP_PATH}/showNews.jsp?newsId='+newsId+'';
		})
		$(document).on("click",".newsDetailTd",function(){
			var newsId=$(this).parents("tr").find("td:eq(0)").text();
			/* $("#userAddModel").modal(function(){
				backdrop:'static';
			}); */
		})
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//处理用户点击查看的用户
		$("#getAllUserBt").click(function(){
			getUserType="3"
			getUsers(1);
		})
		$("#getBTUserBt").click(function(){
			getUserType="0"
			getUsers(1);
		})
		$("#getVipUserBt").click(function(){
			getUserType="1"
			getUsers(1);
		})
		$("#getManUserBt").click(function(){
			getUserType="2"
			getUsers(1);
		})
		
	</script>
</html>
