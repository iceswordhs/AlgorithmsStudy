package twenty_days.day2;

/**
 * @author Hs
 * @Date 2021/10/5 21:03
 */

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class xuanzhuanshuzu189 {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
