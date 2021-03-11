package com.shilei.algm.subject;

import lombok.Data;

@Data
public class ListNode {

    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public static ListNode listNode;

    static {
        ListNode node = new ListNode(0); //创建首结点
        listNode = node;
        for (int i = 0; i < 6; i++) {
            ListNode newNode = new ListNode(6-i);  //创建新的结点
            listNode.next = newNode;     // 把新结点连起来
            listNode = listNode.next;
        }
        listNode = node;
    }
}
