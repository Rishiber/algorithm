package com.github.code.interview.binarytree;

/**
 * @Title: Code3
 * @Description: 对称的二叉树（剑指Offer）
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/22 14:34
 */
public class Code3 {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static boolean isSymmetrical(TreeNode root) {
        return is(root, root);
    }

    public static boolean is(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.value == t2.value) {
            return is(t1.left, t2.right) && is(t1.right, t2.left);
        } else {
            return false;
        }
    }
}
