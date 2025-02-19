package com.doub1e.Static_Util;

import java.util.Random;
//工具类 都是静态方法
public class doub1eUtil {
    private doub1eUtil(){

    }
    public static String createCode(int n){
        String code = "";//记住验证码
        String data = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //1.直接使用循环控制随机获取多少位字符 然后拼接返回即可
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //2.随机产生一个索引
            int index = r.nextInt(data.length());
            //3.提取对应索引位置处的一个字符
            char c = data.charAt(index);
            //4.拼接
            code += c;
        }
        return code;
    }
}
