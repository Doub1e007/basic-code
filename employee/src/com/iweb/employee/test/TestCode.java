package com.iweb.employee.test;


import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.core.lang.Console;

public class TestCode {
    public static void main(String[] args) {
        //定义图形验证码的长和宽
        //LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100,4,10);

//图形验证码写出，可以写出到文件，也可以写出到流
        //lineCaptcha.write("e:/直线.png");

        //定义图形验证码的长、宽、验证码字符数、干扰元素个数
        //CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 20);
//CircleCaptcha captcha = new CircleCaptcha(200, 100, 4, 20);
//图形验证码写出，可以写出到文件，也可以写出到流
        //captcha.write("e:/circle.png");

        //定义图形验证码的长、宽、验证码字符数、干扰线宽度
        ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(200, 100, 4, 4);
//ShearCaptcha captcha = new ShearCaptcha(200, 100, 4, 4);
//图形验证码写出，可以写出到文件，也可以写出到流
        captcha.write("e:/shear.png");




    }
}
