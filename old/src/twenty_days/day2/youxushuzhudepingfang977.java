package twenty_days.day2;

/**
 * @author Hs
 * @Date 2021/10/5 19:58
 */

/**
 * 977
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 *
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 已按 非递减顺序 排序
 */
public class youxushuzhudepingfang977 {
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqr=new int[nums.length];
        int left=0,right=nums.length-1;
        int r=nums.length-1;
        while(left<=right){
            int leftsqr=nums[left]*nums[left];
            int rightsqr=nums[right]*nums[right];
            if(rightsqr>leftsqr){
                right--;
                sqr[r]=rightsqr;
                r--;
            } else {
                left++;
                sqr[r]=leftsqr;
                r--;
            }
        }
        return sqr;
    }
}
