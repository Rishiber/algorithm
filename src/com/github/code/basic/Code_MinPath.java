package com.github.code.basic;

/**
 * @Title: Code_MinPath
 * @Description: 给你一个二维数组，二维数组中的每个数都是正数，要求从左上角走到右下角，每一步只能向右或者向下。
 * 沿途经过的数字要累加起来。返回最小的路径和。
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/17 20:09
 */
public class Code_MinPath {

    public static int process(int[][] matrix, int i, int j) {
        int res = matrix[i][j];
        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            return res;
        }
        if (i == matrix.length - 1 && j != matrix[0].length - 1) {
            return res + process(matrix, i, j + 1);
        }
        if (i != matrix.length - 1 && j == matrix[0].length - 1) {
            return res + process(matrix, i + 1, j);
        }
        return res + Math.max(process(matrix, i, j + 1), process(matrix, i + 1, j));
    }

    public static void main(String[] args) {
        int[][] m = { { 1, 3, 5, 9 }, { 8, 1, 3, 4 }, { 5, 0, 6, 1 }, { 8, 8, 4, 0 } };
        System.out.println(process(m, 0, 0));
    }
}
