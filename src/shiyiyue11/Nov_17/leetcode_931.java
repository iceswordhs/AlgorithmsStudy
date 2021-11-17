package shiyiyue11.Nov_17;

/**
 * @author Hs
 * @Date 2021/11/17 21:03
 */

/**
 * 给你一个 n x n 的 方形 整数数组 matrix ，请你找出并返回通过 matrix 的下降路径 的 最小和 。
 *
 * 下降路径 可以从第一行中的任何元素开始，并从每一行中选择一个元素。
 * 在下一行选择的元素和当前行所选元素最多相隔一列（即位于正下方或者沿对角线向左或者向右的第一个元素）。
 * 具体来说，位置 (row, col) 的下一个元素应当是 (row + 1, col - 1)、(row + 1, col) 或者 (row + 1, col + 1) 。
 *
 * 思路：动态规划，dp[i][j]代表到达这一行这一列的最小值，根据上一行对应的3个位置的最小值 + matrix[i][j]得到
 */
public class leetcode_931 {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        int[] f = new int[n+2];
        f[0] = f[n+1] = Integer.MAX_VALUE;
        for(int j = 1; j <= n; j++) f[j] = matrix[0][j-1];
        for(int i = 1; i < m;i++){
            int temp = 0,last = Integer.MAX_VALUE;
            for(int j = 1; j <= n; j++){
                temp = f[j] ;
                f[j] = Math.min(Math.min(last,f[j]),f[j+1])+matrix[i][j-1];
                last = temp;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j = 1; j <= n; j++) min = Math.min(min,f[j]);
        return min;
    }
}
