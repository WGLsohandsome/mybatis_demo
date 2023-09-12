package com.example.mybatis_demo.service;

import com.example.mybatis_demo.mapper.UserMapper;
import com.example.mybatis_demo.model.UserName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserName> getAll(){
        return userMapper.getAll();
    }
}
