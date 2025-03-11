package com.doub1e.Finally;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FinallyDemo3 {
    public static void main(String[] args) {
        // try-with-resource JDK7之后
        try(
                // 这里只能放置资源对象 用完会自动调用资源的close方法关闭资源
                //1.创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream("C:\\Users\\34778\\Pictures\\Saved Pictures\\girl.jpg");
                //2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("C:\\Users\\34778\\Pictures\\Saved Pictures\\girl_bak.jpg");
        ){
            //3.准备一个字节数组
            byte[] buffer = new byte[1024];

            //4.转移数据
            int len ;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
