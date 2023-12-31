package com.example.mybatis_demo.controller;

import com.example.mybatis_demo.model.UserName;
import com.example.mybatis_demo.service.UserService;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getall")
    public List<UserName> getUsers(){
        return userService.getAll();
    }


}
