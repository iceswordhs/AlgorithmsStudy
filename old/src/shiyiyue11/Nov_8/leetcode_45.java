package shiyiyue11.Nov_8;

/**
 * @author Hs
 * @Date 2021/11/8 20:08
 */

/**
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * 假设你总是可以到达数组的最后一个位置。
 *
 * 思路：贪心思想，用max记录每一步可以到达的最远距离，
 *      当i=cur时，表示到达了上一步可达的范围的结尾，而这时max表示在这个范围内可达的最远距离，
 *      也就是第一步能走的最大距离
 *      比如[2,3,1,1,4]，第一步走的范围是[3,1]，所以最大的距离走法是走到[3]，到达数组末尾
 */
public class leetcode_45 {
    public int jump(int[] nums) {
        int curDistance = 0;
        int output = 0;
        int nextDistance = 0;
        int max = 0;
        for(int i = 0;i < nums.length - 1;i ++){
            if(i + nums[i] >= nextDistance){
                max = i + nums[i];
            }
            nextDistance = max;
            if(i == curDistance){
                curDistance = nextDistance;
                output ++;
            }
        }
        return output;
    }
}
