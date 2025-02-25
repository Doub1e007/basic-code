package com.doub1e.Enum;
//枚举类
public enum A {
    //枚举类的第一行必须罗列的是枚举类对象的名称
    X,Y,Z;
    //其他成员
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
