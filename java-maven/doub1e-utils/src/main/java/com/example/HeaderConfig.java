package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class HeaderConfig {

    @Bean
    @ConditionalOnClass(name = "com.example.service.ServiceC")      // 检查环境中是否存在ServiceA的字节码
    public HeaderParser headerParser(){
        return new HeaderParser();
    }

    @Bean
    @ConditionalOnMissingBean       // 检查环境中是否存在指定的bean 不指定名字就是只修饰当前被修饰的bean
    public HeaderGenerator headerGenerator(){
        return new HeaderGenerator();
    }

    @Bean
    @ConditionalOnProperty(name = "doub1e",havingValue = "666")        // 检查环境中是否存在指定的属性和值
    public TokenParser tokenParser() {
        return new TokenParser();
    }
}
