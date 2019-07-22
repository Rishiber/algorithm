package com.github.code.basic;

/**
 * @Title: Code_Print_All_Subsquences
 * @Description: 打印一个字符串的全部子序列，包括空字符串
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/17 19:41
 */
// 注意子序列和子串的区别
public class Code_Print_All_Subsquences {

    public static void printAllSub(char[] str, int i, String res) {
        if (i == str.length) {
            System.out.println(res);
            return;
        }
        printAllSub(str, i + 1, res);
        printAllSub(str, i + 1, res + String.valueOf(str[i]));
    }

    public static void main(String[] args) {
        String test = "abc";
        printAllSub(test.toCharArray(), 0, "");
    }
}
