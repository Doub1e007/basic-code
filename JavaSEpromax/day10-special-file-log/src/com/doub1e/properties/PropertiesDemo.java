package com.doub1e.properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        //Properties读取属性文件中的键值对数据
        // 1.创建属性集对象 代表一个属性文件
        Properties properties = new Properties();
        System.out.println(properties);

        // 2.加载属性文件信息到属性集对象中
        properties.load(new FileReader("day10-special-file-log\\src\\user.properties"));
        System.out.println(properties);

        //根据键取值
        //System.out.println(properties.get("赵敏"));
        System.out.println(properties.getProperty("赵敏"));
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "==>" + value);
        }

        // 3.遍历数据
        properties.forEach((k,v)->{
            System.out.println(k + "===>" + v);
        });
    }
}
