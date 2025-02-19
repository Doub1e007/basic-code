package com.doub1e.demo;

public class Test {
    public static void main(String[] args) {
        //掌握电影信息的开发
        //1.每个电影是一个电影对象 首先要设计电影类 用于创建电影对象 封装电影数据
        //2.准备电影对象数据（电影信息
        Movie[] movie = new Movie[5];
        //int[] ages = new int[5];
        movie[0] = new Movie(1,"复仇者联盟4",50,"漫威影业");
        movie[1] = new Movie(2,"哪吒2",19.9,"饺子");
        movie[2] = new Movie(3,"流浪地球",29.9,"郭帆");
        movie[3] = new Movie(4,"流浪地球2",29.9,"郭帆");
        movie[4] = new Movie(5,"误杀",30,"陈思诚");
        //3.把电影对象数据交给电影操作对象进行业务处理
        MovieOperator operator = new MovieOperator(movie);
        operator.showAllMovie();
        operator.getMovieById();
    }
}
