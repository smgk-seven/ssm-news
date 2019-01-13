package com.smgk.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smgk.news.bean.Genre;
import com.smgk.news.bean.Msg;
import com.smgk.news.service.GenreService;

@Controller
public class GenreController {
	
	@Autowired
	private GenreService genreService;
	
	@RequestMapping("/getNewsGenre")
	@ResponseBody
	public Msg getNewsGenre(){
		List<Genre> genres = genreService.getAllGenre();
		System.out.println("获取所有新闻类别");
		return Msg.success().add("genres", genres);
	}

	
}
