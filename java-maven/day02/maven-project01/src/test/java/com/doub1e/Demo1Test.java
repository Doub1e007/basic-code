package com.example;

import org.junit.jupiter.api.*;

/**
 * 常用注解
 */
public class Demo1Test {
    @Test
    public void test1(){
        System.out.println("test111..");
    }

    @BeforeEach
    public void testBeforeEach(){
        System.out.println("testBeforeEach..");
    }

    @AfterEach
    public void testAfterEach(){
        System.out.println("testAfterEach..");
    }
    @BeforeAll
    public static void testBeforeAll(){
        System.out.println("testBeforeAll..");
    }

    @AfterAll
    public static void testAfterAll(){
        System.out.println("testAfterAll..");
    }
}
