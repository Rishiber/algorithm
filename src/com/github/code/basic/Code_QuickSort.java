package com.github.code.basic;

/**
 * @Title: Code_QuickSort
 * @Description: 随机快速排序
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/7 9:30
 */
public class Code_QuickSort {

    // (概率上)时间复杂度O(N*logN)，额外空间复杂度O(logN)
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R + 1;
        int cur = L;
        int key = arr[R];
        while (cur < more) {
            if (arr[cur] < key) {
                swap(arr, ++less, cur++);
            } else if (arr[cur] > key) {
                swap(arr, --more, cur);
            } else {
                cur++;
            }
        }
        return new int[] {less + 1, more - 1};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
