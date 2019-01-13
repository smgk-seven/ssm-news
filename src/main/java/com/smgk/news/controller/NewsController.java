package com.smgk.news.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smgk.news.bean.Msg;
import com.smgk.news.bean.News;
import com.smgk.news.service.NewsService;

@Controller
public class NewsController {
	@Autowired
	private NewsService newsService;
	/*
	 * newesContent)
	    console.log(newsTitle)
	    console.log(newsSummary)
	    console.log(newsTopImg)
	    console.log(newsAuthor)
	    console.log(newsGenre
	 */
	
	@RequestMapping("/addNews")
	@ResponseBody
	public Msg addNews(News news){
		news.setNewsTime(new Date());
		newsService.addNews(news);
		System.out.println(news);
	
		return Msg.success();
	}
/*	@RequestMapping("/addNews")
	@ResponseBody
	public Msg addNews(@RequestParam("newsGenre")Integer newsGenre,@RequestParam("newesContent")String newesContent,@RequestParam("newsTitle")String newsTitle,@RequestParam("newsTopImg")String newsTopImg,@RequestParam("newsSummary")String newsSummary,@RequestParam("newsAuthor")int newsAuthor){
		News news=new News(null, newsTitle, newesContent, new Date(), newsSummary, newsTopImg, newsAuthor, null, newsGenre);
		newsService.addNews(news);
		System.out.println(newesContent);
		return Msg.success();
	}
*/	
	@RequestMapping("/showNewsContent")
	@ResponseBody
	public Msg showNewsContent(@RequestParam("newsId")Integer newsId){
		News news = newsService.getNewsAndUserById(newsId);
		news.setReturnDate(news.getNewsTime().toLocaleString());
		return Msg.success().add("news", news);
	}
	
	@RequestMapping("/getAllNews")
	@ResponseBody
	public Msg getAllNews(@RequestParam("newsPageNum")Integer newsPageNum){
		PageHelper.startPage(newsPageNum, 5);
		List<News> allNewsAndUser = newsService.getAllNewsAndUser();
		PageInfo allNews=new PageInfo(allNewsAndUser,3);
		return Msg.success().add("allNews", allNews);
	}
	
	//这个是带条件件的，
	@RequestMapping("/getNews")
	@ResponseBody
	public Msg getNews(@RequestParam("newsPageNum")Integer newsPageNum,@RequestParam("showNewsType") String showNewsType){
		PageHelper.startPage(newsPageNum, 5);
		List<News> allNewsAndUser;
		if(showNewsType==""){
			System.out.println("查的所有新闻");
			allNewsAndUser = newsService.getAllNewsAndUser();
			PageInfo allNews=new PageInfo(allNewsAndUser,3);
			return Msg.success().add("allNews", allNews);
		}
		
		return Msg.success();
	}
}
