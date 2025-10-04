package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableHeaderConfig     // 封装@Import注解，等价下面一行 @Import(MyImportSelector.class)
// @Import(MyImportSelector.class)         // 导入ImportSelector接口实现类
// @ComponentScan({"com.example","com.doub1e"})   // 打破了默认扫描路径，默认扫描启动类所在包及其子包，需一并声明
// @Import(HeaderConfig.class)         // 导入配置类
// @Import({HeaderParser.class,HeaderGenerator.class})     // 导入普通类
@Slf4j
@SpringBootApplication  //等价下面三个之和
/**
 * @SpringBootConfiguration：
 *      @Configuration -- 用来声明配置类
 * @EnableAutoConfiguration：开启自动配置
 *      @Import({AutoConfigurationImportSelector.class})
 *
 * @ComponentScan：扫描组件的注解，默认扫描启动类所在包及其子包
 */
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
