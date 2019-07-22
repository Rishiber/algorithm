package com.github.code.interview.string;

/**
 * @Title: Code2
 * @Description: Reverse Words in a String III
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 13:41
 */
// StringBuilder/StringBuffer 的reverse方法可以把字符串翻转,注意:String没这个方法
public class Code2 {

    public static String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            StringBuilder temp = new StringBuilder(part);
            sb.append(temp.reverse() + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
