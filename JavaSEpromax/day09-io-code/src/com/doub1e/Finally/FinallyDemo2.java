package com.doub1e.Finally;

import java.io.*;

public class FinallyDemo2 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try{
            //1.创建字节输入流管道与源文件接通
            is = new FileInputStream("C:\\Users\\34778\\Pictures\\Saved Pictures\\girl.jpg");
            //2. 创建一个字节输出流管道与目标文件接通
            os = new FileOutputStream("C:\\Users\\34778\\Pictures\\Saved Pictures\\girl_bak.jpg");

            //3.准备一个字节数组
            byte[] buffer = new byte[1024];

            //4.转移数据
            int len ;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            //5.释放资源
            try {
                if(os != null) os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(is != null) is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("复制成功!");
        }

    }
}
