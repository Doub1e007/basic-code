package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 */
@Slf4j
@SpringBootApplication
// @ComponentScan("com.doub1e") // 扫描组件 默认扫描当前包及其子包
public class TliasWebManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TliasWebManagerApplication.class, args);
		log.info("项目启动成功");
	}
}
