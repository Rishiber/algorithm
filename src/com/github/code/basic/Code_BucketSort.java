package com.github.code.basic;

/**
 * @Title: Code_BucketSort
 * @Description: 桶排序
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/7 15:25
 */
public class Code_BucketSort {

    public static void bucketSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] bucket = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }
        int i = 0;
        for (int j = 0; j < bucket.length; j++) {
            while (bucket[j]-- > 0) {
                arr[i++] = j;
            }
        }
    }
}
