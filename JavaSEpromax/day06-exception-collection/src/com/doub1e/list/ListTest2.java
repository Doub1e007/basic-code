package com.doub1e.list;

import java.util.LinkedList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        //LinkList的应用
        //1.做队列
        //入队
        List<String> queue = new LinkedList<String>();
        queue.addLast("第1个客人");
        queue.addLast("第2个客人");
        queue.addLast("第3个客人");
        queue.addLast("第4个客人");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        //做栈
        List<String> stack = new LinkedList<>();
        stack.addFirst("第一颗子弹");
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");
        stack.addFirst("第五颗子弹");
        System.out.println(stack);

        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);


    }
}
