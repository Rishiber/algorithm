package com.github.code.basic;

/**
 * @Title: Code_CompleteTreeNodeNumber
 * @Description: 已知一颗完全二叉树，求其节点的个数
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/11 16:17
 */
public class Code_CompleteTreeNodeNumber {

    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static int nodeNum(Node head) {
        if (head == null) {
            return 0;
        }
        return bs(head, 1, mostLeftLevel(head, 1));
    }

    public static int bs(Node node, int level, int h) {
        if (level == h) {
            return 1;
        }
        if (mostLeftLevel(node.right, level + 1) == h) {
            return (1 << (h - level)) + bs(node.right, level + 1, h);
        } else {
            return (1 << (h - level - 1)) + bs(node.left, level + 1, h);
        }
    }

    public static int mostLeftLevel(Node node, int level) {
        while (node != null) {
            level++;
            node = node.left;
        }
        return level - 1;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        System.out.println(nodeNum(head));

    }
}
