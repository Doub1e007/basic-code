package com.itheima.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Dog();
        //编译看左边 运行看右边
        a.eat();
        //多态弊端
        //不能调用子类特有功能
        //a.lookHome(); //报错原因，当调用成员方法时 编译看左边运行看右边
        //若在编译的时候会检查左边的父类中有没有这个方法，如果没有直接报错

        //解决方案：变回子类类型
        //细节：转换的时候不能瞎转，如果转成其他类的类型就会报错

//        Dog d = (Dog) a;
//        d.lookHome();
        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.lookHome();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        }else {
            System.out.println("没有这个类型");
        }
    }
}
class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
