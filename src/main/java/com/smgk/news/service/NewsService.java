package com.smgk.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smgk.news.bean.News;
import com.smgk.news.dao.NewsMapper;

@Service
public class NewsService {
	
	@Autowired
	private NewsMapper newsMapper;
	
	public void addNews(News news) {
		newsMapper.insertSelective(news);
		
	}

	public News getNewsById(int newsId) {
		return newsMapper.selectByPrimaryKey(newsId);
		
	}

	public News getNewsAndUserById(Integer newsId) {
		return newsMapper.getNewsAndUserById(newsId);
	}

	public List<News> getAllNewsAndUser() {
		return newsMapper.getAllNewsAndUser();
	}

	public List<News> getNewsByGenreId(int newsGenre) {
		// TODO Auto-generated method stub
		return newsMapper.getAllNewsByGenre(newsGenre);
	}

	public List<News> getNewsByKeyword(String showNewsKeyword) {
		// TODO Auto-generated method stub
		return newsMapper.getAllNewsByNewsKeyword(showNewsKeyword);
	}
	
}
