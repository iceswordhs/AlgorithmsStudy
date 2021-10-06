package swordoffer1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class solution3 {
//    public int findRepeatNumber(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        for(int i:nums){
//            if(set.contains(i)) return i;
//            set.add(i);
//        }
//        return -1;
//    }
        public int findRepeatNumber(int[] nums) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==i){

                }else if(nums[nums[i]]==nums[i]){//如果nums[i]!=i，那就看一看nums[i]对应的位置上是否有num[i]
                    return nums[i];
                }else {//交换nums[i]和nums[nums[i]]的值，使原本nums[nums[i]]的值与其索引相等
                    int temp=nums[i];
                    nums[i]=nums[nums[i]];
                    nums[temp]=temp;
                }
            }
            return -1;
        }
}
