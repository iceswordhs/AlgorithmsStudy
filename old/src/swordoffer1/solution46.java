package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/29 20:03
 */

/**
 *给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，
 * 1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 * 思路：状态定义： 设动态规划列表 dpdp ，dp[i]dp[i] 代表以 x_ix
 * i为结尾的数字的翻译方案数量。
 * 转移方程： 若 x_ix
 * i和 x_{i-1}x
 * i−1组成的两位数字可以被翻译，则 dp[i] = dp[i - 1] + dp[i - 2]dp[i]=dp[i−1]+dp[i−2] ；
 * 否则 dp[i] = dp[i - 1]dp[i]=dp[i−1] 。
 *
 * 可被翻译的两位数区间：当 x_{i-1} = 0x
 * i−1=0 时，组成的两位数是无法被翻译的（例如 00, 01, 02, \cdots00,01,02,⋯ ），因此区间为 [10, 25][10,25] 。
 *
 *
 * 初始状态： dp[0] = dp[1] = 1dp[0]=dp[1]=1 ，即 “无数字” 和 “第 11 位数字” 的翻译方法数量均为 11 ；
 *
 * 返回值： dp[n]dp[n] ，即此数字的翻译方案数量。
 *
 * Q： 无数字情况 dp[0] = 1dp[0]=1 从何而来？
 * A： 当 numnum 第 1, 21,2 位的组成的数字 \in [10,25]∈[10,25] 时，显然应有 22 种翻译方法，
 * 即 dp[2] = dp[1] + dp[0] = 2dp[2]=dp[1]+dp[0]=2 ，而显然 dp[1] = 1dp[1]=1 ，因此推出 dp[0] = 1dp[0]=1 。
 *
 */
public class solution46 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= s.length(); i ++){
            String temp = s.substring(i-2, i);
            if(temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0)
                dp[i] = dp[i-1] + dp[i-2];
            else
                dp[i] = dp[i-1];
        }
        return dp[s.length()];
    }
}
