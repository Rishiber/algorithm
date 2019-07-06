package com.github.code.basic;


/**
 * @Title: Code_SelectionSort
 * @Description: 选择排序
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/5 9:28
 */
public class Code_SelectionSort {

    // 时间复杂度O(N^2)，额外空间复杂度O(1)
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
