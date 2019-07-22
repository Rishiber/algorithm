package com.github.code.interview.string;

/**
 * @Title: Code5
 * @Description: 回文字符串
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 14:09
 */
public class Code5 {

    public static boolean isHuiWen(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.toCharArray()[i] != text.toCharArray()[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "abcba";
        System.out.println(isHuiWen(text));
    }
}
