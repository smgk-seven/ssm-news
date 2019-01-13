package com.smgk.news.dao;

import com.smgk.news.bean.News;
import com.smgk.news.bean.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    long countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
    
    News getNewsAndUserById(Integer newsId);
    
    List<News> getAllNewsAndUser();
    
    List<News> getAllNewsAndUserByLike(@Param("title") String title,@Param("content") String content);
}