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
    
    <title>My JSP 'userInfo.jsp' starting page</title>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
	<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
	<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<style type="text/css">
		body{
			background-color: rgb(253,253,253);
		}
		*{
			margin:0;
			padding:0;
			background-color:white;
		}
		#big{
			width:1000px;
			height:800px;
			background-color:white;
			/* border: 1px solid red; */
			margin:0px auto;
		}
		#left{
			width:995px;
			height:800px;
			border: 1px solid black;
			float:left;
		}
		
		#column{
			width:200px;
			height:800px;
			border: 0.5px solid black;
			float:left;
		}
		#content{
			width:790px;
			height:800px;
			border: 0.5px solid black;
			float:right;
		}
		
		#userTopImgDiv{
			width:198px;
			height:278px;
			border: 0.5px solid black;
			float:right;
			
		}
		#userMeue{
			width:198px;
			height:520px;
			border: 0.5px solid black;
			float:right;
			
		}
		#userTopImg{
			width:100px;
			height:100px;
			border-radius:50px;
			border:1px dotted rgb(200,200,200);
			margin:50px auto;
			background:url(${APP_PATH}/static/images/userTop/userTop1.jpg);
			background-size: 100% 100%;
			
		}
		#userTopImgDiv h4{
			text-align: center;
			line-height: 0px;
			color: red
		}
		#userMeue ul li{
			list-style: none;
			width:150px;
			height:50px;
			float left;
			border:solid 1px red;
			margin :3px auto;
			cursor:pointer;
			font-size: 19px;
			text-align: center;
			line-height: 45px;
		}
		.clickStyle{
			color:white;
			background:url(${APP_PATH}/static/images/daohanbk.jpg);
			background-size: 100% 100%;
		} 
	</style>
  </head>
  
  <body>
     <%-- ${sessionScope.loginUser}
     ${sessionScope.loginUser.nickName} --%>
     <input id="user" type="hidden" value="${sessionScope.loginUser}" >
     <input id="userId" type="hidden" value="${sessionScope.loginUser.userId}" >
     <div id="big">
     	<div id="left">
     		<div id="column">
     			<div id="userTopImgDiv">
     				<div id="userTopImg"></div>
     				<h4>${sessionScope.loginUser.nickName}</h4>
     			</div>
     			<div id="userMeue">
     				<ul>
     					<li id="userData"><!-- <i class="fa fa-id-badge" style="font-size: 24px;"></i>&nbsp;&nbsp; -->我的资料</li>
     					<li id="userCollect"><!-- <i class="fa fa-laptop" style="font-size: 24px;"></i>&nbsp;&nbsp; -->我的收藏</li>
     					<li id="userInfo"><!-- <i class="fa fa-envelope-o" style="font-size: 24px;"></i>&nbsp;&nbsp; -->我的消息</li>
     					<li id="userComment"><!-- <i class="fa fa-comments-o" style="font-size: 24px;"></i>&nbsp;&nbsp; -->我的评论</li>
     					<li id="newsHome"><a href="newsHome.jsp">进入首页</a></li>
     					<li id="userExit"><a href="exit">退出</a></li>
     				</ul>
     			</div>
     		</div>
     		<div id="content">
     			
     			<div id="contentDiv">
     				
     			</div>
     		</div>
     	</div>
     	
     </div>
     <!-- 修改 模态框 -->
     <div class="modal fade" id="updateModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">注册账号</h4>
	            </div>
	            <div class="modal-body">
	            	<form class="form-horizontal">
	            		<div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">昵称</label>
							<div class="col-sm-10">
							    <input type="text" name="nickName" class="form-control" id="userNickname_add_input" placeholder="请输入用户名">
							    <input type="hidden" name="userId" class="form-control" id="userId_add_input" placeholder="请输入用户名">
							    <span class="help-block"></span>
							    <input type="hidden" name="userGenre" class="form-control" id="userGenre_add_input"value="0">
							</div>
						</div>
						<div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-10">
						      <input type="text" name="email" class="form-control" id="userEmail_add_input" placeholder="email@qq.com">
						      <span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
						    <input type="password" name="password" class="form-control" id="userPwd_add_input" placeholder="登录时的密码">
						    <span class="help-block"></span>
							</div>
						</div>
						
						<div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">兴趣</label>
							<div class="col-sm-10">
							<select class="form-control" name="userLike" id="userLikeSel"></select>
							</div>
						</div>
					  
					</form>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	                <button type="button" class="btn btn-primary" id="user_update_btn">修改</button>
	            </div>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>
  </body>
  
	<script type="text/javascript">
		var user=$("#user").val()
		var userId=$("#userId").val()
		var menus=$("#userMeue ul li")
		var userList;
		var stuList;
		
		$(function(){
			userMenuAction();
		})
		function userMenuAction(){
			var private=menus[0]
			getInfo(null,private);
			for(var i=0;i<menus.length;i++){
				menus[i].onclick=function(){
					getInfo(private,this)
					/* console.log(private)
					console.log(this) */
					private=this
				}
			}
		}
		function getInfo(private,current){
			var actionName="";
			if(private==null){
				current.className+="clickStyle";
			}else{
				$(private).attr("class","");
				current.className+="clickStyle";
			}
			actionName=$(current).attr("id")
			if(actionName=='userData'){
				$.ajax({
					url:"${APP_PATH }/getUser",
					type:"POST",
					data:"userId="+userId,
					success:function(result){
						//alert(result.extend.user.userId)
						addUserData(result);
					} 
			 	})
			}else if(actionName=='userCollect'){
				//console.log("处理收藏")
			}else if(actionName=='userInfo'){
				//console.log("处理消息")
			}else if(actionName=='userComment'){
				//console.log("处理评论")
			}
		}
		function addUserData(result){
			$("#contentDiv").empty();
			$("#userNickname_add_input").empty();
			$("#userEmail_add_input").empty();
			$("#userId_add_input").empty();
			userLike=result.extend.userLikeGenre.genreName;
			var user=result.extend.user
			$("#userNickname_add_input").attr("value",user.nickName)
			$("#userEmail_add_input").attr("value",user.email);
			$("#userId_add_input").attr("value",user.userId);
			var userGenre;
			var table=$("<table class='table'><caption style='color: black; font-size: 20px;'>个人资料</caption><thead> <tr> <th>用户id</th><th>昵称</th><th>用户邮箱</th><th>喜欢类别</th><th>用户类型</th><th>操作</th></tr></thead></table>");
			var tbody=$("<tbody></tbody>");
			$("contentDiv").empty();
			if(user.userGenre=='0'){
				userGenre="普通用户"
			}else if(user.userGenre=='1'){
				userGenre="vip用户"
			}else if(user.userGenre=='2'){
				userGenre="管理员"
			}
			var userTr=$("<td>"+user.userId+"</td><td>"+user.nickName+"</td><td>"+user.email+"</td><td>"+result.extend.userLikeGenre.genreName+"</td><td>"+userGenre+"</td><td class='updateUser'><button style='background:red;color:white;' class='btn'>修改</button></td>");
			
			userTr.appendTo(tbody)
			tbody.appendTo(table)
			table.appendTo($("#contentDiv"))
		}
		$(document).on("click",".updateUser",function(){
			addUserLIkeGenre();
			//$("#userLikeSel").attr("value",userLike);
			console.log(userLike);
			$("#updateModel").modal(function(){
				backdrop:'static';
			});
		})
		function addUserLIkeGenre(){
			$("#userLikeSel").empty();
			$.ajax({
				url:"${APP_PATH }/getNewsGenre",
				type:"POST",
				success:function(result){
					$.each(result.extend.genres,function(){
	  					var optionEle=$("<option></option").append(this.genreName).attr("value",this.genreId);
	  					optionEle.appendTo($("#userLikeSel"));
	  				})
				}
	 		})
		}
		$("#user_update_btn").click(function(){
			$("#updateModel").modal('hide');
			$.ajax({
				url:"${APP_PATH }/updateUser",
				data:$("#updateModel form").serialize(),
				type:"POST",
				success:function(result){
					
					alert(result.msg)
					window.location.href="login.jsp";
				}
	 		})
		})
	</script>
	<!-- 
		<table class="table">
		<caption style="color: black; font-size: 20px;">个人资料</caption>
		   <thead>
		      <tr>
		         <th>名称</th>
		         <th>城市</th>
		      </tr>
		   </thead>
		   <tbody>
		      <tr>
		         <td>Tanmay</td>
		         <td>Bangalore</td>
		      </tr>
		   </tbody>
		</table>
	
	 -->
</html>
