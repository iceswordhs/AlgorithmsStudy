package twenty_days.day18;

/**
 * @author Hs
 * @Date 2021/10/18 22:05
 */

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 思路：所有n位最大的数都是10的n+1次方减1
 */
public class offer_77 {
    public int[] printNumbers(int n) {
        int t=0;
        t=(int)Math.pow(10,n)-1;
        int[] result=new int[t];
        for(int i=0;i<t;i++){
            result[i]=i+1;
        }
        return result;
    }
}
