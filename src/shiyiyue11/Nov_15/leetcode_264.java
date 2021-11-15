package shiyiyue11.Nov_15;

/**
 * @author Hs
 * @Date 2021/11/15 19:25
 */

/**
 * 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
 *
 * 丑数 就是只包含质因数 2、3 和 5 的正整数。
 *
 * 注意：1通常也被认为是丑数
 *
 * 思路：发现丑数都是丑数乘2、乘3、乘5得到的（除了特例 1 ）
 *      但是这样有可能有些丑数乘2大于某些丑数乘3、5，所以要记录前几个丑数 乘2、乘3、乘5
 *      如果一个数既是乘3得到又是乘5得到，乘3和乘5对应的数都要++
 */
public class leetcode_264 {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int a=0,b=0,c=0;
        for(int i=1;i<n;i++){
            int n2=dp[a]*2,n3=dp[b]*3,n5=dp[c]*5;
            dp[i]=Math.min(Math.min(n2,n3),n5);
            if(dp[i]==n2) a++;
            if(dp[i]==n3) b++;
            if(dp[i]==n5) c++;
        }
        return dp[n-1];
    }
}
