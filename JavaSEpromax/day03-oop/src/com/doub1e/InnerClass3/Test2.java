package com.doub1e.InnerClass3;

public class Test2 {
    public static void main(String[] args) {
        // 匿名内部类使用场景  通过作为一个对象参数传输给方法使用
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳贼快~");
            }
        };
        go(s1);

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳贼慢！");
            }
        });
    }
    public static void go(Swimming s) {
        System.out.println("开始...");
        s.swim();
        System.out.println("结束...");
    }

}

//需求 学生和老师一起参加游泳比赛
interface Swimming{
    void swim();
}
