package com.github.code.interview.linklist;

/**
 * @Title: Code3
 * @Description: 反转链表
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/22 10:26
 */
/*
1.创建两个节点，pre和next;
pre保存已经反转的结点，即已反转链表头节点，next保存待反转的节点。
2.首先我们把head之后的保存起来，即next = head.next;
3.然后我们将head.next指向前面反转好的节点head.next = pre;
4.将反转好的部分保存起来pre = head;
 */
public class Code3 {

    public static class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
