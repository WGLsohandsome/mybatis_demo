package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.model.UserName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest//表示当前测试上下文环境为springboot
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void getAll() {
        List<UserName> list = userMapper.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    @Test
    void getById() {
        UserName userName = userMapper.getById(1);
        System.out.println(userName.toString());
    }

    @Test
    void getByName() {
        UserName userName = userMapper.getByName("is");
        System.out.println(userName.toString());
    }
}

