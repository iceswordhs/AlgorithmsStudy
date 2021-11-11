package shiyiyue11.Nov_11;

/**
 * @author Hs
 * @Date 2021/11/11 19:30
 */

/**
 * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * 思路：每天获取的利润为price[i+1]-price[i] ，那么最大利润就是每天获得的利润加起来的最大值
 *      当获取的总利润小于0时，让总利润为0
 */
public class leetcode_121 {
    public int maxProfit(int[] prices) {
        int max=0,t=0;
        for (int i=0;i<prices.length-1;i++){
            t=t+prices[i+1]-prices[i];
            if(t<0) t=0;
            max=max>t?max:t;
        }
        return max;
    }
}
