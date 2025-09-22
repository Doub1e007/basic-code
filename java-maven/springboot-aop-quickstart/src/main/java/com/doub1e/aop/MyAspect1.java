package com.doub1e.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
//@Aspect     // 声明切面类
//@Component
public class MyAspect1 {

    // 抽取公共切入点表达式
    @Pointcut("execution(* com.doub1e.service.impl.DeptServiceImpl.*(..))")
    public void pt(){}

    // 环绕通知
//    @Around("execution(* com.doub1e.service.impl.DeptServiceImpl.*(..))")
    @Around("pt()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("环绕前通知...");
        Object result = joinPoint.proceed();
        log.info("环绕后通知...");
        return result;
    }

    // 目标方法前触发通知
//    @Before("execution(* com.doub1e.service.impl.DeptServiceImpl.*(..))")
    @Before("pt()")
    public void before(){
        log.info("前置通知...");
    }

    // 无论目标方法是否有异常都会触发该通知
//    @After("execution(* com.doub1e.service.impl.DeptServiceImpl.*(..))")
    @After("pt()")
    public void after(){
        log.info("后置通知...");
    }

    // 只有目标方法正常返回 才会触发该通知
//    @AfterReturning("execution(* com.doub1e.service.impl.DeptServiceImpl.*(..))")
    @AfterReturning("pt()")
    public void afterReturning(){
        log.info("返回后通知...");
    }

    // 只有目标方法抛异常 才会触发通知
//    @AfterThrowing("execution(* com.doub1e.service.impl.DeptServiceImpl.*(..))")
    @AfterThrowing("pt()")
    public void afterThrowing(){
        log.info("异常后通知...");
    }
}
