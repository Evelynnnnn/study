package com.shilei.algm.subject;

import static com.shilei.algm.subject.ListNode.listNode;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(listNode);
        System.out.println(reverse(listNode));
    }

    public static ListNode reverse(ListNode head){
        if (head.next == null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
