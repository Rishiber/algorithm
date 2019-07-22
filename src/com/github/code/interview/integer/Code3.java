package com.github.code.interview.integer;

/**
 * @Title: Code3
 * @Description: 输入一个整数，输出该数二进制中表示1的个数
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 14:54
 */
public class Code3 {

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(NumberOf1(n));
    }
}
