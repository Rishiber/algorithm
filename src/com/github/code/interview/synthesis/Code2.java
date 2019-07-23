package com.github.code.interview.synthesis;

/**
 * @Title: Code2
 * @Description: 变态跳台阶（剑指Offer）
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/23 16:55
 */
public class Code2 {

    public static int JumpFloorII(int target) {
        if (target == 0 || target == 1) {
            return target;
        }
        return 2 * JumpFloorII(target - 1);
    }

    public static void main(String[] args) {
        int target = 10;
        System.out.println(JumpFloorII(target));
    }
}
