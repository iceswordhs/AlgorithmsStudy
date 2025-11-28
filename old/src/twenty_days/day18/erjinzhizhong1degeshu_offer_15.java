package twenty_days.day18;

/**
 * @author Hs
 * @Date 2021/10/18 21:05
 */

/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），
 * 返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。
 *
 * 思路：当n不等于0的时候，如果n&1为1，表示这一位为1，否则为0
 *      然后将n逻辑左移一位（注意：不能用>>,>>对于 负数 会在高位补 1 ，而>>>对于正负数都是补0）
 *
 *      或者，循环32次，每次让1<<i，然后n&(1<<i)，如果不为0，表示这一位为1
 */
public class erjinzhizhong1degeshu_offer_15 {
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            if((n&1)!=0) res++;
            n=n>>>1;// 逻辑左移一位，逻辑左移无论是正还是负，高位都补0！
        }
        return res;
    }

    //public int hammingWeight(int n) {
    //    int res=0;
    //    for(int i=0;i<32;i++){
    //        if((n&(1<<i))!=0) res++;
    //    }
    //    return res;
    //}
}
