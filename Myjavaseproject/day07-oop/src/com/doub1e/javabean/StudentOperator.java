package com.doub1e.javabean;
//作为学生对象的业务操作对象
public class StudentOperator {
    //1.接收到要操作的学生对象
    private Student s;
    public StudentOperator(Student s){
        this.s = s;
    }

    //2.打印成绩是否及格

    public void printPass() {
        if(s.getScore() >= 60){
            System.out.println(s.getName() + "及格了");
        }else{
            System.out.println(s.getName() + "挂科了");
        }
    }
}
