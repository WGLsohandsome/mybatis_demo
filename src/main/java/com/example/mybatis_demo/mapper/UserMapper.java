package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.model.UserName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有
    public List<UserName> getAll();

    public UserName getById(@Param("uid") Integer id);

    public UserName getByName(@Param("username") String username);

    public int add(@Param("id") int id,@Param("username") String username);
}

