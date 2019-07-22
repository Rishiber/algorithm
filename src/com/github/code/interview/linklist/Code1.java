package com.github.code.interview.linklist;

/**
 * @Title: Code1
 * @Description: LeetCode141 Linked List Cycle（判断链表是否带环）
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/22 10:15
 */
public class Code1 {

    public static class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
