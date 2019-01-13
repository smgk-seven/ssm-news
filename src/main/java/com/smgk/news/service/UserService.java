package com.smgk.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smgk.news.bean.User;
import com.smgk.news.dao.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAllUser(){
		return userMapper.selectByExample(null);
	}
	//获取vip用户包括有类目属性
	public List<User> getVipUserAndGenre(){
		return userMapper.getVipUserAndLikegenre();
	}
	//获取普通用户用户包括有类目属性
	public List<User> getBTUserAndGenre(){
		return userMapper.getBTUserAndLikegenre();
	}
	//获取管理员包括有类目属性
	public List<User> getManUserAndGenre(){
		return userMapper.getManUserAndLikegenre();
	}
	//获取所有用户包括有类目属性
	public List<User> getAllUserAndGenre(){
		return userMapper.getAllUserAndLikegenre();
	}

	public void addUser(User user) {
		userMapper.insertSelective(user);
		
	}

	public User getUser(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	//删除用户
	public void delUser(Integer userId) {
		userMapper.deleteByPrimaryKey(userId);
	}
	public User getUserById(Integer userId) {
		
		return userMapper.selectByPrimaryKey(userId);
	}
	//升级vip
	public void addVipUserService(User user) {
		userMapper.updateByPrimaryKeySelective(user);
		
	}
	//降级普通
	public void removeVipUserService(User user) {
		userMapper.updateByPrimaryKeySelective(user);
		
	}
	public void updateUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}
}
