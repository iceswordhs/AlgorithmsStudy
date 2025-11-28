package twenty_days.day16;

/**
 * @author Hs
 * @Date 2021/10/17 19:12
 */

/**
 *给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1）,
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 思路：通过数学知识可得，3为最优解；所以尽可能取更多的3
 *      如果n<=3,直接返回n-1(因为必须要分段)，所以不能直接返回n
 *      如果n>3,当剩余0时，直接返回3的次方
 *              当剩余1时，由于3*1<2*2，所以分出来一个3，变成2*2
 *              当剩余2时，返回2*3的次方
 */
public class jianshengzi_offer_14_I {
    public int cuttingRope(int n) {
        if (n<3) return n-1;
        int x=n/3,y=n%3;
        if(y==0) return (int) Math.pow(3,x);
        if(y==1) return (int) Math.pow(3,x-1)*4;
        return (int) Math.pow(3,x)*2;
    }
}
