package shiyiyue11.Nov_1;

/**
 * @author Hs
 * @Date 2021/11/1 20:58
 */

/**
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 *
 * 思路：x&(x-1)可以去掉最后一位1，这样比x=x>>>1要快
 *
 * 思路2：可以这样想，对于i来说，它的1的个数为i&(i-1)的1的个数+1
 */
public class leetcode338 {
    public int[] countBits(int n) {
        //int[] result=new int[n+1];
        //for(int i=0;i<=n;i++){
        //    int t=i;
        //    while(t!=0){
        //        result[i]++;
        //        t=t&(t-1);
        //    }
        //}
        //return result;

        /**
         * 思路2 高级算法
         */
        int[] result=new int[n+1];
        for(int i=1;i<=n;i++){
            result[i]=result[i&(i-1)]+1;
        }
        return result;
    }
}
