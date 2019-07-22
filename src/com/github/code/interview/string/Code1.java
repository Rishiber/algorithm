package com.github.code.interview.string;

/**
 * @Title: Code1
 * @Description: LeetCode151 Reverse Words in a String
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 13:31
 */
public class Code1 {

    public static String reverseWords(String s) {
        String[] parts = s.trim().split(" +");
        StringBuilder out = new StringBuilder();
        for (int i = parts.length - 1; i > 0; i--) {
            out.append(parts[i] + " ");
        }
        out.append(parts[0]);
        return out.toString();
    }

    public static void main(String[] args) {
        String s = "the sky  is  blue";
        System.out.println(reverseWords(s));
    }
}
