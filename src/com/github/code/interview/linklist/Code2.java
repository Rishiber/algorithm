package com.github.code.interview.linklist;

/**
 * @Title: Code2
 * @Description: LeetCode142 Linked List Cycle II（判断带环链表起始位置）
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/22 10:21
 */
public class Code2 {

    public static class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
