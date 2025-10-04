package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 管理第三方bean
 */
@Slf4j
@Configuration      // 声明该类是配置类 并交由IOC容器管理
public class CommonConfig {

    @Bean("SAXReader")            // 作用：程序启动时，会执行该方法，并将方法的返回值对象交由IOC容器管理
                     // bean的名字默认是方法名，可以通过name | value 属性设置bean的名字
    public SAXReader saxReader() {
        log.info("创建saxReader对象.....................");
        return new SAXReader();
    }
}
