package com.smgk.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smgk.news.bean.Genre;
import com.smgk.news.dao.GenreMapper;

@Service
public class GenreService {
	@Autowired
	private GenreMapper genreMapper;
	
	public List<Genre>getAllGenre(){
		return genreMapper.selectByExample(null);
	}

	public Genre getGenreById(Integer userLikeId) {
		return genreMapper.selectByPrimaryKey(userLikeId);
	}

}
