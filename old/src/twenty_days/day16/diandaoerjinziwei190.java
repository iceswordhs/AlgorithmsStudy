package twenty_days.day16;

/**
 * @author Hs
 * @Date 2021/10/17 18:29
 */

import java.util.Arrays;

/**
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 *  将这个数当做字符串处理
 *  注意：如果n=0时，n<<1还是0；所以如果前几位是0，就会造成错误，前面少了几个0，后面多了几个0
 *       所以应该用res=res|(n&1)<<(31-i)的方式
 */
public class diandaoerjinziwei190 {
    public int reverseBits(int n) {
        int[] bits=new int[33];
        int res=0;
        for(int i=0;i<32&&n!=0;i++){
            res|=(n&1)<<(31-i);
            n=n>>1;
        }
        return res;
    }
}
