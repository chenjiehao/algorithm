package com.bilusi.algorithm.other;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: algorithm
 * @description: 两个链表是否有合并
 * @author: bilusi
 * @create: 2020-09-18 17:18
 **/
public class HasCycle {
    public static void main(String[] args) {

        ListNode listNode = new ListNode();
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();


        listNode.data = 0;
//        listNode.next=listNode2;
        listNode1.data = 1;
        listNode1.next=listNode;

        listNode2.data = 0;
        listNode2.next = listNode1;

        listNode3.data = 0;
        listNode3.next = listNode2;
        System.out.println(test(listNode3));
    }


    public static boolean test(ListNode node) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (node != null) {
            if (nodesSeen.contains(node)) {
                return true;
            } else {
                nodesSeen.add(node);
            }
            node = node.next;
        }
        return false;

    }
}
