package shiyiyue11.Nov_20;

/**
 * @author Hs
 * @Date 2021/11/20 16:29
 */

/**
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 思路：动态规划  由于只能向左或向下移动，所以第一行和第一列都是固定的
 *      计算剩余部分即可  可以将空间复杂度减到O(n)
 */
public class leetcode_64 {
    // 空间复杂度未优化
    //public int minPathSum(int[][] grid) {
    //    int min=0,m=grid.length,n=grid[0].length;
    //    int[][] dp=new int[m][n];
    //    dp[0][0]=grid[0][0];
    //    for(int i=1;i<m;i++){
    //        dp[i][0]=dp[i-1][0]+grid[i][0];
    //    }
    //    for(int i=1;i<n;i++){
    //        dp[0][i]=dp[0][i-1]+grid[0][i];
    //    }
    //    for(int i=1;i<m;i++){
    //        for(int j=1;j<n;j++){
    //            dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
    //        }
    //    }
    //    return dp[m-1][n-1];
    //}
    // 空间复杂度优化后
    public int minPathSum(int[][] grid) {
        int min=0,m=grid.length,n=grid[0].length;
        int[] f=new int[n];
        f[0]=grid[0][0];
        for(int i=1;i<n;i++){
            f[i]=f[i-1]+grid[0][i];
        }
        for(int i=1;i<m;i++){
            f[0]+=grid[i][0];
            for(int j=1;j<n;j++){
                f[j]=Math.min(f[j-1],f[j])+grid[i][j];
            }
        }
        return f[n-1];
    }
}
