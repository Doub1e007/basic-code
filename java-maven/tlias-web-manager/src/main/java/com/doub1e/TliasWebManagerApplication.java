package com.doub1e;
/**
 * 启动类
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//ComponentScan 扫描组件，默认扫描当前包及其子包
public class TliasWebManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TliasWebManagerApplication.class, args);
    }

}
