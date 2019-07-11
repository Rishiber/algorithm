package com.github.code.basic;

import com.sun.org.apache.regexp.internal.RE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Title: Code_IsBSTAndCBT
 * @Description: 判断一棵树是否是搜索二叉树、判断一棵树是否是完全二叉树
 * 搜索二叉树：树中的任意一个节点，其左子树中的节点都比它小，右子树的节点都比它大=>中序遍历是升序的
 * 完全二叉树：1）某节点有右节点，没有左节点，一定不是完全二叉树；2）某节点有左节点，没有右节点，或者某节点没有子节点，
 * 则接下来所有节点均为叶子节点才是完全二叉树，否则不是；（层序遍历）
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/11 13:51
 */
public class Code_IsBSTAndCBT {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    // 是否为搜索二叉树
    public static boolean isBST(Node head) {
        boolean res = true;
        if (head != null) {
            int pre = Integer.MIN_VALUE;
            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    if (head.value < pre) {
                        return false;
                    }
                    pre = head.value;
                    head = head.right;
                }
            }
            return res;
        }
        return res;
    }

    // 是否为完全二叉树
    public static boolean isCBT(Node head) {
        if (head == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        boolean leaf = false;
        Node left = null;
        Node right = null;
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll();
            left = head.left;
            right = head.right;
            if ((leaf && (left != null || right != null)) || (left == null && right != null)) {
                return false;
            }
            if (left != null) {
                queue.offer(left);
            }
            if (right != null) {
                queue.offer(right);
            }
            if (left == null || right == null) {
                leaf = true;
            }
        }
        return true;
    }

}
