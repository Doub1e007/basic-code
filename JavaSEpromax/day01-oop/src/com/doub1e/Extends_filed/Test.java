package com.doub1e.Extends_filed;

public class Test {
    public static void main(String[] args) {
        //继承后 子类访问成员的特点 就近原则
        Zi z = new Zi();
        z.showName();

    }
}
class Zi extends FU{
    String name = "子类名称";
    public void showName(){
        String name = "局部名称";
        System.out.println(name);
        System.out.println(this.name); //访问子类的成员name
        System.out.println(super.name); //访问父类的成员name
    }
}
class FU{
    String name = "父类名称";
}