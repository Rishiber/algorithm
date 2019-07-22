package com.github.code.interview.integer;

/**
 * @Title: Code4
 * @Description: 求一个整数的平方根
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 15:02
 */
public class Code4 {

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        int res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                res = mid;
            } else if (mid > x / mid)  {
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 35;
        System.out.println(mySqrt(x));
    }
}
