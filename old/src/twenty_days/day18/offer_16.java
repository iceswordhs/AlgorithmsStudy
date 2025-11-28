package twenty_days.day18;

/**
 * @author Hs
 * @Date 2021/10/18 21:49
 */

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 *
 * 思路：使用快速幂，对于a的b次方，
 * 如果b能被2整除，也就是b的二进制最后一位为0，那么可以转化为a的平方的b/2次方
 * 如果b不能被2整除，也就是b的二进制最后一位为1，那么可以转化为a的平方的b/2次方再乘一个a
 * 按照这个思路继续下去，直到b等于0， 每进行一次a=a*a，如果最后一位为1,res=res*a
 */
public class offer_16 {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        double res=1.0;
        long t=n;// 在java中，int32 变量 n∈[−2147483648,2147483647] ，所以如果n=−2147483648会越界，所以要用long存储n
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
