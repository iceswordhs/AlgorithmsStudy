package twenty_days.day14;

/**
 * @author Hs
 * @Date 2021/10/15 19:43
 */

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 思路：当n>2时，它的前一步可以是跳了1阶或者跳了两阶，
 * 如果跳了1阶，那么他已经跳了n-1阶，有climbStairs(n-1)种可能
 * 如果跳了2阶，那么他已经跳了n-2阶，有climbStairs(n-2)种可能
 * 所以n阶有climbStairs(n-1)+climbStairs(n-2)种可能
 * 用p记录climbStairs(n-1)，用q记录climbStairs(n-2)，r为他们的和
 */
public class palouti70 {
    public int climbStairs(int n) {
        if(n<2) return n;
        int q=1,p=1,r=1;// q代表n-1，p代表n-2的值,r代表n-1的值
        for(int i=2;i<=n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
