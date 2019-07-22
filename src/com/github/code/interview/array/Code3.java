package com.github.code.interview.array;

/**
 * @Title: Code3
 * @Description: LeetCode136 Single Number
 * 一个整数数组，除了某数其他数都出现两次，找出这个数
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 15:54
 */
public class Code3 {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 4, 2, 4, 5, 9};
        System.out.println(singleNumber(nums)) ;
    }
}
