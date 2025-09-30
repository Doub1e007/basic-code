package com.doub1e;

import lombok.extern.slf4j.Slf4j;
import org.dom4j.io.SAXReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class SpringbootWebConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebConfigApplication.class, args);
    }

    // 不推荐
//    @Bean       // 作用：程序启动时，会执行该方法，并将方法的返回值对象交由IOC容器管理
//    public SAXReader saxReader(){
//        log.info("创建saxReader对象...");
//        return new SAXReader();
//    }
}
