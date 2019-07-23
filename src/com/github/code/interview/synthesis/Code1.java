package com.github.code.interview.synthesis;

/**
 * @Title: Code1
 * @Description: LeetCode70 Climbing Stairs
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/23 16:50
 */
public class Code1 {

    public static int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(climbStairs(n));
    }
}
