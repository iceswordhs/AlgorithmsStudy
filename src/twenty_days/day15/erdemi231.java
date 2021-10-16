package twenty_days.day15;

/**
 * @author Hs
 * @Date 2021/10/16 18:52
 */

/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
 * n可能为负数
 *
 *
 * 思路：用 n&(n-1)==0判断n是否为2的幂
 */
public class erdemi231 {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
        //return n>0&&(n&(-n))==0;

    }
}
