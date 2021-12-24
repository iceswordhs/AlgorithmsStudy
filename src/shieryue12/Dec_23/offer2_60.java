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
 * 遍历数组，使用hashmap统计数字个数
 * 使用map的entrySet方法获取键值对集合并遍历
 * 将数字及数字个数放入优先队列中
 *
 */
public class offer2_60 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1,o2)->o2[1]-o1[1]);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        // Set<Integer> integers = map.keySet();
        // integers.forEach(integer -> {
        //     priorityQueue.offer(new IntNums(integer,map.get(integer)));
        // });


        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            int num = entry.getKey(), count = entry.getValue();
            priorityQueue.offer(new int[]{num,count});

            // if (priorityQueue.size() == k) {
            //     if (priorityQueue.peek()[1] < count) {
            //         priorityQueue.poll();
            //         priorityQueue.offer(new int[]{num, count});
            //     }
            // } else {
            //     priorityQueue.offer(new int[]{num, count});
            // }
        }

        int[] result=new int[k];
        for (int i=0;i< k;i++){
            result[i]=priorityQueue.poll()[0];
        }
        return result;
    }
}
