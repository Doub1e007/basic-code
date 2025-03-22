package com.doub1e.reflect;

/**
 * 使用反射技术 设计一个保存对象的简易框架
 */
public class TestFrame {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("江南普信男",45,'男',185.5,"篮球，唱跳rap");
        Teacher t1 = new Teacher("河北老师",999.9);

        // 把任意对象的字段名和其对应的值等信息保存到文件中
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(t1);
    }
}
