package shieryue12.Dec_08;

/**
 * @author Hs
 * @Date 2021/12/8 21:17
 */

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 思路：双指针
 */
public class leetcode_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int fast=1,low=1;
        while(fast<nums.length){
            if(nums[fast]!=nums[fast-1]){
                nums[low]=nums[fast];
                low++;
            }
            fast++;
        }
        return low;
    }
}
