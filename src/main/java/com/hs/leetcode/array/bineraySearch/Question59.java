package com.hs.leetcode.array.bineraySearch;

import java.util.Arrays;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/3 22:02
 */
public class Question59 {
    /**
     * 思路：
     *
     * 用4个int边界指针表示每次要填充的上下左右边界行号
     */
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int t=1;
        while(t <= n*n){
            for(int i=left; i<=right; i++){
                result[top][i] = t++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                result[i][right] = t++;
            }
            right--;
            for(int i=right; i>=left; i--){
                result[bottom][i] = t++;
            }
            bottom--;
            for(int i=bottom; i>=top; i--){
                result[i][left] = t++;
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(1)));
    }
}
