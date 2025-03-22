package com.doub1e.reflect;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class ObjectFrame {
    // 保存任意对象的字段和其他数据到文件中
    public static void saveObject(Object obj) throws Exception {
        // 但是这个对象中有多少个字段 我们不清楚 该怎么办？ 反射!
        PrintWriter pw = new PrintWriter(new FileWriter("day-13 junit-reflect-annotation-proxy/src/obj.txt",true));
        Class c = obj.getClass();
        // 0.得知道是什么对象
        //String className = c.getName(); //com.doub1e....Student
        String className = c.getSimpleName(); // Student
        pw.println("==========" + className + "==========");
        // 1.提取这个class对象中的全部字段
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            String value = field.get(obj) + "";
            pw.println(name + "=" + value);
        }
        pw.close();
    }
}
