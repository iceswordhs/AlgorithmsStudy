package twenty_days.day10;

/**
 * @author Hs
 * @Date 2021/10/11 21:40
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 思路：当n+1时，他只有跳一阶和跳两阶两种选择，
 * 如果跳一阶，在这一步前，有f(n)种可能，
 * 如果跳两阶，在这一步前，有f(n-1)种可能
 * 共有f(n)+f(n-1)两种情况
 */
public class qingwatiaotaijiewenti_offer_10_II {
    public int numWays(int n) {
        if(n<2) return 1;
        int p=1,q=1,result=1;
        for(int i=2;i<=n;i++){
            p=q;
            q=result;
            result=(p+q)%1000000007;
        }
        return result;
    }
}
