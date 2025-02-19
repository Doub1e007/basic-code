package com.doub1e.Override;

public class Tiger extends Animal{
    //方法重写 名称和参数列表必须与被重写的方法相同
    //子类重写父类方法时 访问权限必须大于等于父类该方法的权限（public > protected > default > private）
    @Override //重写的校验注解 ：安全 优雅
    public void run(){
        System.out.println("老虎跑得贼快");
    }
}
