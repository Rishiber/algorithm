package com.github.code.interview.integer;

/**
 * @Title: Code1
 * @Description: LeetCode7 Reverse Integer
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 14:15
 */
public class Code1 {

    public static int reverse(int x) {
        // 注意这里result要用long类型
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) (result);
    }

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

}
