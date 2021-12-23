package shieryue12.Dec_23;

/**
 * @author Hs
 * @Date 2021/12/23 20:41
 */

import java.util.*;

/**
 * 给定一个整数数组 nums 和一个整数 k ，请返回其中出现频率前 k 高的元素。可以按 任意顺序 返回答案。
 *
 * 思路：优先队列  看到前k个就想到优先队列，而看到重复数字及数字频率，就想到hashmap
 *
 */
public class offer2_60 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<IntNums> priorityQueue = new PriorityQueue<>((o1,o2)->o2.intNum-o1.intNum);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }

        }

        Set<Integer> integers = map.keySet();
        integers.forEach(integer -> {
            priorityQueue.offer(new IntNums(integer,map.get(integer)));
        });
        int[] result=new int[k];
        for (int i=0;i< k;i++){
            result[i]=priorityQueue.poll().intValue;
        }
        return result;
    }
    class IntNums{

        IntNums(int intValue,int intNum){
            this.intValue=intValue;
            this.intNum=intNum;
        }
        int intValue;
        int intNum;
    }
}
