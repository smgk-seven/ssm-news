package com.smgk.news.dao;

import com.smgk.news.bean.User;
import com.smgk.news.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //查找所有用户并带喜欢类别信息
    List<User> getAllUserAndLikegenre();
    //查找vip用户带类别
    List<User> getVipUserAndLikegenre();
    //查找普通用户带类别
    List<User> getBTUserAndLikegenre();
    //查找管理员带类别
    List<User> getManUserAndLikegenre();
}