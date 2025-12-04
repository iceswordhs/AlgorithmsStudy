package com.hs.leetcode.array.bineraySearch;

import java.util.Arrays;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/4 19:24
 */
public class Question146 {
    /**
     * 思路：类似螺旋矩阵，使用上下左右下标去表示当前遍历的第一行、最后一行、最右行、最左行
     *
     * 每次遍历一行或一列就增加会减少对应下标
     *
     * 本体遍历数组还需要注意矩阵可能不是方阵，行和列的遍历次数可能不一样，每次遍历一行或者一列需要判断是否已经遍历结束，防止溢出
     */
    public static int[] spiralArray(int[][] array) {
        if(array.length == 0 || array[0].length == 0) return new int[]{};
        int left = 0;
        int right = array[0].length - 1;
        int top = 0;
        int bottom = array.length - 1;
        int t = array.length * array[0].length;
        int[] result = new int[t];
        int index = 0;
        while(index<t){
            for(int i=left; i<=right; i++){
                result[index++] = array[top][i];
            }
            top++;
            if(index>=t) break;
            for(int i=top; i<=bottom; i++){
                result[index++] = array[i][right];
            }
            right--;
            if(index>=t) break;
            for(int i=right; i>=left; i--){
                result[index++] = array[bottom][i];
            }
            bottom--;
            if(index>=t) break;
            for(int i=bottom;i>=top;i--){
                result[index++] = array[i][left];
            }
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(spiralArray(new int[][]{{2,3}})));
    }
}
