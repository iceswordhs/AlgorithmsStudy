package shiyiyue11.Nov_20;

/**
 * @author Hs
 * @Date 2021/11/20 17:38
 */

import java.util.Arrays;
import java.util.HashMap;

/**
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。
 *
 * 现在，给你一个整数数组 nums ，请你在所有可能的子序列中找到最长的和谐子序列的长度。
 *
 * 数组的子序列是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
 *
 * 思路1：先排序 然后滑动窗口，即记录前一个数出现的次数，如果后一个数与前一个数差1，就用后一个数出现的次数加上前一个数出现的次数，判断是否是最大值
 *       时间复杂度 O(nlogn)
 * 思路2：用hashmap记录每个数出现的次数，遍历hashmap的Key集合，如果存在当前键+1的值，判断当前键+比它大1的键的数量是否是最大值
 *       时间复杂度 O(n)
 */
public class leetcode_594 {
    // 思路1 排序+滑动数组
    //public int findLHS(int[] nums) {
    //    Arrays.sort(nums);
    //    int max=0,front=0,corrent=0,frontcount=0;
    //    boolean flag=false;
    //    for(int i=0;i<nums.length;i++){
    //        corrent=nums[i];
    //        int t=1;
    //        while(i+1<nums.length&&nums[i+1]==nums[i]){
    //            i++;
    //            t++;
    //        }
    //        if(flag&&(corrent-front)==1){
    //            if(frontcount+t>max) max=frontcount+t;
    //        }
    //        front=corrent;
    //        frontcount=t;
    //        flag=true;
    //    }
    //    return max;
    //}
    // 思路2 使用hashmap
    public int findLHS(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.containsKey(i+1)){
                if(map.get(i)+map.get(i+1)>max) max=map.get(i)+map.get(i+1);
            }
        }
        return max;
    }
}
