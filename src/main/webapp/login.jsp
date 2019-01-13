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
    
    <title>My JSP 'login.jsp' starting page</title>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript"src="${APP_PATH }/ueditor/ueditor.config.js"></script> 
	<script type="text/javascript"src="${APP_PATH }/ueditor/ueditor.all.min.js"></script> 
    <script type="text/javascript" charset="utf-8" src="${APP_PATH }/ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<style type="text/css">
		*{
    		margin:0;
    		padding:0;
    	}
    	.big{
    		width:100%;
    		height:100%;
    		border:1px solid black;
    		 background:url(${APP_PATH}/static/images/loginbk.jpg);
    		 background-size: 100% 100%;
    	}
    	.center{
    		width: 600px;
    		height:450px;
    		background-color: rgba(255,255,255,0.1);
    		margin: 150px auto;
    		padding: 12px;
    	}
    	.LoginH2{
    		width: 600px;
    		height: 80px;
    		text-align: center;
    		color: white;
    		margin-top: 20px;
    	}
    	
    	.formDiv{
    		width:450px;
    		margin: 10px auto;
    		margin-top: 100px;
    		/* border:1px solid red; */
    	}
    	.buttonDiv{
    		margin-left: 300px;
    		
    	}
    	.form-group label{
    		font-size: 20px;
    		line-height: 20px;
    	}
    	#loginName,#loginPassword{
    		width:300px;
    		margin-left: 32px;
    	}
    	#userNickname_add_input,#userEmail_add_input,#userPwd_add_input,#userLikeSel{
    		width:250px;
    	}
	</style>
  </head>
  	
  <body>
	<!-- 注册模态框  -->
	<div class="modal fade" id="userAddModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
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
	                <button type="button" class="btn btn-primary" id="user_save_btn">注册</button>
	            </div>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>
	
	<div class="big">
		<div class="center">
			<h2 class="LoginH2"> SMGK-NEWS<br><br>-LoginCenter</h1>
			<div class="formDiv">
				<form class="form-horizontal" id="loginForm" role="form" action="loginAction" method="post">
				  <div class="form-group">
				    <label for="firstname" class="col-sm-2 control-label">username:</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="loginName" name="username" placeholder="请输入登录 名">
				    	<span class="help-block"></span>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="lastname" class="col-sm-2 control-label">password:</label>
				    <div class="col-sm-10">
				      <input type="password" class="form-control" id="loginPassword" name="password"  placeholder="请输入登录 密码">
				    	<span class="help-block"></span>
				    </div>
				  </div>
				  <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10 buttonDiv">
				      <button type="submit" class="btn btn-default login">登录</button>
				       <button type="button" class="btn btn-primary" id="addUserBut">注册</button>
				    </div>
				  </div>
				</form>
			</div>
		</div>
	</div>
	
