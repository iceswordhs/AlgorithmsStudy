package shiyiyue11.Nov_24;

/**
 * @author Hs
 * @Date 2021/11/24 21:00
 */

/**
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 *
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 *
 * 假设每一种面额的硬币有无限个。 
 *
 * 题目数据保证结果符合 32 位带符号整数。
 *
 * 思路：动态规划 注意：为了避免同一种解法因为硬币的顺序问题导致重复
 *      所以需要固定硬币顺序  在外层遍历硬币数组就可以固定硬币顺序
 */
public class leetcode_518 {
    public int change(int amount, int[] coins) {
        int length=coins.length;
        int[] dp=new int[amount+1];
        dp[0]=1;
        // 外层遍历硬币，这样可以确定硬币顺序，因为将前面的硬币都用过了，后面不会再用了
        // 比如 1 2 5 先用1，这样只要包含1的解，1都会在前面
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i]+=dp[i-coin];
            }
        }
        return dp[amount];
    }
}
