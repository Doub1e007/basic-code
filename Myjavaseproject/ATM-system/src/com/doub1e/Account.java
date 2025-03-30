package com.doub1e;

public class Account {
    private String id;
    private String userName;
    private char sex;
    private String password;
    private double money;
    private double limit;//限额

    public Account() {
    }

    public Account(String id, String userName, char sex, String password, double money, double limit) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.password = password;
        this.money = money;
        this.limit = limit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName + (sex == '男' ? "先生" :"女士");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
