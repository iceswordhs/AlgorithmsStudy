package shiyiyue11;

/**
 * @author Hs
 * @Date 2021/10/31 18:45
 */

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 * 思路：如果是负数就直接返回false，否则翻转
 */
public class leetcode9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int result=0;
        int original=x;
        while(x!=0){
            int t=x%10;
            x=x/10;
            result=result*10+t;
        }
        return result==original;
    }
}
