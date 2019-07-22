package com.github.code.interview.string;

/**
 * @Title: Code4
 * @Description: 把字符串转换成整数
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 * 输出描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 13:53
 */
public class Code4 {

    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int start;
        int tag = 0;
        if (str.charAt(0) == '+') {
            // 正数，计数从第二位开始
            tag = 1;
            start = 1;
        } else if (str.charAt(0) == '-') {
            // 负数，计数从第二位开始
            tag = 0;
            start = 1;
        } else {
            // 无符号数，默认为正数，计数从第一位开始
            tag = 1;
            start = 0;
        }

        long result = 0;
        for (int i = start; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= '0' && temp <= '9') {
                result = result * 10 + temp - '0';
                if (tag == 1 && result > Integer.MAX_VALUE) {
                    throw new RuntimeException("上溢出");
                }
                if (tag == 0 && result < Integer.MIN_VALUE) {
                    throw new RuntimeException("下溢出");
                }
            } else {
                return 0;
            }
        }
        if (tag == 0) {
            return (int) (-1 * result);
        } else {
            return (int) (result);
        }
    }

    public static void main(String[] args) {
        String s = "-2147483647";
        System.out.println(StrToInt(s));
    }
}
