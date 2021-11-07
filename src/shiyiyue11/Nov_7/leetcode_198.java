package shiyiyue11.Nov_7;

/**
 * @author Hs
 * @Date 2021/11/7 12:13
 */

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 思路：一个房屋要么偷，要么不偷，保存不偷上次和偷了这次的值进行比较，以此判断是否要偷
 */
public class leetcode_198 {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int addlast=nums[0];
        int noaddlast=0;
        for(int i=1;i<nums.length;i++){
            if((noaddlast+nums[i])>addlast){// 这个需要拿
                int t=noaddlast;
                noaddlast=addlast;
                addlast=t+nums[i];
            }else{
                noaddlast=addlast;
            }
        }
        return addlast;
    }
}
