package com.smgk.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smgk.news.bean.Comments;
import com.smgk.news.dao.CommentsMapper;

@Service
public class CommentService {
	
	@Autowired
	private CommentsMapper commentsMapper;
	
	public void addComment(Comments comments) {
		commentsMapper.insertSelective(comments);
	}

	public List<Comments> getNewsCommentById(int newsId) {
		return commentsMapper.getNewsCommentsById(newsId);
	}
	
	
}
