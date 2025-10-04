package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 * 演示切入点表达式
 * execution(访问修饰符? 返回值 包名.类名.?  方法名(方法参数) thorw 异常?)
 * @annotation(注解的全限定名)
 */
//@Order(Integer.MIN_VALUE)
@Order(1)  // 设置优先级
@Slf4j
@Aspect     // 声明切面类
//@Component
public class MyAspect5 {

    // 抽取公共切入点表达式
    //@Pointcut("execution(public void com.doub1e.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    // 可以省略访问修饰符
    //@Pointcut("execution( void com.doub1e.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    // 可以省略包名
    //@Pointcut("execution( void delete(java.lang.Integer))")

    // *代表单个任意的符号 可以作用在返回值、包名、类名、方法名、参数上
    //@Pointcut("execution( * com.*.service.*.DeptServiceImpl.delete(*))")
    // .. 代表任意个字符，一般用在参数上，还可以用在包上
//    @Pointcut("execution( * com..DeptServiceImpl.delete(..))")

    // 需求：只给list方法和getById方法添加通知，对于一些特殊的没有共性的方法，可以通过连接符 || && 拼接表达式
    //@Pointcut("execution( * com..DeptServiceImpl.list(..)) || execution( * com..DeptServiceImpl.getById(..))")

    @Pointcut("@annotation(com.example.aop.Log)")
    public void pt(){}

    // 目标方法前触发通知
    @Before("pt()")
    public void before(){
        log.info("MyAspect5...前置通知...");
    }

    // 无论目标方法是否有异常都会触发该通知
    @After("pt()")
    public void after(){
        log.info("MyAspect5....后置通知...");
    }
}
