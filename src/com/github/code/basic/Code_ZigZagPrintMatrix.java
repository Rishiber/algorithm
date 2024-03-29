package com.github.code.basic;

/**
 * @Title: Code_ZigZagPrintMatrix
 * @Description: ”之”字形打印矩阵
 * 给定一个矩阵matrix，按照”之”字形的方式打印这个矩形，例如：1 2 3 4 5 6 7 8 9 10 11 12
 * ”之”字形打印的结果为：1,2,5,9,6,3,4,7,10,11,8,12
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/8 14:06
 */
public class Code_ZigZagPrintMatrix {

    public static void printMatrixZigZag(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = 0;
        int dC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while (tR != endR + 1) {
            printLevel(matrix, tR, tC, dR, dC, fromUp);
            // tR,tC,dC,dR顺序要注意
            tR = tC == endC ? tR + 1 : tR;
            tC = tC == endC ? tC : tC + 1;
            dC = dR == endR ? dC + 1 : dC;
            dR = dR == endR ? dR : dR + 1;
            fromUp = !fromUp;
        }
        System.out.println();
    }

    public static void printLevel(int[][] matrix, int tR, int tC, int dR, int dC, boolean f) {
        if (f) {
            while (tR != dR + 1) {
                System.out.print(matrix[tR++][tC--] + " ");
            }
        } else {
            while (dR != tR - 1) {
                System.out.print(matrix[dR--][dC++] + " ");
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        printMatrixZigZag(matrix);
    }
}
