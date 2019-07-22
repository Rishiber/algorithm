package com.github.code.basic;

/**
 * @Title: Code_Cow
 * @Description: 母牛每年生一只母牛，新出生的母牛成长三年后也能每年生一只母牛，假设不会死。
 * 求N年后，母牛的数量。
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/17 19:57
 */
public class Code_Cow {

    public static int cowNumber(int N) {
        if (N < 1) {
            return 0;
        }
        if (N == 1 || N == 2 || N == 3) {
            return N;
        }
        // 今年牛数量 = 去年牛数量 + 新生牛数量(三年前牛的数量，即可以生牛的牛的数量)
        return cowNumber(N - 1) + cowNumber(N - 3);
    }
}
