package com.doub1e.Extends_modifier;

public class Fu {
    //1.private私有的 只能在本类访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    //2. 缺省：只能在本类 同一个包下的其他类中访问
    void Method(){
        System.out.println("缺省");
    }

    //3. protected：子类权限 可以在本类 同一个包下的其他类中访问，也可以在子孙类中访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    //4. public：公开权限 可以在本类 同一个包下的其他类中访问，也可以在子孙类中访问，还可以在不同包中访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.Method();
        f.protectedMethod();
        f.publicMethod();

    }
}
