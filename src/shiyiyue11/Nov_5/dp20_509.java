package shiyiyue11.Nov_5;

/**
 * @author Hs
 * @Date 2021/11/5 20:39
 */

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 * 也就是：
 *
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 *
 * 思路：保存前2位，按照规则计算
 */
public class dp20_509 {
    public int fib(int n) {
        int res=0;
        if(n<2) return n;
        int low=0,high=1,t=1;
        for(int i=2;i<=n;i++){
            t=high+low;
            low=high;
            high=t;
        }
        return t;
    }
}
