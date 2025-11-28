package twenty_days.day14;

/**
 * @author Hs
 * @Date 2021/10/15 19:52
 */

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 思路：动态规划，对于一个房屋，要么偷了要么没偷，
 * 用addlast记录偷了这个房屋的结果，用noaddlast记录没偷的结果，
 * 对于每一个屋子，记录他拿和没拿的结果，等到下一个如果拿了下一个就用没拿这一个的值
 */
public class dajiajieshe298 {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int addlast=nums[0];
        int noaddlast=0;
        for(int i=1;i<nums.length;i++){
            if((noaddlast+nums[i])>addlast){// 这个需要拿，那么上一个就不需要拿，用上一个没拿的结果+nums[i]作为结果
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
