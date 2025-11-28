package shiyiyue11.Nov_12;

/**
 * @author Hs
 * @Date 2021/11/12 19:50
 */

/**
 * 给定一个整数数组prices，其中第i个元素代表了第i天的股票价格 ；整数fee 代表了交易股票的手续费用。
 *
 * 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 *
 * 返回获得利润的最大值。
 *
 * 思路1：动态规划 dp[0]表示当前无股票，dp[1]表示当前有股票
 *      先保存dp[0]为m0,因为dp[0]会改变，但是计算dp[1]时需要用到dp[0]原值
 *      dp[0]=Math.max(dp[0],dp[1]+prices[i]-fee);
 *      dp[1]=Math.max(m0-prices[i],dp[1]);
 *
 * 思路2：用buy表示买入的价钱+fee，result表示累计利润
 *       如果遇到prices[i]+fee<buy，也就是第i天买比较便宜，buy=prices[i]+fee
 *       否则prices[i]>buy，即可以赚钱，就卖出
 *       result=prices[i]-buy;
 *       并且
 *       buy=prices[i]
 */
public class leetcode_714 {
    public int maxProfit(int[] prices, int fee) {
        // 思路一 动态规划
        //int[] dp=new int[2];
        //dp[0]=0;
        //dp[1]=-prices[0];
        //for(int i=1;i<prices.length;i++){
        //    int m0=dp[0];
        //    dp[0]=dp[0]>(dp[1]+prices[i]-fee)?dp[0]:dp[1]+prices[i]-fee;
        //    dp[1]=(m0-prices[i])>dp[1]?m0-prices[i]:dp[1];
        //}
        //return dp[0]>dp[1]?dp[0]:dp[1];

        // 思路二 贪心
        int buy = prices[0] + fee;
        int result = 0;
        for (int p : prices) {
            if (p + fee < buy) {
                buy = p + fee;
            } else if (p > buy) {
                result += p - buy;
                buy = p;
            }
        }
        return result;
    }
}
