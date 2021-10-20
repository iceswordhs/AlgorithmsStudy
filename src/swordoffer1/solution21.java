package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/20 17:11
 */

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 *  思路：模仿快速排序，使用首尾指针，如果nums[left]&1==1则表示左端为奇数，left++
 *       如果nums[right]&1==0表示右端为偶数，right--
 *       然后交换两者的位置
 */
public class solution21 {
    public int[] exchange(int[] nums) {
        int left=0,right=nums.length-1;// 使用快排思路
        while(left<right){
            while(left<=right&&(nums[left]&1)==1){// 如果是奇数，就++
                left++;
            }
            while(right>=left&&(nums[right]&1)==0){// 如果是偶数，就--
                right--;
            }
            if(left<right){
                int t=nums[left];
                nums[left]=nums[right];
                nums[right]=t;
            }
        }
        return nums;
    }
}
