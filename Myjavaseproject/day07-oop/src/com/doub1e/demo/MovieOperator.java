package com.doub1e.demo;

import java.util.Scanner;

//电影操作对象
public class MovieOperator {
    //1.获取全部的电影对象
    private Movie[] movie;
    public MovieOperator(Movie[] movie){
        this.movie = movie;
    }

    //2.提供方法 展示全部电影 根据id查询电影对象

    public void showAllMovie() {
        System.out.println("====全部电影信息====");
        for (int i = 0; i < movie.length; i++) {
            //得到当前电影
            Movie m = movie[i];
            System.out.println(m.getId() + "\t" + m.getName()+ "\t" + m.getPrice() + "\t" + m.getActor());
            
        }
    }

    public void getMovieById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的电影id：");
        int id = sc.nextInt();
        System.out.println("你要查询的电影信息如下：");
        for (int i = 0; i < movie.length; i++) {
            //得到当前电影
            Movie m = movie[i];
            if(m.getId() == id){
                System.out.println(m.getId() + "\t" + m.getName()+ "\t" + m.getPrice() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("无该电影");
    }
}
