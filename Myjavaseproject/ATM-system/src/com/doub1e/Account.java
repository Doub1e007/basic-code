package com.doub1e;

public class Account {
    private String CardId;
    private String userName;
    private char sex;
    private String password;
    private double money;
    private double limit;//限额

    public Account() {
    }

    public Account(String CardId, String userName, char sex, String password, double money, double limit) {
        this.CardId = CardId;
        this.userName = userName;
        this.sex = sex;
        this.password = password;
        this.money = money;
        this.limit = limit;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String CardId) {
        this.CardId = CardId;
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
