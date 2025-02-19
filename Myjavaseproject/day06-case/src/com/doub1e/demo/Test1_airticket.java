package com.doub1e.demo;

public class Test1_airticket {
    public static void main(String[] args) {
        //买飞机票实例
        double price = calc(1000, 9, "头等舱");
        System.out.println("优惠价是" + price);
    }
    public static double calc(double price, int month, String type ) {
        //判断是淡季还是旺季
        if(month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else {
            //淡季
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.6;
                    break;
            }
        }
        return price;
    }
}
