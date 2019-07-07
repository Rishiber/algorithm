package com.github.code.basic;

/**
 * @Title: Code_NetherlandsFlag
 * @Description: 荷兰国旗问题
 * 给定一个数组arr，和一个数num，请把小于num的数放在数组的左边，等于num的数放在数组中间，大于num的数放在数组的右边
 * 要求额外空间复杂度O(1)，时间复杂度O(N)
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/7 8:46
 */
public class Code_NetherlandsFlag {

    public static int[] partition(int[] arr, int L, int R, int num) {
        int less = L - 1;
        int more = R + 1;
        int cur = L;
        while (cur < more) {
            if (arr[cur] < num) {
                swap(arr, ++less, cur++);
            } else if (arr[cur] > num) {
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
