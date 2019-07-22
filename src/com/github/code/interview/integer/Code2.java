package com.github.code.interview.integer;

/**
 * @Title: Code2
 * @Description: 判断一个数是不是质数
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 14:28
 */
// 质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数
public class Code2 {

    public static boolean isPrimeNumber(int num) {
        // 2特殊处理
        if (num == 2) {
            return false;
        }
        // 小于2的数和偶数
        if (num < 2 || num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            // 被奇数整除
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println(isPrimeNumber(num));
    }
}
