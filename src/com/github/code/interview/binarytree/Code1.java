package com.github.code.interview.binarytree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Title: Code1
 * @Description: 遍历
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/22 12:08
 */
public class Code1 {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.value = value;
        }
    }

    // 前序遍历(递归)
    public static void preOrderRecur(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderRecur(root.left);
        preOrderRecur(root.right);
    }

    // 前序遍历(非递归)
    public static void preOrderUnRecur(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                System.out.print(cur.value + " ");
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
            }
        }
        System.out.println();
    }

    // 中序遍历(递归)
    public static void inOrderRecur(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderRecur(root.left);
        System.out.print(root.value + " ");
        inOrderRecur(root.right);
    }

    // 中序遍历(非递归)
    public static void inOrderUnRecur(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || root != null) {
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    System.out.print(root.value + " ");
                    root = root.right;
                }
            }
        }
        System.out.println();
    }

    // 后序遍历(递归)
    public static void posOrderRecur(TreeNode root) {
        if (root == null) {
            return;
        }
        posOrderRecur(root.left);
        posOrderRecur(root.right);
        System.out.print(root.value + " ");
    }

    // 后序遍历(非遍历)
    public static void posOrderUnRecur(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(root);
            while (!s1.isEmpty()) {
                TreeNode cur = s1.pop();
                s2.push(cur);
                if (cur.left != null) {
                    s1.push(cur.left);
                }
                if (cur.right != null) {
                    s1.push(cur.right);
                }
            }
            while (!s2.isEmpty()) {
                System.out.print(s2.pop().value +" ");
            }
        }
        System.out.println();
    }

    // 层序遍历
    public static void levelOrder(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode cur = queue.poll();
                System.out.print(cur.value +" ");
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        System.out.println();
    }
}
