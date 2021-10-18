package twenty_days.day17;

/**
 * @author Hs
 * @Date 2021/10/18 19:10
 */

/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m - 1] 。请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 思路：和上一题一样，只是需要取模。 循环取模
 *
 * 注意：(int)res*3%mod  和 (int)(res*3%mod)不同，(int)优先级很高！！！
 */
public class jianshengzhi_offer_14_II {
    public int cuttingRope(int n) {
        if(n<=3) return n-1;
        int a=n/3,b=n%3;
        int mod=1000000007;
        long res=1;
        for(int i=1;i<a;i++){
            res=res*3;
            res=res%mod;
        }
        if(b==0) return (int)(res*3%mod);
        if(b==1) return (int)(res*4%mod);
        return (int)(res*6 % mod);
    }
}
