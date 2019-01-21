package com.smgk.news.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smgk.news.bean.Collect;
import com.smgk.news.bean.CollectExample;
import com.smgk.news.bean.Comments;
import com.smgk.news.bean.Genre;
import com.smgk.news.bean.News;
import com.smgk.news.bean.User;
import com.smgk.news.dao.CollectMapper;
import com.smgk.news.dao.CommentsMapper;
import com.smgk.news.dao.GenreMapper;
import com.smgk.news.dao.NewsMapper;
import com.smgk.news.dao.UserMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	private GenreMapper genreMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private NewsMapper newsMapper;
	@Autowired
	private CommentsMapper commentsMapper;
	@Autowired
	private CollectMapper collectMapper;
	
	@Test
	public void testGenre(){
		List<Genre> genreList = genreMapper.selectByExample(null);
		for(Genre g:genreList){
			System.out.println(g);
		}
	}
	@Test
	public void testUser(){
		//User user=new User(null, "smgk88", "smgk88@qq.com", "123456", "0", 5);
		//userMapper.insertSelective(user);
		/*for(int i=1;i<10;i++){
			user.setNickName("zhangsan"+i);
			user.setEmail(user.getNickName()+"@qq.com");
			user.setPassword(utils.md5("123456"));
			userMapper.insertSelective(user);
		}*/
		List<User> allStus = userMapper.getVipUserAndLikegenre();
		for(User u:allStus){
			System.out.println(u);
		}
	}
	@Test
	public void testNews(){
		/*News news = newsMapper.getNewsAndUserById(1);
		System.out.println(news.getReturnDate());
		System.out.println(news);
	*/
		
		List<News> allNews = newsMapper.getAllNewsAndUser();
		for(News n:allNews){
			System.out.println(n);
		}
		/*String str="濑尿虾";
		PageHelper.startPage(1, 5);
		List<News> allNewsAndUserByLike = newsMapper.getAllNewsByNewsKeyword(str);
		for(News n:allNewsAndUserByLike){
			System.out.println(n);
		}*/
		
		/*PageHelper.startPage(1, 5);
		List<News> allNewsByGenre = newsMapper.getAllNewsByGenre(1);
		for(News n:allNewsByGenre){
			System.out.println(n);
		}*/
		
	}
	@Test
	public void testGerne(){
		Genre genre = genreMapper.getGenreBygenreName("视频");
		System.out.println(genre);
	}
	@Test
	public void testComments(){
		/*List<Comments> allComments = commentsMapper.selectByExample(null);
		for(Comments c:allComments){
			
			System.out.println(c);
		}*/
		List<Comments> newsCommentsById = commentsMapper.getNewsCommentsById(9);
		for(Comments c:newsCommentsById){
			System.out.println(c);
		}
	}
	
	@Test
	public void testCollect(){
		CollectExample ce=new CollectExample();
		
		
		
		
	}
}


