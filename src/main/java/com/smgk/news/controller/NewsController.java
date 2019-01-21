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
import com.smgk.news.bean.Collect;
import com.smgk.news.bean.Comments;
import com.smgk.news.bean.GiveGood;
import com.smgk.news.bean.Msg;
import com.smgk.news.bean.News;
import com.smgk.news.bean.NewsData;
import com.smgk.news.service.CollectSerice;
import com.smgk.news.service.CommentService;
import com.smgk.news.service.GenreService;
import com.smgk.news.service.GivegoodSerice;
import com.smgk.news.service.NewsService;

@Controller
public class NewsController {
	@Autowired
	private NewsService newsService;
	@Autowired
	private GenreService genreService;
	@Autowired
	private CollectSerice collectService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private GivegoodSerice givegoodService;
	
	
	@RequestMapping("/addNews")
	//@ResponseBody
	public String addNews(News news) {
		news.setNewsTime(new Date());
		newsService.addNews(news);
		System.out.println(news);
	
		return "success";
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
	public Msg getNews(@RequestParam("newsPageNum")Integer newsPageNum,@RequestParam("showNewsType") String showNewsType,@RequestParam("showNewsKeyword")String showNewsKeyword){
		//PageHelper.startPage(newsPageNum, 5);
		//List<News> allNewsAndUser;
		/*if(showNewsType==""){
			System.out.println("查的所有新闻");
			allNewsAndUser = newsService.getAllNewsAndUser();
			PageInfo allNews=new PageInfo(allNewsAndUser,3);
			return Msg.success().add("allNews", allNews);
		}*/
		int newsGenre;
		List<News> allNewsAndUser;
		System.out.println("newsPageNum："+newsPageNum+"showNewsType："+showNewsType+"showNewsKeyword："+showNewsKeyword);
		if(showNewsType.equals("")&&showNewsKeyword.equals("")){
			System.out.println("查的所有新闻");
			PageHelper.startPage(newsPageNum, 5);
			allNewsAndUser = newsService.getAllNewsAndUser();
			PageInfo allNews=new PageInfo(allNewsAndUser,3);
			return Msg.success().add("allNews", allNews);
		}else{
			if(!showNewsType.equals("")){
				
				System.out.println("查看的新闻 类别是："+showNewsType);
				newsGenre=genreService.getGenreBygenreName(showNewsType);
				PageHelper.startPage(newsPageNum, 5);
				allNewsAndUser=newsService.getNewsByGenreId(newsGenre);
				PageInfo allNews=new PageInfo(allNewsAndUser,3);
				return Msg.success().add("allNews", allNews);
			}else if(!showNewsKeyword.equals("")){
				
				System.out.println("查看的新闻 内容是："+showNewsKeyword);
				PageHelper.startPage(newsPageNum, 5);
				allNewsAndUser=newsService.getNewsByKeyword(showNewsKeyword);
				System.out.println(showNewsKeyword);
				PageInfo allNews=new PageInfo(allNewsAndUser,3);
				return Msg.success().add("allNews", allNews);
			}
		}
		return Msg.success();
	}
	
	//获取 点赞，收藏 浏览 评论数
	@RequestMapping("/getNewsData")
	@ResponseBody
	public Msg getCommentInfo(@RequestParam("newsId")int newsId){
		int newsCommentsNum=0;
		int newsCollectNum=0;
		int newsGivegood=0;
		List<Comments> newsCommentById = commentService.getNewsCommentById(newsId);
		newsCommentsNum=newsCommentById.size();
		List<Collect> allCollect = collectService.getAllCollect();
		for(Collect c:allCollect){
			if(c.getCollectNews()==newsId){
				newsCollectNum++;
			}else{
				continue;
			}
		}
		List<GiveGood> allGivegood = givegoodService.getAllGivegood();
		for(GiveGood g:allGivegood){
			if(g.getGiveGoodNews()==newsId){
				newsGivegood++;
			}else{
				continue;
			}
		}
		NewsData newsData=new NewsData(newsCommentsNum, newsCollectNum, newsGivegood);
		return Msg.success().add("newsData", newsData);
	}
	
}
