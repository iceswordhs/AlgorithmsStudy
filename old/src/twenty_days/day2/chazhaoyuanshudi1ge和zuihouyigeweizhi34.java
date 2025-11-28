package twenty_days.day2;

/**
 * @author Hs
 * @Date 2021/10/5 21:15
 */

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]；
 */
public class chazhaoyuanshudi1ge和zuihouyigeweizhi34 {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int[] result=new int[]{-1,-1};
        while(left<=right){
            int mid=(right-left)/2+left;
            if(nums[mid]<target){
                left=mid+1;
            } else if(nums[mid]>target){
                right=mid-1;
            } else{
                while(mid>=0&&mid<nums.length&&nums[mid]==target){
                    mid--;
                }
                result[0]=++mid;
                while(mid>=0&&mid<nums.length&&nums[mid]==target){
                    mid++;
                }
                result[1]=mid-1;
                return result;
            }
        }
        return result;
    }
}
