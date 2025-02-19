public class Student {
    double score;

    public void print(){
        //this就是一个变量 哪个对象要调用这个方法 this就是哪个对象
        System.out.println("this:" + this);
    }

    //java希望代码见名知意
    //但是见面知意可能引起局部变量和成员变量名称冲突
    //如果希望区分开，可以在变量前面加上this，代表访问的是对象的成员变量

    public void pass(double score){
        if(this.score >= score){
            System.out.println("考上了哈尔滨佛学院");
        }else{
            System.out.println("和尚也看不上你");
        }
    }
}
