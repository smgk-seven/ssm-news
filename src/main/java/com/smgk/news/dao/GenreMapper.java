package com.smgk.news.dao;

import com.smgk.news.bean.Genre;
import com.smgk.news.bean.GenreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenreMapper {
    long countByExample(GenreExample example);

    int deleteByExample(GenreExample example);

    int deleteByPrimaryKey(Integer genreId);

    int insert(Genre record);

    int insertSelective(Genre record);

    List<Genre> selectByExample(GenreExample example);

    Genre selectByPrimaryKey(Integer genreId);

    int updateByExampleSelective(@Param("record") Genre record, @Param("example") GenreExample example);

    int updateByExample(@Param("record") Genre record, @Param("example") GenreExample example);

    int updateByPrimaryKeySelective(Genre record);

    int updateByPrimaryKey(Genre record);
}