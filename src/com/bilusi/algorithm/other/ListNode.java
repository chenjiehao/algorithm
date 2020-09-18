package com.bilusi.algorithm.other;

/**
 * @program: algorithm
 * @description: 单链表
 * @author: bilusi
 * @create: 2020-09-18 17:28
 **/
public class ListNode {
    public ListNode next;
    public Object data;


    public ListNode(){

    }
    public ListNode(Object data){
        this.data=data;
    }

    public ListNode(Object data,ListNode next){
        this.data=data;
        this.next=next;
    }


}
