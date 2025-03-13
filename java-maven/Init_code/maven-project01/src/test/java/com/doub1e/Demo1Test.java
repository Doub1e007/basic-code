package com.doub1e;

import org.junit.jupiter.api.*;

/**
 * 演示单元测试常用注解
 */
public class Demo1Test {
    @Test
    public void test1(){
        System.out.println("test...111");
    }

    @Test
    public void test2(){
        System.out.println("test...222");
    }

    @BeforeEach  //每一个测试方法执行前都会触发执行
    public void testBeforeEach(){
        System.out.println("testBeforeEach...");
    }

    @BeforeAll //在所有的测试方法之前会执行一次 一般用于资源初始化
    public static void testBeforeAll(){
        System.out.println("testBeforeAll...");
    }

    @AfterAll // 在所有的测试方法之后会执行一次 一般用于释放资源
    public static void testAfterAll(){
        System.out.println("testAfterAll...");
    }

    @AfterEach //每一个测试方法执行后都会触发执行
    public void testAfterEach(){
        System.out.println("testAfterEach...");
    }
}