</body>
	<script type="text/javascript">
	$(".login").click(function(){
		if($("#loginName").val()==''|$("#loginPassword").val()==''){
			if($("#loginName").val()==''){
				show_validate_msg("#loginName","error","用户名不能为空");
			}else{
				show_validate_msg("#loginName","success","");
			}
			if($("#loginPassword").val()==''){
				show_validate_msg("#loginPassword","error","密码不能为空");
			}else{
				show_validate_msg("#loginPassword","success","");
			}
			return false;
		}
	})
	//登录 检查账号是否存在
	$("#loginName").change(function(){
		var loginName=$("#loginName").val()
		console.log(loginName)
		$.ajax({
			url:"${APP_PATH}/checkLoginName",
			data:"loginName="+loginName,
			type:"POST",
			success:function(result){
				if(result.code==100){
					$(".login").removeClass("disabled");
					show_validate_msg("#loginName", "success", "账号存在");
					return true;
				}
				if(result.code==200){
					show_validate_msg("#loginName", "error", "账号不存在/请注册后登录");
					$(".login").addClass("disabled");
					return false
				}
			}
		})
	})
	//检查账号和密码是否正确
	$("#loginPassword").change(function(){
		var loginPwd=$("#loginPassword").val()
		var loginName=$("#loginName").val()
		$.ajax({
			url:"${APP_PATH}/checkLogin",
			data:"loginPwd="+loginPwd+"&loginName="+loginName,
			type:"POST",
			success:function(result){
				if(result.code==100){
					$(".login").removeClass("disabled");
					show_validate_msg("#loginPassword", "success", "");
					return true;
				}
				if(result.code==200){
					show_validate_msg("#loginPassword", "error", "账号不存在/请注册后登录");
					$(".login").addClass("disabled");
					return false
				}
			}
		})
	})
	
	$("#addUserBut").click(function(){
		addUserLIkeGenre();
		$("#userAddModel").modal(function(){
			backdrop:'static';
		});
	})
	
	function addUserLIkeGenre(){
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
	
	//处理保存按钮
	$("#user_save_btn").click(function(){
		if(!validate_add_form()){
			return false;
		}
		console.log("检查完成")
		console.log($("#userAddModel form").serialize())
		$("#userAddModel").modal('hide');
		$.ajax({
			url:"${APP_PATH }/addUser",
			type:"POST",
			data:$("#userAddModel form").serialize(),
			success:function(result){
				alert(result.msg)
				
			}
 		})
		$("input,label,select").val("");
	})
	
	//查重
	$("#userEmail_add_input").change(function(){
		var userEmail=$("#userEmail_add_input").val();
		
		$.ajax({
			url:"${APP_PATH}/checkEmail",
			data:"userEmail="+userEmail,
			type:"POST",
			success:function(result){
				if(result.code==100){
					$("#user_save_btn").removeClass("disabled");
					show_validate_msg("#userEmail_add_input", "error", "");
					return true;
				}
				if(result.code==200){
					show_validate_msg("#userEmail_add_input", "error", "邮箱重复");
					$("#user_save_btn").addClass("disabled");
					return false
				}
			}
		})
	})
	$("#userNickname_add_input").change(function(){
		var userNickName=$("#userNickname_add_input").val();
		$.ajax({
			url:"${APP_PATH}/checkNickName",
			data:"userNickName="+userNickName,
			type:"POST",
			success:function(result){
				if(result.code==100){
					$("#user_save_btn").removeClass("disabled");
					show_validate_msg("#userNickname_add_input", "error", "");
					return true;
				}
				if(result.code==200){
					show_validate_msg("#userNickname_add_input", "error", "昵称重复");
					$("#user_save_btn").addClass("disabled");
					return false
				}
			}
		})
	})
	
	
	//检查字段
	function validate_add_form(){
		//检查两样 stucard stuEmail，
  		var userEmail=$("#userEmail_add_input").val();
  		var regEmail = /^([a-zA-Z0-9_\.-]+)@([a-zA-Z0-9_\.-]+)\.([a-z\.]{2,6})$/
  		var userNickName=$("#userNickname_add_input").val()
  		var userPwd=$("#userPwd_add_input").val()
  		
  		if(!regEmail.test(userEmail)|userEmail==''|userNickName==''|userPwd==''){
  			
  			if(!regEmail.test(userEmail)){
  				show_validate_msg("#userEmail_add_input", "error", "邮箱格式不正确");
  			}
  			if(userEmail==''){
  				show_validate_msg("#userEmail_add_input", "error", "邮箱不能为空");
  			}
  			if(userNickName==''){
  				show_validate_msg("#userNickname_add_input", "error", "昵称不能为空");
  			}
  			if(userPwd==''){
  				show_validate_msg("#userPwd_add_input", "error", "密码不能为空");
  			}
			return false;
		}else{
			
			if(regEmail.test(userEmail)){
  				show_validate_msg("#userEmail_add_input", "success", "");
  			}
  			if(userEmail!=''){
  				show_validate_msg("#userEmail_add_input", "success", "");
  			}
  			if(userNickName!=''){
  				show_validate_msg("#userNickname_add_input", "success", "");
  			}
  			if(userPwd!=''){
  				show_validate_msg("#userPwd_add_input", "success", "");
  			}
			return true;
		}
	}
	
	
	//这个方法用于把错误消息显示到控制台
	function show_validate_msg(ele,status,msg){
		//清除当前元素的校验状态
		$(ele).parent().removeClass("has-success has-error");
		$(ele).next("span").text("");
		$(ele).next("span").empty()
		if("success"==status){
			$(ele).parent().addClass("has-success");
			$(ele).next("span").text(msg);
		}else if("error" == status){
			$(ele).parent().addClass("has-error");
			$(ele).next("span").text(msg);
		}
	}
	</script>
</html>
