package com.github.code.basic;

import java.util.HashMap;

/**
 * @Title: Code_CopyListWithRandom
 * @Description: 复制含有随机指针节点的链表
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/9 9:09
 */
public class Code_CopyListWithRandom {

    public static class Node {
        private int value;
        private Node next;
        private Node rand;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node copyListWithRand(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.value));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }
}
