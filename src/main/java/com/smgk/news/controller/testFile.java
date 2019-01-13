package com.smgk.news.controller;
import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.smgk.news.bean.User;

@Controller
public class testFile {
	@RequestMapping("/testimageupload")
	public String uploadImage(HttpServletRequest request ,User user,MultipartFile pictureFile) throws Exception{
		System.out.println("uploadImage执行方法");
		//使用UUID给图片重命名，并去掉四个“-”
		//String name = UUID.randomUUID().toString().replaceAll("-", "");
		
		//设置图片上传路径
		String url = request.getSession().getServletContext().getRealPath("/static/images");
		System.out.println(url);
		//以绝对路径保存重名命后的图片
		pictureFile.transferTo(new File(url+"/"+"aaa" + "." + "png"));
		//把图片存储路径保存到数据库
		//重定向到查询所有用户的Controller，测试图片回显
		return "index";
		
	}
}
