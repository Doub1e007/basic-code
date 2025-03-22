package com.doub1e.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestConstructor {
    @Test
    public void testGetConstructors() {
        // 1.反射第一步 必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2.获取类的全部构造器
        // Constructor[] constructors = c.getConstructors();//只能拿public的
        Constructor[] constructors = c.getDeclaredConstructors();
        // 3.遍历构造器
        for (Constructor con : constructors) {
            System.out.println(con.getName() + "===>" + con.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        // 1.反射第一步 必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2.获取类的某个构造器：无参构造器
        Constructor con1 = c.getDeclaredConstructor();//定位无参构造器
        Constructor con2 = c.getDeclaredConstructor(String.class,int.class);//定位有参构造器

        // 3.得到构造器的目的依然是初始化对象返回
        Cat c1 = (Cat) con1.newInstance();
        System.out.println(c1);

        con2.setAccessible(true); //禁止检查访问权限（暴力反射
        Cat c2 = (Cat) con2.newInstance("叮当猫", 30);
        System.out.println(c2);
    }
}
