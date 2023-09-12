package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.model.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleInfoMapper {
    public int add(@Param("articleInfo") ArticleInfo articleInfo);

    public int addGetId(@Param("articleInfo")ArticleInfo articleInfo);

    public int deleteById(@Param("id")Integer id);

    public int updateTitle(@Param("id")Integer id,@Param("title")String title);
}
