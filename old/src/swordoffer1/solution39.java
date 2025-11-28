package swordoffer1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Hs
 * @Date 2021/10/25 22:25
 */

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 思路：1.HashMap存储每个数的个数 时间复杂度：O(n) 空间复杂度:O(n)
 *      2.先排序，取length/2     时间复杂度：O(nlogn) 空间复杂度:O(logn)
 *      3.随机化 时间复杂度:O(n) 空间复杂度:O(1)
 *      4.投票法 时间复杂度:O(n) 空间复杂度:O(1)
 */
public class solution39 {
        public int majorityElement(int[] nums) {

            /**
             * 使用HashMap存储
             */
            //Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
            //int length=nums.length/2;
            //int result=0;
            //for (int num : nums) {
            //    if (!counts.containsKey(num)) {
            //        counts.put(num, 1);
            //        result=num;
            //    } else {
            //        int t=counts.get(num)+1 ;
            //        if(t>length) return num;
            //        counts.put(num, t);
            //    }
            //}
            //return result;

            /**
             * 进行排序，第length/2位必定是该数
             */
            //Arrays.sort(nums);
            //return nums[nums.length/2];


            /**
             * 随机化   随机取一位下标并验证是否是众数，由于一半以上的数都是众数，所以取得众数的几率很大
             * 时间复杂度：最坏的情况下可能是无穷，但是在期望下，为O(n)
             * 空间复杂度：O(1)
             */
            //Random random=new Random();
            //int length=nums.length/2;
            //
            //while (true){
            //    int rand = random.nextInt(nums.length);
            //    if (check(nums[rand],nums)>length) return nums[rand];
            //}

            /**
             * Boyer-Moore 投票算法
             * 遍历数组，将遇到的第一个数存入candidate(候选人),然后将与他不同的数都看作-1，将他看作1
             * 每遇见一个和他相同的数count都加1，遇到和它不同的数都-1；当count==0时，candidate等于下一个遇到的数
             *
             */
            int candidate=0;
            int count=0;
            for(int num:nums){
                if(count==0){
                    candidate=num;
                }
                count+=candidate==num?1:-1;
            }
            return candidate;
        }


        int check(int rand,int[] nums){
        int count=0;
        for (int num :
                nums) {
            if (num == rand) count++;
        }
        return count;
    }
}
