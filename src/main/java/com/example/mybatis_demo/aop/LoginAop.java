package com.example.mybatis_demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
//标识当前类为界面
public class LoginAop {

    @Pointcut("execution(* com.example.mybatis_demo.controller.UserController.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("执行了前置通知");
    }

}
