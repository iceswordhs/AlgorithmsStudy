package shiyiyue11.Nov_6;

/**
 * @author Hs
 * @Date 2021/11/6 18:36
 */

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 思路：投票法，用一个数记录某个值出现的次数，如果遇见与他相同的值就+1，否则-1
 *                      并记录这个值
 */
public class leetcode_169 {
    public int majorityElement(int[] nums) {
        int t=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(t==0) {
                temp=nums[i];
                t++;
            }
            else t+=temp==nums[i]?1:-1;
        }
        return temp;
    }
}
