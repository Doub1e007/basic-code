package com.doub1e.Abstract_Demo2;

public abstract class People {
    public final void write(){
        //模板方法设计模式（不能被重写 建议用final保护
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t我的爸爸还是阔以，他是这样的一个人，让我介绍一下");
        //所有子类都要写正文 但是每个子类写的情况是不一样的 就可以把正文书写定义成抽象方法
        //具体实现交给子类
        writeMain();
        System.out.println("\t有这样的爹真好");
    }
    public abstract void writeMain();
}
