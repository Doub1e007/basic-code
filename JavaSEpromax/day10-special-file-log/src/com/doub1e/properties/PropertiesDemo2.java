package com.doub1e.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        //Properties把键值对数据写到属性文件中
        // 1.创建属性集对象
        Properties properties = new Properties();
        properties.setProperty("admin","666666");
        //properties.put("admin","666666");
        properties.setProperty("玄冥二老","wangfei");
        properties.setProperty("金毛狮王","成昆");
        properties.setProperty("小昭","wuji");
        System.out.println(properties);

        // 2.存储到文件中
        properties.store(new FileOutputStream("day10-special-file-log/src/user2.properties"),"i saved many users!");
    }
}
