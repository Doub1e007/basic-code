package com.doub1e.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        // 1.创建Properties对象
        Properties properties = new Properties();
        // 2.加载属性文件中的键值对数据
        properties.load(new FileReader("day10-special-file-log\\src\\people.txt"));
        // 3.判断是否存在李芳 存在的话把值改成18
        if(properties.containsKey("李芳")){
            properties.setProperty("李芳",Integer.toString(18));//"18"也可
        }
        // 4.把属性文件对象 重新存入到属性文件中
        properties.store(new FileWriter("day10-special-file-log\\src\\people.txt"),"vivo 50");
    }
}
