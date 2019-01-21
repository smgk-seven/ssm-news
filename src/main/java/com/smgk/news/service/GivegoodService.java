package com.smgk.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smgk.news.bean.GiveGood;
import com.smgk.news.dao.GiveGoodMapper;
@Service
public class GivegoodService {
	
	@Autowired
	private GiveGoodMapper giveGoodMapper;
	
	public List<GiveGood> getAllGivegoods(){
		return giveGoodMapper.selectByExample(null);
	}
	
	public void delCollect(Integer id){
		giveGoodMapper.deleteByPrimaryKey(id);
	}
	
	public void addCollect (GiveGood giveGood){
		giveGoodMapper.insertSelective(giveGood);
	}	
}
