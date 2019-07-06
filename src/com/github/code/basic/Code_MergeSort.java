package com.github.code.basic;

/**
 * @Title: Code_MergeSort
 * @Description: 归并排序
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/6 16:19
 */
// master公式的使用：T(N) = a*T(N/b)+O(N^d)
// 1)log(b,a) > d => 复杂度为O(N^log(b,a))
// 2)log(b,a) = d => 复杂度为O(N^d*logN)
// 3)log(b,a) < d => 复杂度为O(N^d)
public class Code_MergeSort {

    // 时间复杂度O(N*logN)，额外空间复杂度O(N)
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + (R - L) / 2;
        mergeSort(arr, L, mid);
        mergeSort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 两个必有且只有一个越界
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }
}
