package com.github.code.interview.linklist;

/**
 * @Title: Code4
 * @Description: 合并排序链表（剑指Offer）
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/22 10:33
 */
public class Code4 {

    public static class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        ListNode head = null;
        ListNode cur = null;
        //处理头节点
        if (head1.value < head2.value) {
            head = head1;
            cur = head1;
            head1 = head1.next;
        } else {
            head = head2;
            cur =head2;
            head2 = head2.next;
        }

        // 处理循环
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                cur.next = head1;
                cur = head1;
                head1 = head1.next;
            } else {
                cur.next = head2;
                cur = head2;
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            cur.next = head1;
        }
        while (head2 != null) {
            cur.next = head2;
        }
        return head;
    }
}
