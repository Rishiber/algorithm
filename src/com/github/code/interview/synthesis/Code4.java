package com.github.code.interview.synthesis;

/**
 * @Title: Code4
 * @Description: 二分查找
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/23 17:13
 */
public class Code4 {

    public static int binarySearch(int[] arr, int des) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low +(high - low) / 2;
            if (arr[mid] == des) {
                return mid;
            } else if (arr[mid] < des) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,11,15,17};
        int des = 15;
        System.out.println(binarySearch(arr, des));
    }
}
