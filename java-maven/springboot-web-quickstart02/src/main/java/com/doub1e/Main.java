package com.doub1e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * SpringBootWeb应用创建方式二（基于Maven
 *      1.创建一个Maven项目
 *      2.pom文件中，继承springboot父工程，添加web依赖
 *      3.创建启动类，类上添加注释@SpringBootApplication，定义main方法，里面运行SpringApplication
 *      4.定义请求处理类，定义方法。需在类上加注解@RestController，方法加注解@RequestMapping()
 *      5.运行启动类，测试
 */

/**
 * 启动类
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Hello World");

    }
}