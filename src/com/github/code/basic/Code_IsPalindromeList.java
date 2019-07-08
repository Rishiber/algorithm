package com.github.code.basic;

import java.util.Stack;

/**
 * @Title: Code_IsPalindromeList
 * @Description: 判断一个链表是否为回文结构
 * 给定一个链表的头节点head，请判断该链表是否为回文结构。
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/8 15:14
 */
public class Code_IsPalindromeList {

    public static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    // 额外空间复杂度：O(N)
    public static boolean isPalindrome1(Node head) {
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null) {
            if (head.value != stack.pop().getValue()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    // 额外空间复杂度：O(N/2)
    public static boolean isPalindrome2(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node right = head.next;
        Node cur = head;
        while (cur.next != null && cur.next.next != null) {
            right = right.next;
            cur = cur.next.next;
        }

        Stack<Node> stack = new Stack<>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }
        while (!stack.isEmpty()) {
            if (head.value != stack.pop().getValue()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
