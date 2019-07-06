package com.github.code.basic;

/**
 * @Title: Code_BubbleSort
 * @Description: 冒泡排序
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/5 9:19
 */
public class Code_BubbleSort {

    // 时间复杂度O(N^2)，额外空间复杂度O(1)
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
