package com.doub1e.annotation;

/**
 * 自定义注解
 */
public @interface MyTest {
    String name();
    double money() default 100;
    String[] author();
}
