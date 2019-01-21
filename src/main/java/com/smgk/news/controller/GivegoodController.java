package com.smgk.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smgk.news.bean.Collect;
import com.smgk.news.bean.GiveGood;
import com.smgk.news.bean.Msg;
import com.smgk.news.service.GivegoodService;

@Controller
public class GivegoodController {
	
	@Autowired
	private GivegoodService givegoodService;
	
	
	//点赞功能  返回 0取消点赞   1成功点赞
		@RequestMapping("/addGivegood")
		@ResponseBody
		public Msg addGivegood(@RequestParam("userId")Integer userId,@RequestParam("newsId")Integer newsId){
			GiveGood givegood=new GiveGood(null, userId, newsId);
			List<GiveGood> allGivegoods = givegoodService.getAllGivegoods();
			for(GiveGood c:allGivegoods){
				if(c.getGiveGoodNews()==newsId&&c.getGiveGoodUser()==userId){
					givegoodService.delCollect(c.getGiveGoodId());
					System.out.println("取消点赞 " +newsId);
					return Msg.success().add("message", "0");
				}
			}
			givegoodService.addCollect(givegood);
			System.out.println("点赞 " +newsId);
			return Msg.success().add("message", "1");
		}
		
		//判断用户是否点过赞
		@RequestMapping("/newsSFGivegood")
		@ResponseBody
		public Msg newsSFGivegood(@RequestParam("userId")Integer userId,@RequestParam("newsId")Integer newsId){
			GiveGood givegood=new GiveGood(null, userId, newsId);
			List<GiveGood> allGivegoods = givegoodService.getAllGivegoods();
			for(GiveGood c:allGivegoods){
				if(c.getGiveGoodNews()==newsId&&c.getGiveGoodUser()==userId){
					System.out.println("已点赞"+newsId);
					return Msg.success().add("message", "1");
				}
			}
			System.out.println("未点赞"+newsId);
			return Msg.success().add("message", "0");
		}
}
