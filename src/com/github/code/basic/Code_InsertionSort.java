package com.github.code.basic;

/**
 * @Title: Code_InsertionSort
 * @Description: 插入排序
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/5 9:34
 */
public class Code_InsertionSort {

    // 最好时间复杂度O(N)，最坏时间复杂度O(N^2)，和具体数据状况有关。额外空间复杂度O(1)
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
