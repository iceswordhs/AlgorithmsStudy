package shiyiyue11.Nov_14;

/**
 * @author Hs
 * @Date 2021/11/14 18:48
 */

/**
 * 如果一个数列 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 *
 * 例如，[1,3,5,7,9]、[7,7,7,7] 和 [3,-1,-5,-9] 都是等差数列。
 * 给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。
 *
 * 子数组 是数组中的一个连续序列。
 *
 * 思路：判断以num[i]为结尾的等差队列大小，为3的时候，数组个数为t=1，每多一位就多了t++个
 */
public class leetcode_413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int result=0,d,tmp=0;
        int length=nums.length;
        if(length<3) return 0;
        d=nums[1]-nums[0];
        for(int i=2;i<length;i++){
            if(nums[i]-nums[i-1]==d){
                tmp++;
            }else{
                d=nums[i]-nums[i-1];
                tmp=0;
            }
            result+=tmp;
        }
        return result;
    }
}
