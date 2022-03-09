package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 13:57
 */

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *
 * 思路：二分查找到目标数，然后分别向前向后查找，直到值与目标值不相同
 */
public class Solution_34 {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int[] result=new int[]{-1,-1};
        // 搜索的区间是 [0,nums.length-1]
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>nums[mid]){
                left=mid+1;
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                while(mid>0&&nums[mid]==nums[mid-1]){
                    mid--;
                }
                result[0]=mid;
                while(mid<nums.length-1&&nums[mid]==nums[mid+1]){
                    mid++;
                }
                result[1]=mid;
                return result;
            }
        }
        return result;
    }
}
