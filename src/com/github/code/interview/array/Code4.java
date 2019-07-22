package com.github.code.interview.array;

import java.util.Arrays;

/**
 * @Title: Code4
 * @Description: 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 17:04
 */
public class Code4 {

    public static int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        if (len < 1) {
            return 0;
        }
        int count = 0;
        Arrays.sort(array);
        int num = array[len / 2];
        for (int i = 0; i < len; i++) {
            if (num == array[i]) {
                count++;
            }
        }
        if (count > len / 2) {
            return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
