package com.doub1e.buffer_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //出师表

        try (
                // 2.创建缓冲字符输入流与源文件接通
                BufferedReader br = new BufferedReader(new FileReader("day09-io-code\\src\\csb.txt"));
                // 6.创建缓冲字符输出流与目标文件接通
                BufferedWriter bw = new BufferedWriter(new FileWriter("day09-io-code\\src\\csb_new.txt"));

        ){
            // 1.准备一个集合 存储原文段落
            List<String> data = new ArrayList<String>();

            // 3.开始按行读取 并存到集合中
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            System.out.println(data);

            // 4.对每段按照首字符编号排序
            Collections.sort(data);
            System.out.println(data);

            // 5.把排序好的集合中的每段文章写出到新文件中去 每行都换行
            for (String datum : data) {
                bw.write(datum);
                bw.newLine();
            }
            System.out.println("任务完成！");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
