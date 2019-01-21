package com.smgk.news.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smgk.news.bean.AllUserData;
import com.smgk.news.bean.Genre;
import com.smgk.news.bean.Msg;
import com.smgk.news.bean.User;
import com.smgk.news.service.GenreService;
import com.smgk.news.service.UserService;
import com.smgk.news.util.utils;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private GenreService genreService;
	
	//查重用户名
	@RequestMapping("/checkNickName")
	@ResponseBody
	public Msg checkNickName(@RequestParam("userNickName") String userNickName){
		System.out.println("查重昵称："+userNickName);
		String msg=null;
		List<User> allUser = userService.getAllUser();
		for(User u:allUser){
			if(u.getNickName().equals(userNickName)){
				System.out.println("昵称重复");
				return Msg.fail();
			}
		}
		return Msg.success();
	}
	//查找 用户  根据id
	@RequestMapping("/getUser")
	@ResponseBody
	public Msg getUser(@RequestParam("userId") int userId){
		System.out.println("查找用户，Id为："+userId);
		String msg=null;
		User user = userService.getUser(userId);
		if(user==null){
			System.out.println("找不到该用户");
		}
		//找出喜欢 的类型
		Genre userLikeGenre = genreService.getGenreById(user.getUserLike());
		return Msg.success().add("user", user).add("userLikeGenre", userLikeGenre);
	}
	//查重邮箱
	@RequestMapping("/checkEmail")
	@ResponseBody
	public Msg checkRepeat(@RequestParam("userEmail") String userEmail){
		System.out.println(" 查重邮箱："+userEmail);
		String msg=null;
		List<User> allUser = userService.getAllUser();
		for(User u:allUser){
			if(u.getEmail().equals(userEmail)){
				System.out.println("邮箱重复");
				return Msg.fail();
			}
		}
		return Msg.success();
	}
	//添加用户
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveStu(User user){
		//student.setStuPwd(utils.md5(student.getStuPwd()));
		user.setPassword(utils.md5(user.getPassword()));
		System.out.println("新添加的用户："+user);
		userService.addUser(user);
		return Msg.success();
	}
	//修改用户
	@RequestMapping("/updateUser")
	@ResponseBody
	public Msg updateUser(User user){
		//student.setStuPwd(utils.md5(student.getStuPwd()));
		user.setPassword(utils.md5(user.getPassword()));
		System.out.println("修改用户："+user);
		userService.updateUser(user);
		return Msg.success();
	}
	
	
	//检查 所有账户是否存在
	@RequestMapping("/checkLoginName")
	@ResponseBody
	public Msg checkLoginName(@RequestParam("loginName") String loginName){
		System.out.println("检查账号是否存在："+loginName);
		String msg=null;
		List<User> allUser = userService.getAllUser();
		for(User u:allUser){
			if(u.getEmail().equals(loginName)||u.getNickName().equals(loginName)){
				System.out.println("账号存在");
				return Msg.success();
			}
		}
		return Msg.fail();
	}
	
	
	//获取所有用户,用户中有类型属性
	@RequestMapping("/getAllUser")
	@ResponseBody()
	public Msg getAllStu(@RequestParam("pageNum")int pageNum,@RequestParam("getUserType") String getUserType){
		
		List<User> userList;
		
		if(getUserType.equals("")||getUserType.equals("3")){
			PageHelper.startPage(pageNum, 5);
			userList = userService.getAllUserAndGenre();
			PageInfo allStus=new PageInfo(userList,3);
			System.out.println("查找所有用户");
			return Msg.success().add("allStus", allStus);
		}else if(getUserType.equals("0")){
			PageHelper.startPage(pageNum, 5);
			userList = userService.getBTUserAndGenre();
			PageInfo allStus=new PageInfo(userList,3);
			System.out.println("查询普通");
			return Msg.success().add("allStus", allStus);
		}else if(getUserType.equals("1")){
			PageHelper.startPage(pageNum, 5);
			userList = userService.getVipUserAndGenre();
			PageInfo allStus=new PageInfo(userList,3);
			System.out.println("查询vip");
			return Msg.success().add("allStus", allStus);
		}else if(getUserType.equals("2")){
			PageHelper.startPage(pageNum, 5);
			userList = userService.getManUserAndGenre();
			PageInfo allStus=new PageInfo(userList,3);
			System.out.println("查询vip");
			return Msg.success().add("allStus", allStus);
		}
		return Msg.fail();
	}
	
	//处理 用户的数据，总数之类 各项用户的数量
	@RequestMapping("/getUserData")
	@ResponseBody
	public Msg getUserData(){
		List<User> allUser = userService.getAllUser();
		Integer count=0;
		Integer vip=0;
		Integer bt=0;
		Integer manager=0;
		for(User u:allUser){
			count++;
			if(u.getUserGenre().equals("0")){
				bt++;
			}else if(u.getUserGenre().equals("1")){
				vip++;
			}else if(u.getUserGenre().equals("2")){
				manager++;
			}
		}
		AllUserData allUsserData=new AllUserData(count, vip, bt, manager);
		System.out.println("所有用户数据 ："+allUsserData);
		return Msg.success().add("allUsserData", allUsserData);
	}
	
	//删除用户
	@RequestMapping("/delUser")
	@ResponseBody
	public Msg delUser(@RequestParam("userId") Integer userId){
		String Message="删除用户成功";
		userService.delUser(userId);
		System.out.println("删除用户 id: "+userId);
		return Msg.success().add("Message", Message);
	}
	//升级vip用户
	@RequestMapping("/addVipUser")
	@ResponseBody
	public Msg addVipUser(@RequestParam("userId") Integer userId){
		String Message="成功升级,普通用户升级为vip用户";
		User user=userService.getUserById(userId);
		user.setUserGenre("1");
		userService.addVipUserService(user);
		System.out.println("升级vip用户 id: "+userId);
		return Msg.success().add("Message", Message);
	}
	//降级回普通用户
	@RequestMapping("/removeVipUser")
	@ResponseBody
	public Msg removeVipUser(@RequestParam("userId") Integer userId){
		String Message="成功把降级vip身份回普通用户";
		User user=userService.getUserById(userId);
		user.setUserGenre("0");
		userService.removeVipUserService(user);
		System.out.println("降级用户 id: "+userId);
		return Msg.success().add("Message", Message);
	}
	
	
	
	
	
	
	//退出登录 
	@RequestMapping("/exit")
	@ResponseBody
	public void exitLogin(HttpServletRequest request,HttpServletResponse response) throws IOException{
		User user=(User) request.getSession().getAttribute("loginUser");
		System.out.println("退出 登录 的用户："+user);
		request.getSession().removeAttribute("loginUser");
		System.out.println(request.getSession().getAttribute("loginUser"));
		response.sendRedirect(request.getContextPath());
	}
	//登录 
	@RequestMapping("/checkLogin")
	@ResponseBody
	public Msg checkLoginPwd(@RequestParam("loginPwd") String loginPwd,@RequestParam("loginName") String loginName){
		System.out.println("检查用户名和密码是否正确："+loginName+loginPwd);
		String msg=null;
		List<User> allUser = userService.getAllUser();
		for(User u:allUser){
			if((u.getEmail().equals(loginName)||u.getNickName().equals(loginName))&&u.getPassword().equals(utils.md5(loginPwd))){
				return Msg.success();
			}
		}
		return Msg.fail();
	}
	//实现登录
	@RequestMapping("/loginAction")
	public String login(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		String username=request.getParameter("username");
		System.out.println("loginAction调用："+username);
		List<User> allUser = userService.getAllUser();
		String path=request.getHeader("Referer");
		System.out.println(path);
		for(User u:allUser){
			if((u.getEmail().equals(username)||u.getNickName().equals(username))){
				request.getSession().setAttribute("loginUser", u);
				if(u.getUserGenre().equals("0")){
					System.out.println("普通用户登录 "+u.getUserGenre());
					//request.getRequestDispatcher("/newsHome.jsp").forward(request, response);
					return "userInfo";
				}
				if(u.getUserGenre().equals("1")){
					System.out.println("用户登录 "+u.getUserGenre());
					return "vipUserInfo";
				}
				if(u.getUserGenre().equals("2")){
					System.out.println("系统管理员登录 "+u.getUserGenre());
					return "managerInfo";
				}
			}
		}
		return null;
	}
}
