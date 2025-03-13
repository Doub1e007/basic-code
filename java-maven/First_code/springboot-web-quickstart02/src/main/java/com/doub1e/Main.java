package com.doub1e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 基于Maven创建SpringBootWeb
 * 1.创建一个Maven项目
 * 2.pom文件继承springboot父工程，添加web依赖
 * 3.创建启动类 类上加上注释@SpringApplication 定义Main方法 里面运行SpringApplication.run(xxx.class, args);
 * 4.定义请求处理类 定义方法 需要在类上加注解 @RestController 方法上加注解@RequestMapping("url")
 * 5.运行启动类 测试
 */

/**
 * 启动类
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        System.out.println("Hello, World!");
    }
}