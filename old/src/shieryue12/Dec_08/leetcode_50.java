package shieryue12.Dec_08;

/**
 * @author Hs
 * @Date 2021/12/8 21:17
 */

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
 *
 * 思路：快速幂
 * 当次方大于0时 次方除以2，乘数变成当前乘数的平方
 * 如果当前次方为奇数，结果乘以当前乘数
 */
public class leetcode_50 {
    public double myPow(double x, int n) {
        long t=n;
        if(x==0) return 0;
        double res=1.0;
        if(t<0){
            x=1/x;
            t=-t;
        }
        while(t>0){
            if((t&1)==1) res*=x;
            x=x*x;
            t=t>>1;
        }
        return res;
    }
}
