package com.github.code.interview.array;

/**
 * @Title: Code2
 * @Description: 合并两个排序的整数数组A和B变成一个新的数组
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 15:36
 */
public class Code2 {

    public static int[] mergeSortedArray(int[] A, int[] B) {
        // 新数组
        int[] C = new int[A.length + B.length];
        // 两数组的指针
        int p1 = 0;
        int p2 = 0;
        // 新数组的指针
        int p3 = 0;
        while (p1 < A.length && p2 < B.length) {
            C[p3++] = A[p1] < B[p2] ? A[p1++] : B[p2++];
        }
        while (p1 < A.length) {
            C[p3++] = A[p1++];
        }
        while (p2 < B.length) {
            C[p3++] = B[p2++];
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 9, 10, 14};
        int[] B = {2, 3, 6, 8, 11, 20};
        int[] C = mergeSortedArray(A, B);
        for (Integer c : C) {
            System.out.print(c + " ");
        }
    }
}
