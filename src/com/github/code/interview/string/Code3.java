package com.github.code.interview.string;

/**
 * @Title: Code3
 * @Description: 统计字符串字母，数字，空格和其他字符的个数
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/21 13:45
 */
public class Code3 {

    public static void testString(String s) {
        char[] chars = s.toCharArray();
        int character = 0;
        int digital = 0;
        int blank = 0;
        int other = 0;

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                character++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                digital++;
            } else if (chars[i] == ' ') {
                blank++;
            } else {
                other++;
            }
        }

        System.out.println("字母个数：" + character);
        System.out.println("数字个数：" + digital);
        System.out.println("空格个数：" + blank);
        System.out.println("其他字符个数：" +other);
    }

    public static void main(String[] args) {
        String test="abc 123 ABC";
        testString(test);
    }
}
