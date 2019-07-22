package com.github.code.basic;

/**
 * @Title: Code_Hanoi
 * @Description: 汉诺塔问题
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/17 19:22
 */
// T(n) = T(n-1) + 1 + T(n-1)
// 时间复杂度O(2^n )
public class Code_Hanoi {

    // N: 1~N
    public static void process(int N, String from, String to, String help) {
        if (N == 1) {
            System.out.println("Move 1 from " + from + " to " + to);
        } else {
            process(N - 1, from, help, to);
            System.out.println("Move " + N + " from " + from + " to " + to);
            process(N - 1, help, to, from);
        }
    }

    public static void main(String[] args) {
        process(4 , "左", "右", "中");
    }
}
