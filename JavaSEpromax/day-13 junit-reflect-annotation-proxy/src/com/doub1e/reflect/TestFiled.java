package com.doub1e.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 获取类的成员变量 并对其进行操作
 */
public class TestFiled {
    @Test
    public void testGetFileds() throws Exception{
        // 1.反射第一步 得到类的Class对象
        Class c = Cat.class;
        // 2.获取类的全部成员变量
        Field[] fields = c.getDeclaredFields();
        // 3.遍历这个成员变量数组
        for (Field field : fields) {
            System.out.println(field.getType() + "===>" + field.getName());
        }

        // 4.定位某个成员变量
        Field fname = c.getDeclaredField("name");

        // 5.成员变量的目的是：取值和赋值
        Cat cat = new Cat();

        fname.setAccessible(true); //暴力反射

        fname.set(cat,"哆啦A梦");
        String name = (String) fname.get(cat);
        System.out.println(name);
    }
}
