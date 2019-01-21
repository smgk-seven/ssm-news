package com.smgk.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smgk.news.bean.Collect;
import com.smgk.news.dao.CollectMapper;

@Service
public class CollectSerice {
	
	@Autowired
	private CollectMapper collectMapper;
	
	public List<Collect> getAllCollect(){
		return collectMapper.selectByExample(null);
	}
	
	public void delCollect(Integer id){
		collectMapper.deleteByPrimaryKey(id);
	}
	
	public void addCollect (Collect collect){
		collectMapper.insertSelective(collect);
	}
}
