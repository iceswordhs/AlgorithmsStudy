package shiyiyue11;

/**
 * @author Hs
 * @Date 2021/10/31 19:02
 */

/**
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * 思路：用t记录赚的钱，并用max保存t的最大值
 *      当t<0时，前面的就没有意义了，让t=0
 */
public class heat121 {
    public int maxProfit(int[] prices) {
        int max=0;
        int t=0;
        for(int i=0;i<prices.length-1;i++){
            t=t+prices[i+1]-prices[i];
            if(t<0) t=0;
            if(t>max) max=t;
        }
        return max;
    }
}
