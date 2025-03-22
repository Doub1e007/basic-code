package com.doub1e.annotation;
@MyTest(name = "从入门到入狱",money = 9.9,author = {"阿猫","阿狗"})
//@MyTest2(value = "删除")
@MyTest2("删除")
public class AnnotationDemo {

    @MyTest(name = "从入门到入狱2",money = 9.9,author = {"阿猫2","阿狗2"})
    private String name;

    @MyTest(name = "从入门到入狱",money = 9.9,author = {"阿猫","阿狗"})
    private static void main(String[] args) {
        //注解的使用
        @MyTest(name = "从入门到入狱3",money = 9.9,author = {"阿猫3","阿狗3"})
        int age = 18;

    }

}
