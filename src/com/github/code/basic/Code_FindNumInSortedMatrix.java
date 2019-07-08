package com.github.code.basic;

/**
 * @Title: Code_FindNumInSortedMatrix
 * @Description: 在行列都排好序的矩阵中找数
 * 给定一个有N*M的整型矩阵matrix和一个整数K，matrix的每一行和每一列都是排好序的。
 * 实现一个函数，判断K是否在matrix中。
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/8 14:35
 */
public class Code_FindNumInSortedMatrix {

    // 从右上角开始找
    public static boolean isContain(int[][] matrix, int K) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == K) {
                return true;
            } else if (matrix[row][col] < K) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
