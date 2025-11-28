package shiyiyue11.Nov_24;

import java.util.Arrays;

/**
 * @author Hs
 * @Date 2021/11/24 20:22
 */

/**
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 *
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回-1 。
 *
 * 你可以认为每种硬币的数量是无限的。
 *
 * 思路：动态规划  dp[i]表示组成金额i所需的最少硬币数，那么对于i来说，dp[i]=dp[i-coins[]]+1
 *      其中coins应该是使得dp[i-coins]最小的那个
 *      此题类同无线背包问题
 */
public class leetcode_322 {
    public int coinChange(int[] coins, int amount) {
        int length=coins.length;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<length;j++){
                if(i-coins[j]>=0){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        if(dp[amount]==amount+1) return -1;
        return dp[amount];
    }
}
