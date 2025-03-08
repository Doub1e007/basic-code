package com.doub1e.list;

import java.util.StringJoiner;

/*
* 单链表
* */
public class MyLinkedList<E> {

    private int size = 0;

    MyLinkedList.Node<E> first; //头指针

    //定义节点类 用于创建节点对象 封装节点数据和下个节点对象的地址值
    public static class Node<E> {
        E item;
        Node<E> next; //下个节点地址

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
    public boolean add(E e) {
        //维护单链表
        //第一个节点 或者是后面的节点
        //创建一个节点对象 封装这个数据

        Node<E> newNode = new Node<E>(e, null);

        //判断这个节点是否是第一个节点
        if(first == null) {
            first = newNode;
        }else {
            //把这个节点加入到当前最后一个节点的下一个位置
            //如何找到最后一个节点对象
            Node<E> tmep = first;
            while(tmep.next != null) {
                tmep = tmep.next;
            }
            tmep.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringJoiner sb = new StringJoiner(",","[","]");
        Node<E> tmep = first;
        while(tmep != null) {
            sb.add(tmep.item + "");
            tmep = tmep.next;
        }
        return sb.toString();
    }

    public int size(){
        return size;
    }
}

class Test{
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list);
    }
}
