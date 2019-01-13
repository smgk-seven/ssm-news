package com.smgk.news.dao;

import com.smgk.news.bean.GiveGood;
import com.smgk.news.bean.GiveGoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiveGoodMapper {
    long countByExample(GiveGoodExample example);

    int deleteByExample(GiveGoodExample example);

    int deleteByPrimaryKey(Integer giveGoodId);

    int insert(GiveGood record);

    int insertSelective(GiveGood record);

    List<GiveGood> selectByExample(GiveGoodExample example);

    GiveGood selectByPrimaryKey(Integer giveGoodId);

    int updateByExampleSelective(@Param("record") GiveGood record, @Param("example") GiveGoodExample example);

    int updateByExample(@Param("record") GiveGood record, @Param("example") GiveGoodExample example);

    int updateByPrimaryKeySelective(GiveGood record);

    int updateByPrimaryKey(GiveGood record);
}