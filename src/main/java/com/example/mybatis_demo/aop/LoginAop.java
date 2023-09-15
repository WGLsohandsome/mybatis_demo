package com.example.mybatis_demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
//标识当前类为界面
public class LoginAop {

    @Pointcut("execution (* com.example.mybatis_demo.controller.UserController.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("执行了前置通知");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("执行了后置通知");
    }
    @Around("pointcut()")
//    环绕通知
    public Object doAround(ProceedingJoinPoint joinPoint){
        Object result = null;
//        前置业务
        System.out.println("环绕通知的前置执行");
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println(result.toString());
//        后续业务
        System.out.println("环绕通知的后置执行");
        return result;
    }
}
