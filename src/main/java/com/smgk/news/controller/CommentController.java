package com.smgk.news.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smgk.news.bean.Comments;
import com.smgk.news.bean.Msg;
import com.smgk.news.service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	//发表评论
	@RequestMapping("/addComment")
	@ResponseBody
	public Msg addComment(@RequestParam("newsId")int newsId,@RequestParam("userId")int userId,@RequestParam("CommentContent")String CommentContent){
		Comments comments=new Comments(null, CommentContent, new Date(), userId, newsId);
		System.out.println("评论："+comments);
		commentService.addComment(comments);
		return Msg.success();
	}
	
	//获取所有评论
	@RequestMapping("/getNewsComment")
	@ResponseBody
	public Msg addComment(@RequestParam("newsId")int newsId){
		System.out.println("获取文章的评论："+newsId);
		List<Comments> allNewsComments = commentService.getNewsCommentById(newsId);
		return Msg.success().add("allNewsComments", allNewsComments);
	}
	
	
}
