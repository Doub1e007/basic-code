package com.doub1e.arraylist;
//菜品类
public class Food {
    private String name;
    private double price;
    private String desc;

    public Food(String name, double price, String dec) {
        this.name = name;
        this.price = price;
        this.desc = dec;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDec() {
        return desc;
    }

    public void setDec(String dec) {
        this.desc = dec;
    }
}
