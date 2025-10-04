package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Order(3)  // 设置优先级 数字越小 优先级越高
@Slf4j
//@Aspect     // 声明切面类
//@Component
public class MyAspect2 {

    // 抽取公共切入点表达式
    @Pointcut("execution(* com.example.service.impl.DeptServiceImpl.*(..))")
    public void pt(){}

    // 目标方法前触发通知
    @Before("pt()")
    public void before(){
        log.info("MyAspect2...前置通知...");
    }

    // 无论目标方法是否有异常都会触发该通知
    @After("pt()")
    public void after(){
        log.info("MyAspect2....后置通知...");
    }
}
