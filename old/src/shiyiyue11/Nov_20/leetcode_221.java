package shiyiyue11.Nov_20;

/**
 * @author Hs
 * @Date 2021/11/20 17:11
 */

/**
 * 在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。
 *
 * 思路：动态规划  dp[i][j]表示以[i][j]为右下角的最大正方形的边长
 *               观察可得dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1
 */
public class leetcode_221 {
    public int maximalSquare(char[][] matrix) {
        int max=0,m=matrix.length,n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=matrix[i][0]-'0';
            if(matrix[i][0]=='1') max=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i]-'0';
            if(matrix[0][i]=='1') max=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                    continue;
                }
                dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1;
                if(dp[i][j]>max) max=dp[i][j];
            }
        }
        return max*max;
    }
}
