package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 */
@SpringBootApplication
// @ComponentScan("com.doub1e") // 扫描组件 默认扫描当前包及其子包
public class TliasWebManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TliasWebManagerApplication.class, args);
	}

}
