package shiyiyue11.Nov_11;

/**
 * @author Hs
 * @Date 2021/11/11 17:33
 */

/**
 * 给你一个正整数数组 values，其中 values[i]表示第 i 个观光景点的评分，并且两个景点i 和j之间的 距离 为j - i。
 *
 * 一对景点（i < j）组成的观光组合的得分为 values[i] + values[j] + i - j ，也就是景点的评分之和 减去 它们两者之间的距离。
 *
 * 返回一对观光景点能取得的最高分。
 *
 * 思路：values[i] + values[j] + i - j  = value[i]+i +value[j]-j
 *      对于j来说，value[j]-j是不变的，所以保存j之前的value[i]+i的最大值即可得到该市自
 */
public class leetcode_1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int max=0,mx=values[0]-0;
        for (int i=0;i<values.length;i++){
            max=max>(i+values[i]+mx)?max:(i+values[i]+mx);
            mx=mx>(values[i]-i)?mx:(values[i]-i);
        }
        return max;
    }
}
