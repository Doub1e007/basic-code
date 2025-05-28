package com.doub1e;

import org.junit.jupiter.api.*;

/**
 * 演示单元测试常用注解
 */
public class Demo1Test {
    @Test
    public void test1() {
        System.out.println("test111...");
    }
    @Test
    public void test2() {
        System.out.println("test222...");
    }

    @BeforeEach  //每一个测试方法执行前都会触发
    public void testBeforeEach() {
        System.out.println("before each...");
    }

    @AfterEach
    public void testAfterEach() {
        System.out.println("after each...");
    }

    @BeforeAll // 在所有的测试方法之前会执行一次 一般用于资源初始化
    public static void testBeforeAll() {
        System.out.println("before all...");
    }

    @AfterAll // 在所有的测试方法之后执行一次 一般用于资源释放
    public static void testAfterAll() {
        System.out.println("after all...");
    }
}
