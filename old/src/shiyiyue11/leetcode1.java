package shiyiyue11;

/**
 * @author Hs
 * @Date 2021/10/31 18:16
 */

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 思路：唯一的难点就是判断是否翻转后超过32位，比如111 111 111 119翻转后就超了
 *      所以判断是否result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10
 *      32位最大值：214 748 364 7
 */
public class leetcode1 {
    public int reverse(int x) {
        if (x==0) return 0;
        int result=0;
        while(x!=0){
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int t=x%10;
            x=x/10;
            result=result*10+t;
        }
        return result;
    }
}
