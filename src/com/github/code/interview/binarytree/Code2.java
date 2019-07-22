package com.github.code.interview.binarytree;

/**
 * @Title: Code2
 * @Description: LeetCode226 Invert Binary Tree（反转二叉树）
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/22 14:23
 */
public class Code2 {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
