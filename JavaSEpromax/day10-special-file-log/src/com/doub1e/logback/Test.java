package com.doub1e.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
        // 1.创建一个Logback框架的Logger日志对象
        public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");

        public static void main(String[] args) {
            // 使用Logback为系统记录日志
            try{
                LOGGER.info("除法开始");
                chu(10,2);
                LOGGER.info("除法执行成功");
            }catch (Exception e){
               LOGGER.error("除法执行失败：" + e.getMessage());
            }
        }
        public static void chu(int a,int b){
            LOGGER.debug("参数a:" + a);
            LOGGER.debug("参数b:" + b);
            int c = a / b ;
            LOGGER.info("结果c是:" + c);
        }
}
