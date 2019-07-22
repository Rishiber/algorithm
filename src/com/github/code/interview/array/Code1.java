package com.github.code.interview.array;

import java.util.ArrayList;

/**
 * @Title: Code1
 * @Description: 有序数组中找和为S的两个数字
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 15:24
 */
// 暴力求解时间复杂度为O(N^2)，从头尾开始逼近时间复杂度为O(N),即使数组无序进行排序，时间复杂度为O(N+Nlog(N)),仍然优于暴力。
public class Code1 {

    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> test = new ArrayList<>();
        if (array == null || array.length < 2) {
            return test;
        }
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                test.add(array[i]);
                test.add(array[j]);
                return test;
            } else if (array[i] + array[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        return test;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9};
        System.out.println(FindNumbersWithSum(arr, 6));
    }
}
