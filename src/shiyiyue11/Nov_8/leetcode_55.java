package shiyiyue11.Nov_8;

/**
 * @author Hs
 * @Date 2021/11/8 20:07
 */

/**
 *给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个下标。
 *
 * 思路：遍历数组，记录可达的最远距离，当最远距离大于数组长度时返回true
 */
public class leetcode_55 {
    public boolean canJump(int[] nums) {
        int max=0,t=nums.length;
        for(int i=0;i<t;i++){
            if(i<=max){
                if(max<(nums[i]+i)){
                    max=nums[i]+i;
                }
                if(max>=t-1){
                    return true;
                }
            }
        }
        return false;
    }
}
