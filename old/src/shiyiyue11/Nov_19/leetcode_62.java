package shiyiyue11.Nov_19;

/**
 * @author Hs
 * @Date 2021/11/19 19:59
 */

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 * 思路1：动态规划 dp[i][j]代表走到[i][j]有多少种不同的路径
 *               dp[i][j]=dp[i-1][j]+dp[i][j-1]
 *               注意边界：令i=0，或j=0的全部为1，意为出发之后一步不走只有一种情况
 * 思路2：数学方法  从左上角走到右下角共走了m+n-2步，如果想走到右下角，只可能向下走m-1步，向右走n-1步
 *                所以就是从m+n-2中挑出m-1步共有多少种情况 结果为(m+n−2)!/((m−1)!(n−1)!)
 *
 */
public class leetcode_62 {
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }
    // 动态规划
    //public int uniquePaths(int m, int n) {
    //    int[][] dp=new int[m][n];
    //    for(int i=0;i<m;i++){
    //        dp[i][0]=1;
    //    }
    //    for(int i=0;i<n;i++){
    //        dp[0][i]=1;
    //    }
    //    for(int i=1;i<m;i++){
    //        for(int j=1;j<n;j++){
    //            dp[i][j]=dp[i-1][j]+dp[i][j-1];
    //        }
    //    }
    //    return dp[m-1][n-1];
    //}
}
