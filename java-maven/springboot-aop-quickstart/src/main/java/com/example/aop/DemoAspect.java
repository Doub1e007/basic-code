package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

@Slf4j
//@Aspect     // 声明当前类是一个AOP类(切面类
//@Component
public class DemoAspect {
    /**
     * 统计耗时
     * @return
     */
    @Around("execution(* com.doub1e.service.impl.DeptServiceImpl.*(..))")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        // 1.获取方法运行时的开始时间
        long begin = System.currentTimeMillis();

        // 2.运行原始方法
        Object result = joinPoint.proceed();

        // 3.获取方法运行结束后的时间 计算耗时
        long end = System.currentTimeMillis();
        log.info("执行耗时：{}ms",end - begin);

        // 返回响应结果
        return result;
    }
}
