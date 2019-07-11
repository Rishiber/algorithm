package com.github.code.basic;

/**
 * @Title: Code_IsBalancedTree
 * @Description: 判断一棵二叉树是否是平衡二叉树
 * 平衡二叉树：树中的任意一个节点，对应左子树和右子树的高度差不超过1
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/11 10:44
 */
public class Code_IsBalancedTree {

    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class ReturnData {
        private boolean isB;
        private int h;

        public ReturnData(boolean isB, int h) {
            this.isB = isB;
            this.h = h;
        }
    }

    // 递归套路
    public static ReturnData process(Node head) {
        if (head == null) {
            return new ReturnData(true, 0);
        }
        ReturnData leftData = process(head.left);
        if (!leftData.isB) {
            return new ReturnData(false, 0);
        }
        ReturnData rightData = process(head.right);
        if (!rightData.isB) {
            return new ReturnData(false, 0);
        }
        if (Math.abs(leftData.h - rightData.h) > 1) {
            return new ReturnData(false, 0);
        }
        return new ReturnData(true, Math.max(leftData.h, rightData.h) + 1);
    }

    public static boolean isBalance(Node head) {
        return process(head).isB;
    }
}
