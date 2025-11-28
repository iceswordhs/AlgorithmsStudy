package shiyiyue11.Nov_5;

/**
 * @author Hs
 * @Date 2021/11/5 20:41
 */

/**
 * 泰波那契序列 Tn 定义如下： 
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 *
 * 思路：记录前3位，按规则计算
 */
public class dp21_1137 {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<3) return 1;
        int low=0,mid=1,high=1,t=1;
        for(int i=3;i<=n;i++){
            t=low+mid+high;
            low=mid;
            mid=high;
            high=t;
        }
        return t;
    }
}
