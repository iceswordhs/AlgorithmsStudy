package shiyiyue11.Nov_6;

/**
 * @author Hs
 * @Date 2021/11/6 18:31
 */

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 思路：当有n阶时，有两种情况可以到达n阶：1.n-1阶爬1阶  2.n-2阶爬2阶
 *      所以共有 f(n-1)+f(n-2)种情况
 */
public class leetcode_70 {
    public int climbStairs(int n) {
        if(n<2) return n;
        int q=1,p=0,r=1;// q代表n-1，p代表n-2的值,r代表上一个
        for(int i=2;i<=n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
