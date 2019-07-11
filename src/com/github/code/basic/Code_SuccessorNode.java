package com.github.code.basic;

/**
 * @Title: Code_SuccessorNode
 * @Description: 在二叉树中找到一个节点的后继节点(中序遍历的下一个节点)
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/10 10:51
 */
public class Code_SuccessorNode {

    public static class Node {
        private int value;
        private Node parent;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node getSuccessorNode(Node node) {
        if (node == null) {
            return null;
        }
        if (node.right != null) {
            return getLeftMost(node);
        } else {
            Node parent = node.parent;
            while (parent != null && parent.left != node) {
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }

    public static Node getLeftMost(Node node) {
        if (node == null) {
            return node;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
