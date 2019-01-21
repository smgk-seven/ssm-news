package com.smgk.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smgk.news.bean.Collect;
import com.smgk.news.bean.Msg;
import com.smgk.news.service.CollectSerice;

@Controller
public class CollectController {
	@Autowired
	private CollectSerice collectService;
	
	
	//点赞功能  返回 0取消点赞   1成功点赞
	@RequestMapping("/addCollect")
	@ResponseBody
	public Msg addGivegood(@RequestParam("userId")Integer userId,@RequestParam("newsId")Integer newsId){
		Collect collect =new Collect(null, userId, newsId);
		List<Collect> allCollect = collectService.getAllCollect();
		for(Collect c:allCollect){
			if(c.getCollectNews()==newsId&&c.getCollectUser()==userId){
				collectService.delCollect(c.getCollectId());
				System.out.println("取消点赞 " +newsId);
				return Msg.success().add("message", "0");
			}
		}
		collectService.addCollect(collect);
		System.out.println("点赞 " +newsId);
		return Msg.success().add("message", "1");
	}
	
	//判断用户是否点收藏 
	@RequestMapping("/newsSFCollect")
	@ResponseBody
	public Msg newsSFGivegood(@RequestParam("userId")Integer userId,@RequestParam("newsId")Integer newsId){
		Collect collect =new Collect(null, userId, newsId);
		List<Collect> allCollect = collectService.getAllCollect();
		for(Collect c:allCollect){
			if(c.getCollectNews()==newsId&&c.getCollectUser()==userId){
				System.out.println("已点赞"+newsId);
				return Msg.success().add("message", "1");
			}
		}
		System.out.println("未点赞"+newsId);
		return Msg.success().add("message", "0");
	}
}
