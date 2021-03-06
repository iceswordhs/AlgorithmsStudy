package shiyiyue11.Nov_12;

/**
 * @author Hs
 * @Date 2021/11/12 19:22
 */

/**
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 *
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 *
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 *
 * 思路：f[i]为第i天累计收益，根据题目描述，由于我们最多只能同时买入一支股票，并且卖出股票后有冷却期的限制
 *      所以共有3种状态
 *      当我们目前有一支股票时，对应的累计最大收益记为f[i][0]
 *      当我们目前处于冷却期时，对应的累计最大收益记为f[i][1]
 *      当我们目前没有股票时，对应的累计最大收益记为f[i][2]
 *      状态转移方程如下：
 *      1.当目前有股票时，这支股票可能是i-1天就有的(f[i-1][0])，也可能是i天买入的(f[i-1][2]-price[i])
 *      取他们的较大值
 *      f[i][0]=Math.max(f[i-1][0],f[i-1][2]-price[i])
 *      2.当目前处于冷却期时，只可能是i-1天卖出了
 *      f[i][1]=f[i-1][0]+price[i]
 *      3.当目前无股票时，可能是i-1天为冷却期，也可能是i-1天无股票
 *      f[i-1][2]=Math.max(f[i-1][1],f[i-1][2])
 *
 *      最后返回Math.max(f[n-1][1],f[n-1][2])即可，因为第n-1天，即最后一天手上有股票没有意义
 */
public class leetcode_309 {
    /**
     * 因为发现f[i]只与前一个有关，所以只需要用一个一维数组即可
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        int[] dp=new int[3];
        dp[0]=-prices[0];
        dp[1]=0;
        dp[2]=0;
        for(int i=1;i<n;i++){
            // 因为后面需要改变dp[0],dp[1]的值，但是在dp[1],dp[2]的状态转移方程中还需要用到原有的dp[0],dp[1]，所以保存dp[0],dp[1]
            int m0=dp[0],m1=dp[1];
            dp[0]=m0>(dp[2]-prices[i])?m0:dp[2]-prices[i];
            dp[1]=m0+prices[i];
            dp[2]=m1>dp[2]?m1:dp[2];
        }
        return dp[1]>dp[2]?dp[1]:dp[2];
    }
}
