package com.doub1e.Extends_filed;

public class Test2 {
    public static void main(String[] args) {
        //
        Zi2 z = new Zi2();
        z.go();
    }
}
class Zi2 extends Fu2{
    @Override
    public void run(){
        System.out.println("子类跑的贼溜");
    }

    public void go(){
        run();//子类的
        super.run();//父类的
    }
}
class Fu2{
    public void run(){
        System.out.println("父类跑");
    }
}