package com.hs.leetcode.array.bineraySearch;

import java.util.Scanner;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/5 20:52
 */
public class Questionkama44 {
    /**
     * 思路：
     *
     * 由于只能横着切或者竖着切，所以只需要使用前缀和统计rowSum[i]，heightSum[j]，也就是前i行之和，和前j列之和
     *
     * 只需要横向、竖向遍历一遍即可
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] areaValues = new int[n][m];
        int[] rowValueSum = new int[n];
        int[] heightVauleSum = new int[m];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] numStrings = scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                areaValues[i][j] = Integer.parseInt(numStrings[j]);
                rowValueSum[i] += areaValues[i][j];
            }
            if (i > 0) rowValueSum[i] += rowValueSum[i - 1];
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                heightVauleSum[j] += areaValues[i][j];
            }
            if (j > 0) {
                heightVauleSum[j] += heightVauleSum[j - 1];
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                min = Math.min(min, Math.abs(rowValueSum[n - 1] - rowValueSum[i] - rowValueSum[i]));
            }
        }
        for (int j = 0; j < m; j++) {
            if (j != m - 1) min = Math.min(min, Math.abs(heightVauleSum[m - 1] - heightVauleSum[j] - heightVauleSum[j]));
        }
        System.out.println(min);
    }
}
