package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Order(2)
@Slf4j
//@Aspect     // 声明切面类
//@Component
public class MyAspect3 {

    // 抽取公共切入点表达式
    @Pointcut("execution(* com.example.service.impl.DeptServiceImpl.*(..))")
    public void pt(){}

    // 目标方法前触发通知
    @Before("pt()")
    public void before(){
        log.info("MyAspect3...前置通知...");
    }

    // 无论目标方法是否有异常都会触发该通知
    @After("pt()")
    public void after(){
        log.info("MyAspect3....后置通知...");
    }
}
