package shiyiyue11.Nov_7;

/**
 * @author Hs
 * @Date 2021/11/7 12:14
 */

/**
 *你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。
 * 这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的
 * 。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，今晚能够偷窃到的最高金额。
 *
 * 思路：分为两种情况处理，要么偷第一个，要么不偷
 */
public class leetcode_213 {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int addlast=0;
        int noaddlast=0;
        for(int i=1;i<nums.length;i++){// 不拿第一个
            if((noaddlast+nums[i])>addlast){// 这个需要拿
                int t=noaddlast;
                noaddlast=addlast;
                addlast=t+nums[i];
            }else{
                noaddlast=addlast;
            }
        }
        int temp=addlast;
        addlast=nums[0];
        noaddlast=0;
        for(int i=1;i<nums.length-1;i++){// 拿第一个
            if((noaddlast+nums[i])>addlast){// 这个需要拿
                int t=noaddlast;
                noaddlast=addlast;
                addlast=t+nums[i];
            }else{
                noaddlast=addlast;
            }
        }
        return addlast>temp?addlast:temp;
    }
}
