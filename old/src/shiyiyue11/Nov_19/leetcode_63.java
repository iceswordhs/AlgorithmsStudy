package shiyiyue11.Nov_19;

/**
 * @author Hs
 * @Date 2021/11/19 20:55
 */
public class leetcode_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0;
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //obstacleGrid[i][j]==0 表示这个位置不是阻碍，可以达到
                //j>=1代表是否可以由前一个往右走得到
                //obstacleGrid[i][j-1]代表前一个不是阻碍，可以由前一个忘右走得到
                //至于从上往下走的情况，f[i]并不是0，而是上一个元素的方案数，已经保存了
                if(obstacleGrid[i][j]==0&&j>=1&&obstacleGrid[i][j-1]!=0)
                    dp[j]+=dp[j-1];
            }
        }
        return dp[n-1];
    }
}
