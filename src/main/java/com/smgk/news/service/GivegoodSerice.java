package com.smgk.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smgk.news.bean.GiveGood;
import com.smgk.news.dao.GiveGoodMapper;

@Service
public class GivegoodSerice {
	@Autowired
	private GiveGoodMapper giveGoodMapper;
	
	public List<GiveGood> getAllGivegood(){
		return giveGoodMapper.selectByExample(null);
	}
}
